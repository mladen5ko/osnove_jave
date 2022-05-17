package d16_05_2022;

import java.util.Scanner;

// Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/// / / / /
public class Zadatak4 {
    static void stampanje (int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Unesite N: ");
            int n = s.nextInt();
            System.out.print("Unesite karakter: ");
            String karakter = s.next();

            stampanje(n,karakter);
    }
}
