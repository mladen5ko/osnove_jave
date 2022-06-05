package d03_06_2022;

//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
public class Tetrapak extends Ambalaza {
    private boolean reciklira;
    private double cena;

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean reciklira, double cena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.reciklira = reciklira;
        this.cena = cena;
    }

    public Tetrapak() {
        super();
    }

    public boolean isReciklira() {
        return reciklira;
    }


    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public double cenaArtikla() {
        if (isReciklira()) {
            return tezinaPakovanja() * 1.5 + this.cena;
        } else {
            return this.cena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Tetrapak: " + this.naziv);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Tezina tetrapaka je " + this.tezinaPakovanja());
        if (isReciklira()) {
            System.out.println("Ova ambalaza se reciklira.");
        } else {
            System.out.println("Ova ambalaza nije za reciklazu.");
        }
        System.out.println("Cena: " + cenaArtikla());
        System.out.println();
    }

}
