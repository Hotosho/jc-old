package lesson3;

public class TernaryOperator {
    public static void main(String[] args) {
        int a;
        byte b = 100;

        //a = 500;// if b > 200
        //a = 350;// if b <=200

        //bab solution
        /*if (b > 200)
            a = 500;
        else
            a = 350;*/

        //ternaryOperator
        a = b > 200 ? 500 : 350;
        System.out.println(a);

        a = b > 200 ? b : b - 500;
        System.out.println(a );
    }
}
