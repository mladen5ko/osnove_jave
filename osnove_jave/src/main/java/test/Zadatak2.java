package test;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
// Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5,
// niz je sa fiksnim vrednostima tj. ne unosi ih korisnik.
// Program stampa tabelu na ekranu a zatim od korisnika trazi da unese
// kolonu po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje sumu za trazenu kolonu.
public class Zadatak2 {
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
        System.out.print("Unesite kolonu za sumiranje (0 - 4): ");
        int pozicija = s.nextInt();

        for (int i = 0; i < polje * polje; i++) {

            if (pozicija == 0) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija + 5) + brojevi.get(pozicija + 10)
                        + brojevi.get(pozicija + 15) + brojevi.get(pozicija + 20);
            } else if (pozicija == 1) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija + 5) + brojevi.get(pozicija + 10)
                        + brojevi.get(pozicija + 15) + brojevi.get(pozicija + 20);

            } else if (pozicija == 3) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija + 5) + brojevi.get(pozicija + 10)
                        + brojevi.get(pozicija + 15) + brojevi.get(pozicija + 20);
            } else if (pozicija == 4) {
                suma = brojevi.get(pozicija) + brojevi.get(pozicija + 5) + brojevi.get(pozicija + 10)
                        + brojevi.get(pozicija + 15) + brojevi.get(pozicija + 20);
            }
        }
        System.out.println("Suma je " + suma);
    }
}
