package d16_05_2022;
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
// funkcije vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

import java.util.Scanner;

public class Zadatak2 {
    static int novaVrednos(int a, int b) {
        return a*10 + b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int a = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = s.nextInt();
        System.out.println("Nova vrednos je " + novaVrednos(a,b));


    }
}
