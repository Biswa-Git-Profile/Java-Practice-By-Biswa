package Basics;

import java.util.Scanner;

public class printsimpleintrest {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principle ");
        int p = input.nextInt();

        System.out.println("Enter Rate ");
        int r = input.nextInt();

        System.out.println("Enter Time ");
        int t = input.nextInt();

        double si=p*t*r/100;


        System.out.println("The simple intrest is "+si);
    }
}
