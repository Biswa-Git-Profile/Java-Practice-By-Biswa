package Operators;

public class AllOperatorAreAvailableHere {

    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 20;
        int b = 10;

        System.out.println("----- Arithmetic Operators -----");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


        // 2. Unary Operators
        int x = 5;

        System.out.println("\n----- Unary Operators -----");
        System.out.println("Positive: " + (+x));
        System.out.println("Negative: " + (-x));
        System.out.println("Pre-increment: " + (++x));
        System.out.println("Post-increment: " + (x++));
        System.out.println("Pre-decrement: " + (--x));
        System.out.println("Post-decrement: " + (x--));


        // 3. Assignment Operators
        int c = 10;

        System.out.println("\n----- Assignment Operators -----");
        c += 5;
        System.out.println("c += 5: " + c);

        c -= 2;
        System.out.println("c -= 2: " + c);

        c *= 2;
        System.out.println("c *= 2: " + c);

        c /= 2;
        System.out.println("c /= 2: " + c);

        c %= 5;
        System.out.println("c %= 5: " + c);


        // 4. Relational / Comparison Operators
        int p = 20;
        int q = 10;

        System.out.println("\n----- Relational Operators -----");
        System.out.println("p == q: " + (p == q));
        System.out.println("p != q: " + (p != q));
        System.out.println("p > q: " + (p > q));
        System.out.println("p < q: " + (p < q));
        System.out.println("p >= q: " + (p >= q));
        System.out.println("p <= q: " + (p <= q));


        // 5. Logical Operators
        boolean first = true;
        boolean second = false;

        System.out.println("\n----- Logical Operators -----");
        System.out.println("first && second: " + (first && second));
        System.out.println("first || second: " + (first || second));
        System.out.println("!first: " + (!first));


        // 6. Ternary Operator
        int age = 20;

        System.out.println("\n----- Ternary Operator -----");
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);


        // 7. Bitwise Operators
        int m = 5;
        int n = 3;

        System.out.println("\n----- Bitwise Operators -----");
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
        System.out.println("~m: " + (~m));


        // 8. Shift Operators
        System.out.println("\n----- Shift Operators -----");
        System.out.println("m << 1: " + (m << 1));
        System.out.println("m >> 1: " + (m >> 1));
        System.out.println("m >>> 1: " + (m >>> 1));


        // 9. instanceof Operator
        String name = "Kanha";

        System.out.println("\n----- instanceof Operator -----");
        System.out.println(name instanceof String);


        // 10. Type Casting Operator
        double number = 89.88;
        int convertedNumber = (int) number;

        System.out.println("\n----- Type Casting -----");
        System.out.println("Original: " + number);
        System.out.println("After casting: " + convertedNumber);
    }
}