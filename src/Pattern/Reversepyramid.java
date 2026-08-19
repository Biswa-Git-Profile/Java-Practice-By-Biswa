package Pattern;

public class Reversepyramid {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            int k;
            for (k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * 5 - i - (i-1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}