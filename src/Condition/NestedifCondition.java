package Condition;

import java.util.Scanner;

public class NestedifCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
       System.out.println("Enter your Id");
       boolean HaveId=input.nextBoolean();
        if (age >= 18) {
            if (HaveId){
                System.out.println("You are illigible for Entry");
            }
        }
    }
}
