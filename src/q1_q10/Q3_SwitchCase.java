package q1_q10;

public class Q3_SwitchCase {

    public static void main(String[] args) {

    /*
        Asagidaki kod blogunun sonucu ne olur?
     */

        final char a = 'A', d = 'd'; // final keyword variable'in son degerini belirler
        char grade = 'B';

        switch (grade){
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }

    }

}
