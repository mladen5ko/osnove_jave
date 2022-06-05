package d02_06_2022;

import java.util.ArrayList;

//Kreirati abstraktnu klasu Radnik koja ima:
// ime i prezime
// niz sektora u kojima radi
// abstraktnu metodu koja vraca platu radnika
// metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

public abstract class Radnik {
    protected String punoIme;
    protected ArrayList<Sektor> sektori = new ArrayList<>();

    public Radnik(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }


    public abstract double plata();

    public void zaposliUsektor(Sektor sektor) {
        sektori.add(sektor);
    }

}

