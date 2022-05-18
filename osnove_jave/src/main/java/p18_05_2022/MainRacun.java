package p18_05_2022;

import java.util.Scanner;

public class MainRacun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Racun prvi = new Racun();
        prvi.brojRacuna = "840-23932-323";
        prvi.ime = "Pera";
        prvi.prezime = "Peric";
        prvi.stanjeRacun = 1000;

        Racun drugi = new Racun();
        drugi.brojRacuna = "432- 432523-324";
        drugi.ime = "Rados";
        drugi.prezime= "Bajic";
        drugi.stanjeRacun = 200;


//        System.out.println("Broj racuna: " + prvi.brojRacuna);
//        System.out.println("Ime i prezime: " + prvi.ime + prvi.prezime);
//        System.out.println("Stanje na racunu: " + prvi.stanjeRacun);
//        System.out.println("");
//        System.out.println("Broj racuna: " + drugi.brojRacuna);
//        System.out.println("Ime i prezime: " + drugi.ime + drugi.prezime);
//        System.out.println("Stanje na racunu: " + drugi.stanjeRacun);
//        System.out.println("");

        System.out.println("Posaljilac: " + prvi.ime+ " " + prvi.prezime + ", "
                + prvi.brojRacuna + ", stanje: " + prvi.stanjeRacun);
        System.out.println("Posaljilac: " + drugi.ime+ " " + drugi.prezime + ", "
                + drugi.brojRacuna + ", stanje: " + drugi.stanjeRacun);
        System.out.println("");
        System.out.print("Unesite sumu za transakciju: ");
        int transakcija = s.nextInt();
        System.out.println("Stanje nakon transakcije:");
        prvi.stanjeRacun = prvi.stanjeRacun - transakcija;
        drugi.stanjeRacun = drugi.stanjeRacun + transakcija;
        System.out.println("Posaljilac: " + prvi.ime+ " " + prvi.prezime + ", "
                + prvi.brojRacuna + ", stanje: " + prvi.stanjeRacun);
        System.out.println("Posaljilac: " + drugi.ime+ " " + drugi.prezime + ", "
                + drugi.brojRacuna + ", stanje: " + drugi.stanjeRacun);
    }
}
