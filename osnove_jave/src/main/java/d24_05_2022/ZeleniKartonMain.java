package d24_05_2022;

import p24_05_2022.Sastojak;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
        for (int i = 0; i < 10; i++) {
            ZeleniKarton prvi = new ZeleniKarton();
            System.out.print("Unesite ime predmeta: ");
            String predmet = s.next();
            System.out.print("Unesite ime profesora: ");
            String profesor = s.next();
            System.out.print("Unesite ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton x = new ZeleniKarton("Mladen Petkovic", 1022, predmet, profesor, ocena);
            ispiti.add(x);

        }
        double suma = 0;
        double prosek = 0;
        double suma2 = 0;
        double prosek2 = 0;
        int counter = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampanje();
            //za vezbanje:
            suma = suma + ispiti.get(i).getOcena();
            prosek = suma / ispiti.size();

            if (ispiti.get(i).polozenIspit(ispiti.get(i).getOcena()) == true) {
                suma2 = suma2 + ispiti.get(i).getOcena();
                counter++;
                prosek2 = suma2 / counter;
            }
        }
        System.out.println("Prosecna ocena je " + prosek);
        System.out.println("Prosecna ocena polozenih ispita je " + prosek2);
    }
}
