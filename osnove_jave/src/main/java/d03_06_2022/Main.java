package d03_06_2022;

//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko
// Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

public class Main {
    public static void main(String[] args) {
        SuperKartica mladen = new SuperKartica("1234123-13423-23", "Petkovic Mladen", 30);
        Korpa korpa = new Korpa();

        StaklenaAmbalaza kokakola = new StaklenaAmbalaza("1235-21", "Koka-Kola 0.33", 330,
                350, 0, false, 100);
        StaklenaAmbalaza pivo = new StaklenaAmbalaza("1101-1", "Pivo 0,5", 500, 550,
                40, true, 50);

        Tetrapak sokveci = new Tetrapak("100-100", "Sok jabuka 1l", 1000, 1005,
                true, 120);
        Tetrapak sokmanji = new Tetrapak("100-10", "Sok borovnica 0.4", 400, 402,
                true, 70);
        Tetrapak vino = new Tetrapak("123-123", "Niskobudzetno vino", 1000, 1005,
                false, 110);

        korpa.dodajAmbalazu(kokakola);
        korpa.dodajAmbalazu(pivo);
        korpa.dodajAmbalazu(sokveci);
        korpa.dodajAmbalazu(sokmanji);
        korpa.dodajAmbalazu(vino);

        korpa.izbaciAmbalazu("123-123");

        mladen.stampaj();

        for (int i = 0; i < korpa.getAmbalaze().size(); i++) {
            korpa.getAmbalaze().get(i).stampaj();
        }
        System.out.println("Ukupna cena korpe sa popustom je " + korpa.ukupnaCenaKorpe(mladen));

    }
}
