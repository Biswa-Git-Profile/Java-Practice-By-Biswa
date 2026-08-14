package Loops;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of day");
        int num=input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;

        case 2:
        System.out.println("Monday");
        break;

    case 3:
            System.out.println("Tuesday");
                break;

            case 4:
                    System.out.println("Thus Day");
                break;
                default:
                    System.out.println("Invalid Input");
                        }

                        }
}
