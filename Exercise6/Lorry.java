package Exercise6;

import java.util.Scanner;

public class Lorry {
    public static void main(String[] args) {

        double speed, distance;
        

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle:");
        speed = scanner.nextInt();

        System.out.println("Enter the distance to be travelled by the vehicle:");
        distance = scanner.nextInt();

        //Date time input

        String DateInput, timeInput;

        System.out.println("Enter the Start Date in format YYYY-MM-DD:");

        DateInput= scanner.next();

        System.out.println("Enter the start time in format HH:MM:SS: hours from 1 -24::");

        timeInput = scanner.next();


        Calculate calculate = new Calculate(speed , distance, DateInput, timeInput);


        System.out.println("The Vehicle will reach the destination at: " + calculate.result.toLocalDate() + "\nThe earlisest time would be : "+ calculate.result.toLocalTime());

        scanner.close();
        
        

    }

}