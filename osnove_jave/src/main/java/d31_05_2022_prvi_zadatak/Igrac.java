package d31_05_2022_prvi_zadatak;

public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {
        super();
    }

    public Igrac(String punoIme, String jmbg, int godRodj, int broj, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godRodj);
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
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        if (isKapiten()){
            System.out.println("Kapiten");
        }else {
            System.out.println("Igrac");
        }
    }
}
