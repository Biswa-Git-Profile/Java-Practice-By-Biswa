package Pattern;

public class ColumnwiseAlphabetPrint {
    public static void main(String[] args) {

        for (int a = 1; a <= 5; a++) {

            for (int b = 1; b <= a; b++) {

                if (b == 1) {
                    System.out.print("A ");
                } else if (b == 2) {
                    System.out.print("B ");
                } else if (b == 3) {
                    System.out.print("C ");
                } else if (b == 4) {
                    System.out.print("D ");
                } else if (b == 5) {
                    System.out.print("E ");
                }
            }

            System.out.println();
        }
    }
}