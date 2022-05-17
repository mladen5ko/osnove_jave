package d16_05_2022;

import java.util.Scanner;

//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
public class Zadatak5zaVezbanje {
    static int brojac (int a, int b) {
        int brojac = 0;

        for (int i = a; i < b; i++) {
            brojac ++;
        }
        return brojac - 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int a = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = s.nextInt();
        System.out.println("Izmedju " + a + " i " + b + " ima " + brojac(a,b) + " broja/eva." );
    }
}
