package d16_05_2022;

import java.util.Scanner;

//  Napisati metodu koja stampa podatke o korisniku u formatu:
//  JMBG: [jmbg]
//  Ime: [ime]
//  Prezime: [prezime]
//  God. rodjenja: [god]
//  Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
public class Zadatak3 {
    static void korisnik(String jmbg, String ime, String prezime, int god, boolean aktivan){
        System.out.println();
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + god);
        System.out.println("Aktivan: " + aktivan);


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite JMBG: ");
        String  jmbg = s.next();
        System.out.print("Unesite ime: ");
        String  ime = s.next();
        System.out.print("Unesite prezime: ");
        String  prezime = s.next();
        System.out.print("Unesite godinu rodjenja: ");
        int god = s.nextInt();
        System.out.print("Unesite da li je aktivan(true/false): ");
        boolean aktivan = s.nextBoolean();
        korisnik(jmbg,ime,prezime,god,aktivan);
    }
}
