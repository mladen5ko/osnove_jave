package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
// Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad,
// ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//Za racunanje sume, nije potrebna petlja!
//
//U projektu kreirati paket za ovaj domaci d13_05_2022 i u njemu klasu Zadatak1.java
// i postavite tekst zadataka u komentaru a zatim commit-ujte promenu i push-ujte
// na github sa porukom “Domaci 13.05.2022 Zadatak 1”
//
//Primer izvrsenja:
//2,4,6,7,4,
//4,2,5,1,4,
//1,4,9,4,5,
//4,8,5,4,7,
//4,4,7,4,1,
//Unesite poziciju: 12
//Suma je 27
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        int polje = 5;
        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(4);
        brojevi.add(4);
        brojevi.add(2);
        brojevi.add(5);
        brojevi.add(1);
        brojevi.add(4);
        brojevi.add(1);
        brojevi.add(4);
        brojevi.add(9);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(4);
        brojevi.add(8);
        brojevi.add(5);
        brojevi.add(4);
        brojevi.add(7);
        brojevi.add(4);
        brojevi.add(4);
        brojevi.add(7);
        brojevi.add(4);
        brojevi.add(1);
        int suma = 0;

        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i) + ", ");
            if (i % polje == 4) {
                System.out.println();
            }
        }
       System.out.print("Unesite poziciju (0 - 24): ");
       int pozicija = s.nextInt();

        for (int i = 0; i < polje * polje; i++) {
            //gore levo
            if (pozicija == 0){
                suma = brojevi.get(pozicija) +brojevi.get(pozicija + 1) +brojevi.get(pozicija + 5);
            //prvi red
            } else if (pozicija > 0 && pozicija < 4) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija + 1) + brojevi.get(pozicija - 1) + brojevi.get(pozicija + 5);
            //gore desno
            }else if (pozicija == 4){
                suma = brojevi.get(pozicija) + brojevi.get(i - 1) + brojevi.get(i + 5);
            //prva kolona
            } else if (pozicija == 5 && pozicija == 10 && pozicija == 15) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija - 5) + brojevi.get(pozicija + 1) + brojevi.get(pozicija + 5);
            //poslednja kolona
            } else if (pozicija == 9 && pozicija == 14 && pozicija == 19) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija - 1) + brojevi.get(pozicija - 5) + brojevi.get(pozicija + 5);
            //dole levo
            } else if (pozicija == 20) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija -5) + brojevi.get(pozicija + 1);
            //poslednji red
            } else if (pozicija > 20 && pozicija <24) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija -1) + brojevi.get(pozicija + 1) + brojevi.get(pozicija - 5);
            } else if (pozicija == 24) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija - 1) + brojevi.get(pozicija - 5);
            }else {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija - 1) + brojevi.get(pozicija + 1) + brojevi.get(pozicija - 5) + brojevi.get(pozicija + 5);
            }
        }
        System.out.println("Suma je " + suma);
    }
}
