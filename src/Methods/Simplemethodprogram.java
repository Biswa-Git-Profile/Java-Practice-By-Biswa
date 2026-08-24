package Methods;

public class Simplemethodprogram {
//Method Declaration/Defination
        static void print2table(){
            for (int i = 1; i <=10 ; i++) {
                int ans=2*i;
                System.out.println("-> "+ans);
            }

        }
//        method call
        public static void main(String[] args) {
            print2table();
        }
}