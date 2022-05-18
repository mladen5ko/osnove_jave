package test;

import java.util.Scanner;

//Napisati metodu koja vrsi konverziju metara u cm, dm, km. Metoda kao parametre prima vrednost u metrima i
// jedinicu u kojoj treba izvrsiti konverziju i vraca konvertovanu vrednost.
//
//Podsetnik za konverziju jedinica:
//1m = 100 cm
//1m = 10 dm
//1m = 0.001 km
//
//Primer poziva metode
//Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//
//U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.
//
//Primer izvrsenja programa:
//3.5m je 350cm
//3.5m je 35dm
//3.5m je 0.0035km
public class Zadatak4 {
    static double konvertuj(double vrednost, String dimenzija) {
        if (dimenzija.equals("cm")) {
            return vrednost * 100;
        } else if (dimenzija.equals("dm")) {
            return vrednost * 10;
        } else if (dimenzija.equals("km")) {
            return vrednost * 0.001;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost u metrima: ");
        double vrednost = s.nextDouble();
        String dimenzija;
        double rezCm = konvertuj(vrednost, "cm");
        System.out.println(vrednost + "m " + " je " + rezCm + "cm");
        double rezDm = konvertuj(vrednost, "dm");
        System.out.println(vrednost + "m " + " je " + rezDm + "dm");
        double rezKm = konvertuj(vrednost, "km");
        System.out.println(vrednost + "m " + " je " + rezKm + "km");
    }
}
