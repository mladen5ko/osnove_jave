package p16_05_2022;
//Napisati metodu koja vraca suprotno negativna broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11
public class Zadatak7 {
    static int suprotnaVrednost(int a) {
        return -a;
    }

    public static void main(String[] args) {
        int a = 10;
        int s = suprotnaVrednost(a);
        System.out.println(s);

    }
}
