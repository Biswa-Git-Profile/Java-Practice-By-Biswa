package Pattern;

public class SolidRambosPattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {//For Row

            // spaces
            for (int j = 1; j <= 5 - i; j++) {//Part 1 (Decrese Value Than row)
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= 5; k++) {//Part 2 Same as row value
                System.out.print("* ");
            }

            // next row
            System.out.println();
        }
    }
}