package d02_06_2022;

//Kreirati klasu Sektor koja ima:
// naziv sektora
// platu koja je za taj sektor

public class Sektor {
    private String naziv;
    private double plataSektora;

    public Sektor(String naziv, double plataSektora) {
        this.naziv = naziv;
        this.plataSektora = plataSektora;
    }

    public Sektor() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getPlataSektora() {
        return plataSektora;
    }

    public void setPlataSektora(double plataSektora) {
        this.plataSektora = plataSektora;
    }
}
