package p16_05_2022;

import java.util.Scanner;

// Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
// Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju
// sa razlicitim prosledjenim vrednostima.
public class zadatak4 {
    static void operacije(int a, int b) {
        System.out.println("Zbir je " + (a+b) +", Razlika je " + (a - b) +", Proizvod je :" +  (a * b)
        +", Kolicnik je " + (a / b));
    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Unesite prvi broj: ");
            int a = s.nextInt();
            System.out.print("Unesite prvi broj: ");
            int b = s.nextInt();
            operacije(a,b);
    }
}
