package d03_06_2022;

//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.

public class StaklenaAmbalaza extends Ambalaza {
    private double kaucija;
    private boolean kaucijaSePlaca;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija,
                            boolean kaucijaSePlaca, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.kaucijaSePlaca = kaucijaSePlaca;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza() {
        super();
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isKaucijaSePlaca() {
        return kaucijaSePlaca;
    }

    public void setKaucijaSePlaca(boolean kaucijaSePlaca) {
        this.kaucijaSePlaca = kaucijaSePlaca;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }


    @Override
    public double cenaArtikla() {
        if (isKaucijaSePlaca()) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Staklena ambalaza: " + this.naziv);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Tezina ambalaze je " + this.tezinaPakovanja());
        if (isKaucijaSePlaca()) {
            System.out.println("Kaucija se placa i iznosi " + this.kaucija);
        } else {
            System.out.println("Za ovu ambalazu nije potrebna kaucija");
        }
        System.out.println("Ukupna cena: " + cenaArtikla());
        System.out.println();
    }


}
