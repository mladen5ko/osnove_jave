package d03_06_2022;

//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//kao parametar funkcije se prima Super karticu iz koje se cita popust.

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void dodajAmbalazu(Ambalaza a) {
        ambalaze.add(a);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).getBarkod().equals(barkod)) {
                this.ambalaze.remove(i);
            }
        }
    }

    private double cenaSaPopustom(double popust) {
        double suma = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            suma += ambalaze.get(i).cenaArtikla();
        }
        return suma - popust;
    }

    public double ukupnaCenaKorpe(SuperKartica superKartica) {
        return cenaSaPopustom(superKartica.getPopust());
    }

}
