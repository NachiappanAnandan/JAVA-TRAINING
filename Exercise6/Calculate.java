package Exercise6;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;

import javax.naming.spi.DirStateFactory.Result;

public class Calculate {

    double timeTakeninMins;
    LocalDateTime start;
    LocalDateTime result;
    LocalTime reset ;


    //values to calculate days count
     int daysCount=0;
    double remainingTime=0;


    //constructor 
    Calculate(double speed , double distance ,String Date , String Time){
        timeTakeninMins = (distance/speed)*60;//total minutes taken
   
        start = LocalDateTime.parse(Date+"T"+Time);//time to start
       

        timeTaken(timeTakeninMins , start);
        addDays();
    }


    //get time on 1st day
    public  long subtractTime(LocalDateTime time){

        //final time to subtract
        LocalTime FinalTime = LocalTime.of(23,59,59);

        //calculating subtraction
        Duration between = Duration.between(time.toLocalTime(), FinalTime);

        return between.getSeconds()/60;


    }

    //determine the number of days and last day time
    public  void timeTaken(double totalTime  , LocalDateTime start){
        
        long Day1Time = subtractTime(start);
        // System.out.println("Day 1 minutes :"+remaingMinutes);
        
            //Day1
            // if(Day1Time<=480){
            //     if(Day1Time>=totalTime){
            //         remainingTime=totalTime;
            //     }else{
            //         totalTime-=Day1Time;
            //     }
            //    }else{
            //     totalTime-=480;
            //     daysCount++;
            //    }

            
           if(totalTime<=480){//total time less than 8 hrs
            if(Day1Time>=totalTime){//total time less than day 1 time
                remainingTime=totalTime;
                totalTime=0;
                reset = start.toLocalTime();
            }else{//total time more than day 1 time
                totalTime-=Day1Time;
                daysCount++;
                reset = LocalTime.of(0,0,0);
            }
           }else{//total time greater than 8 hrs
            if(Day1Time<=480){//day1time less than 8 hrs
                totalTime-=remainingTime;
                daysCount++;
                reset = LocalTime.of(0,0,0);
            }
            else{//day1 greater than 8 hrs
                totalTime-=480;
                daysCount++;
                reset = LocalTime.of(0,0,0);
            }
           }


               System.out.println(totalTime);
               for(;totalTime>0;){
                if(totalTime>480){
                    totalTime-=480;
                    daysCount++;
                }else{
                    remainingTime = totalTime;
                    totalTime-=totalTime;
                }
               }
               System.out.println(remainingTime);
               
               
    }

    //get number of week
    public  int getWeekNumber(LocalDate loacalDate){
        ZoneId defaultZoneId = ZoneId.systemDefault();
        java.util.Date date = Date.from(loacalDate.atStartOfDay(defaultZoneId).toInstant());
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        return week;
    }

    //add days using count and last day minutes
    public  void addDays(){


        int weeknumber = getWeekNumber(start.toLocalDate());//getting week number
       
        for(;daysCount>0;){

            if((start.getDayOfMonth() == 1 || start.getDayOfMonth() ==26) && (start.getMonthValue()==1 )){
                System.out.println(start.toLocalDate()+" holiday");
                start =start.plusDays(1);
            }else if(start.getDayOfMonth() == 15 && start.getMonthValue()==8 ){
                System.out.println(start.toLocalDate()+" holiday");
               start =  start.plusDays(1);
            }else if(start.getDayOfWeek().getValue()==7){
                System.out.println("sunday");
                start =  start.plusDays(1);
                weeknumber = getWeekNumber(start.toLocalDate());
            }else if(weeknumber%2==0 && start.getDayOfWeek().getValue()==6){
                System.out.println(start.toLocalDate()+" second saturday");
                start =  start.plusDays(1);
            }
            else{
                System.out.println(start.toLocalDate()+"working");
                start =  start.plusDays(1);
                daysCount--;
            }
            

            
           
        }
       reset =  reset.plusMinutes((long) remainingTime);
       result = LocalDateTime.of(start.toLocalDate(), reset);
    }

    

    
}
