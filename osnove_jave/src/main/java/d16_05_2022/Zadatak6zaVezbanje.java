package d16_05_2022;
//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

import java.util.Scanner;

public class Zadatak6zaVezbanje {
    static int min (int a, int b, int c) {
        if (a < b && a < c){
            return a;
        } else if (b < a && b < c) {
            return b;
        }else {
            return c;
        }


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int a = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int c = s.nextInt();
        System.out.println("Najmanja vrednost je " + min(a,b,c));
    }
}
