package p16_05_2022;
//Zadatak
//  Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena.
//  U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
//  Primer izvrsenja:
//  Milan Jovanovic
//  Milan Jovanovic
//  Milan Jovanovic
//  Milan Jovanovic
//  Milan Jovanovic
public class Zadatak2 {
    static void printIme() {
        System.out.print("Mladen");
    }
    static void printprezime() {
        System.out.println(" Petkovic");
    }

    public static void main(String[] args) {
        printIme(); printprezime();
        printIme(); printprezime();
        printIme(); printprezime();
        printIme(); printprezime();
        printIme(); printprezime();

    }
}
