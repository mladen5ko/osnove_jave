package d18_05_2022;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod s = new Proizvod();
        s.naziv = "Smoki";
        s.cena = 50;
        s.tezina = 75;
        s.stampanje();

        Proizvod j = new Proizvod();
        j.naziv = "Jaffa";
        j.cena = 95;
        j.tezina = 100;
        j.stampanje();

    }
}
