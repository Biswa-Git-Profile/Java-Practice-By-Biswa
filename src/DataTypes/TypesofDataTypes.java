package Basics;

public class TypesofDataTypes {

    public static void main(String[] args) {

        // 1. byte
        byte b = 100;

        // 2. short
        short s = 10000;

        // 3. int
        int i = 100000;

        // 4. long
        long l = 10000000000L;

        // 5. float
        float f = 10.5f;

        // 6. double
        double d = 99.99;

        // 7. char
        char c = 'A';

        // 8. boolean
        boolean isJavaEasy = true;

        // Non-primitive / Reference types

        // String
        String name = "Kanha";

        // Array
        int[] numbers = {10, 20, 30};

        // Printing primitive data types
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaEasy);

        // Printing non-primitive data types
        System.out.println("String: " + name);
        System.out.println("Array first element: " + numbers[0]);
    }
}