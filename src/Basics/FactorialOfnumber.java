package Basics;

import java.util.Scanner;

public class FactorialOfnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int n=input.nextInt();
           int fact=1;

        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of The Number Is ="+fact);
    }
}
