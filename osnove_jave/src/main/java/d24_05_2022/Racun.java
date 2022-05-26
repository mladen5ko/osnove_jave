package d24_05_2022;
//Kreirati klasu Racun koja ima:
//broj racuna (npr: 170-289328923-23)
//ime i prezime osobe
//trenutno stanje na racunu (npr: 100, 1220)
//gettere i setter za sve atribute, sem settera za stanje na racunu
//metodu koja menja stanje na racunu za prosledjenu vrednost
// (stanje na racunu ne moze da bude manje od nule)
//metodu koja stampa podatke o racunu u formatu:
//Ime i prezime  -  broj racuna
//stanje na racunu je (trenutno stanje) rsd.
public class Racun {
    private String brRacuna;
    private String punoIme;
    private double trenutnoStanje;

    public Racun() {
    }

    public Racun(String brRacuna, String punoIme, double trenutnoStanje) {
        this.brRacuna = brRacuna;
        this.punoIme = punoIme;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void novoStanjaNaRacunu(double vrednost) {
        this.trenutnoStanje = vrednost;
        if (this.trenutnoStanje < 0) {
            this.trenutnoStanje = 0;
        }
    }

    public void stampanje(){
        System.out.println(this.punoIme + " - " + this.brRacuna);
        System.out.println("Stanje na racunu je " + this.trenutnoStanje + " rsd.");
    }
}