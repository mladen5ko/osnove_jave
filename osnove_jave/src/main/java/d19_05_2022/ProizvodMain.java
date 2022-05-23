package d19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod telefon = new Proizvod();
        telefon.naziv = "Samsung";
        telefon.tezina = 185;
        telefon.cena = 50000;

        telefon.stampanje();
        double povecanje = telefon.povecajCenu(1000);
        telefon.stampanje();
        double popust = telefon.vratiCenuSaPopustom(10, telefon.cena);
        System.out.println("Cena sa popustom od 10% je " + popust + " din.");
        double cenaPostarine = telefon.racunajPostarinu();
        System.out.println("Postarina iznosi: " + cenaPostarine + " din.");



        System.out.println();
        Proizvod slusalice = new Proizvod();
        slusalice.naziv = "LG";
        slusalice.tezina = 99;
        slusalice.cena = 3500;

        slusalice.stampanje();
        povecanje = slusalice.povecajCenu(500);
        slusalice.stampanje();
        popust = slusalice.vratiCenuSaPopustom(15, slusalice.cena);
        System.out.println("Cena sa popustom od 15% je " + popust + " din.");
        cenaPostarine = slusalice.racunajPostarinu();
        System.out.println("Postarina iznosi: " + cenaPostarine + " din.");
    }
}
