package q1_q10;

public class Q2_Ternary {

    public static void main(String[] args) {

        /*
            Asagidaki kod blogu calistirildiginda output ne olur?
         */

        int x = 5;

        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);


        // Verilen bir sayinin tek veya cift oldugunu yazdiran bir kod olusturalim

        int sayi = 20;

        if (sayi % 2 == 0) {
            System.out.println("sayi cift bir sayidir");
        } else {
            System.out.println("sayi tek bir sayidir");
        }

        System.out.println(sayi % 2 == 0 ? "Sayi Cift" : "Sayi Tek");

    }

}
