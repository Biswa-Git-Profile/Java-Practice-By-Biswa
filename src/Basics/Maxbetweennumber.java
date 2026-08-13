package Basics;

import java.util.Scanner;

public class Maxbetweennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  how many number");
        int num = sc.nextInt();

        int max = 0;

        for (int i = 1; i <= num; i++) {

            System.out.println("Enter " +i +" number");
            int n = sc.nextInt();

        if (n > max) {
            max = n;
        }}
            System.out.println("The maximum number is " + max);



}}
