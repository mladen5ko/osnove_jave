package test;

import java.util.Scanner;

//Napisati program koji simulira notifikaciju za novu verziju aplikacije.
// Korisnik unosi verziju aplikacije koju ima instaliranu na svom racunaru a zatim najnoviju verziju,
// nakon cega se ispisuje notifikacija.
//Verzija aplikacije se sastoji od major i minor broja.
// Aplikacije imaju verziju uglavnom u formatu major.minor i primer bi bio Facebook 2.1 gde je major=2 i minor=1
//Aplikacija je novije verzije ukoliko je:
//major broj veci ili
//ukoliko je major isti, tada nova verzija ima veci minor
//Primer izvrsenja 1:
//Unesite major verziju instalirane aplikacije: 4
//Unesite minor verziju instalirane aplikacije: 5
//(Obasnjenje) Na racunaru je instalirana verzija 4.5
//Unesite major verziju najnovije aplikacije: 4
//Unesite minor verziju najnovije aplikacije: 7
//(Obasnjenje) Najnovija verzija je 4.7.
//Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite major verziju instalirane aplikacije: ");
        int major = s.nextInt();
        System.out.print("Unesite minor verziju instalirane aplikacije: ");
        int minor = s.nextInt();
        System.out.print("Unesite major verziju  najnovije aplikacije: ");
        int majorApp = s.nextInt();
        System.out.print("Unesite minor verziju najnovije aplikacije: ");
        int minorApp = s.nextInt();

        if (major == majorApp && minor == minorApp) {
            System.out.print("Vec imate najnoviju verziju na svom racunaru.");
        } else {
            System.out.println("Nova verzija aplikacije je dostupna za instalaciju.");
        }
    }
}
