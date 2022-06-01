package d31_05_2022_za_vezbanje;

public class IgracMain {
    public static void main(String[] args) {
        Igrac m = new Igrac("Mladen Petkovic", "324902389471234", 1991,
                10,"napadac",true);

        m.dodajKarton(new Karton("zuti"));
        m.dodajKarton(new Karton("zuti"));
        m.dodajKarton(new Karton("crveni"));
        m.stampaj();
    }
}
