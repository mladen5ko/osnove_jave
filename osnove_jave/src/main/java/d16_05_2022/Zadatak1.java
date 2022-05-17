package d16_05_2022;

import java.util.Scanner;

//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
public class Zadatak1 {
    static int stampajVrednostZa10Vecu(int broj) {
        return broj + 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = s.nextInt();
        System.out.println("Vrednost veca za 10 je: " + stampajVrednostZa10Vecu(broj));
    }
}

