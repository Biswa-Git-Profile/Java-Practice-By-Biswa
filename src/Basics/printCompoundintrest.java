package Basics;

import java.util.Scanner;

public class printCompoundintrest {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter principle");
        double p=sc.nextDouble();

        System.out.println("Enter interest rate");
        double r=sc.nextDouble();

        System.out.println("Enter number of time");
        double t=sc.nextInt();

        double amount=p*Math.pow((1+r/100),t);
        double ci=amount-p;
        System.out.println("Total Ci ="+ci);
    }
}
