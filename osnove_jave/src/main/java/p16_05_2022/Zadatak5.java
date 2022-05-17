package p16_05_2022;

import java.util.Scanner;

//Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.
public class Zadatak5 {
    static void apsolutnaVrednost(int a) {
        if (a < 0) {
            System.out.print("Apsolutna vrednost je " + (-a));
        } else {
            System.out.println("Apsolutna vrednost je " + a);;
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int a = s.nextInt();
        apsolutnaVrednost(a);

    }
}
