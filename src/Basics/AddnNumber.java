package Basics;

import java.util.Scanner;

public class AddnNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How Many numbers you want to add");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter " + i + " number");
            int num = sc.nextInt();

            sum = sum + num;
        }

        System.out.println("Total Sum of these " + n + " numbers is " + sum);
    }
}