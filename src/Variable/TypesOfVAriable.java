package Variable;

public class TypesOfVAriable {

    String name = "Kanha";//Instance variable
    static int a = 90;//Static key word

    public static void main(String[] args) {

        double b = 89.88;//Local variable
        TypesOfVAriable obj = new TypesOfVAriable();

        System.out.println(obj.name + " is a Instance variable");
        System.out.println(a + " is a Static variable");
        System.out.println(b + " is a Local variable");
    }
}
