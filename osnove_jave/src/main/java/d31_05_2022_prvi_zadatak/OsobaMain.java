package d31_05_2022_prvi_zadatak;

import java.util.ArrayList;
import java.util.Scanner;

public class OsobaMain {
    public static void main(String[] args) {
        Igrac cf = new Igrac("Luis Nazario de Lima Ronaldo","18099765184",
                1976,9, "CF",false);
        Igrac g = new Igrac("Zlatan Ibrahimovic","031098135485",1981,
                11,"Forward",true);

        Trener p = new Trener("Pep Guardiola","18018712354894",1971,
                15, "za igru");

        Trener m = new Trener("Pera Peric","15049842145874",1984,
                10,"pomocni");

        cf.stampaj();
        System.out.println();
        g.stampaj();
        System.out.println();
        p.stampaj();
        System.out.println();
        m.stampaj();

        //Za vezbanje
        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj igraca koji zelite da dodate: ");
        int brojIgraca = s.nextInt();

        for (int i = 0; i < brojIgraca; i++) {
            System.out.println("Igrac " + (i+1));
            System.out.print("Ime: ");
            String ime = s.next();
            System.out.print("Prezime: ");
            String prezime = s.next();
            System.out.print("JMBG: ");
            String jmbg = s.next();
            System.out.print("Godina rodjenja: ");
            int godina = s.nextInt();
            System.out.print("Broj: ");
            int broj = s.nextInt();
            System.out.print("Pozicija igraca: ");
            String pozicija = s.next();
            System.out.print("Da li je kapiten(true/false): ");
            boolean kapiten = s.nextBoolean();

            Igrac x = new Igrac(ime + " " + prezime,jmbg,godina,broj,pozicija,kapiten);
            igraci.add(x);
        }
        System.out.print("Unesite broj trenera koji zelite da dodate: ");
        int brojTrenera = s.nextInt();

        for (int k = 0; k < brojTrenera; k++) {
            System.out.println("Trener " + (k+1));
            System.out.print("Ime: ");
            String ime = s.nextLine();
            System.out.print("Prezime: ");
            String prezime = s.next();
            System.out.print("Unesite jbg: ");
            String jmbg = s.next();
            System.out.print("Godina rodjenja: ");
            int godina = s.nextInt();
            System.out.print("Godine iskustva: ");
            int iskustvo = s.nextInt();
            System.out.print("Tip trenera(timski, pomocni, kondicioni, perosnalni): ");
            String tip = s.next();

            Trener y = new Trener(ime + " " + prezime,jmbg,godina,iskustvo,tip);
            treneri.add(y);
        }
        System.out.println("IGRACI:");
        for (int j = 0; j < brojIgraca; j++) {
            igraci.get(j).stampaj();
        }
        System.out.println("TRENERI:");
        for (int l = 0; l < brojTrenera; l++) {
            treneri.get(l).stampaj();
        }
    }
}
