package q1_q10;

public class Q1_PostIncrement {

    public static void main(String[] args) {

        int num1 = 9;

        int num2 = num1++;

        if (num2 < 10) {
            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + " Hello Universel");
        }

    }

}
