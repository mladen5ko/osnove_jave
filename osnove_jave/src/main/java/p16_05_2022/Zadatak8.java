package p16_05_2022;

//  Napisati metodu koja proverava da li je trougao pravougli.
//  Metoda prima stranice trougla i hipotenuzu trougla.
//  Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//  Trougao je pravougli ukoliko je a*a+b*b=c*c

public class Zadatak8 {
    static boolean PravougliTrougao (int a,int b, int c) {
        if (a*a + b*b == c*c){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
            int a = 2;
            int b = 3;
            int c = 4;
            boolean s = PravougliTrougao(a,b,c);
            System.out.println(s);

    }
}
