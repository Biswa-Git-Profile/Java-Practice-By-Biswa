package DataTypes;

public class TypeConvertion {
    public static void main(String[] args) {
        int a = 90;
        float b = 89.88f;
        float c = a;//Implicit convertion
        int d = (int) b;//Explicit convertion
        System.out.println(c);
        System.out.println(d);
    }
}
