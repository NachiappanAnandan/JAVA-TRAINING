package Day1;

//investment and loss

public class Investment_ex27 {
    public static void main(String[] args) {
        int Amount = 14000;
        
        //year 1
        Amount+=findProfit(40, Amount);
        
        //year2
        Amount-=1500;
        //year3
        Amount+=findProfit(12, Amount);
        System.out.println(Amount);

    }
    public  static int findProfit(int percent , int amt){
        return (percent*amt)/100;
    }
    
}
