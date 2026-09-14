package com.company;

import java.util.Scanner;

public class Main {
    static float scitaj(float f, int h){
        return f+h;
    }
    static float odcitaj(float f, int h){
        return f-h;
    }
    static float vydel(float f, int h){
        return f/h;
    }
    static float vynasob(float f, int h){
        return f*h;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean x = true;

        while (x) {

            System.out.println("Prve cislo: ");
            int prve = scanner.nextInt();
            System.out.println("Druhe cislo: ");
            int druhe = scanner.nextInt();
            System.out.println("Operacia (1 pre +) (2 pre -) (3 pre /) (4 pre *): ");
            int operacia = scanner.nextInt();

            int a = 1;
            int b  = 2;
            int c = 3;
            int d = 4;

            if (operacia == a) {
                System.out.println("Vysledok je: ");
                float vysledok_scitaj = scitaj(prve,druhe);
                System.out.println(vysledok_scitaj);
            }
            else if (operacia == b) {
                System.out.println("Vysledok je: ");
                float vysledok_odcitaj = odcitaj(prve,druhe);
                System.out.println(vysledok_odcitaj);
            }
            else if (operacia == c) {
                System.out.println("Vysledok je: ");
                float vysledok_delenie = vydel(prve,druhe);
                System.out.println(vysledok_delenie);
            }
            else if (operacia == d) {
                System.out.println("Vysledok je: ");
                float vysledok_nasobenie = vynasob(prve,druhe);
                System.out.println(vysledok_nasobenie);
            }
            else {
                System.out.println("Neexistuje tato operacia");
            }

            scanner.nextLine();

            System.out.println("Zastavit? ano/nie");
            String odpoved = scanner.nextLine();

            if (odpoved.equals("ano")) {
                x = false;
            }
        }

        System.out.println("Kalkulacka bola zastavena.");
    }
}