package p16_05_2022;

import java.util.Scanner;

//Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//6 - VI
//7 - VII
//8 - VIII
//9 - IX
//10 - X
//
//Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//Ako se unese VIII vraca se 8.
public class Zadatak9 {
    static int konvertuj(String rimskibroj) {
        if (rimskibroj.equals("I")) {
            return 1;
        }
        if (rimskibroj.equals("II")) {
            return 2;
        }
        if (rimskibroj.equals("III")) {
            return 3;
        }
        if (rimskibroj.equals("IV")) {
            return 4;
        }
        if (rimskibroj.equals("V")) {
            return 5;
        }
        if (rimskibroj.equals("VI")) {
            return 6;
        }
        if (rimskibroj.equals("VII")) {
            return 7;
        }
        if (rimskibroj.equals("VIII")) {
            return 8;
        }
        if (rimskibroj.equals("IX")) {
            return 9;
        }
        if (rimskibroj.equals("X")) {
            return 10;
        }else {
            return 0;
        }
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite rimski broj od I do X: ");
        String rimskibroj = s.next();
        int broj = konvertuj(rimskibroj);
        System.out.println("Rimski broj " + rimskibroj + " je arapski broj " + broj);

    }
}
