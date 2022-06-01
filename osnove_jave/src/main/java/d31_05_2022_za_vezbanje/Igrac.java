package d31_05_2022_za_vezbanje;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    ArrayList<Karton> kartoni = new ArrayList<>();
    private boolean kapiten;

    public Igrac() {
        super();
    }

    public Igrac(String fullIme, String jmbg, int godRodjenja, int broj, String pozicija, boolean kapiten) {
        super(fullIme, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton karton) {
        kartoni.add(karton);
    }

    public int zutiKartoni() {
        int counter1 = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (kartoni.get(i).getTipKartona().equals("zuti")) {
                counter1++;
            }
        }
        return counter1;
    }

    public int crveniKartoni() {
        int counter2 = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (kartoni.get(i).getTipKartona().equals("crveni")) {
                counter2++;
            }
        }
        return counter2;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj: " + this.broj + ", pozicija: " + this.pozicija);
        if (isKapiten()) {
            System.out.println("Kapiten");
        } else {
            System.out.println("Igrac");
        }
        System.out.println("Broj zutih kartona: " + zutiKartoni());
        System.out.println("Broj crvenih kartona: " + crveniKartoni());

    }
}
