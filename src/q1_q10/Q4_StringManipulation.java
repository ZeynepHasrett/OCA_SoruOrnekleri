package q1_q10;

public class Q4_StringManipulation {

    public static void main(String[] args) {

        /*
            Asagidaki kod calistirildiginda output ne olur?
         */

        String str1 = "Java";

        String str2 = new String("java");

        if (str2.equals(str1.toLowerCase())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");

        }

    }

}
