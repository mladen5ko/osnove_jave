package d19_05_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampanje() {
        System.out.println(this.naziv + ", " + this.cena + " din, " + this.tezina + "g");
    }

    public double povecajCenu(double povecanje) {
        return cena = cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popust, double cena) {
        return cena - (cena * (popust / 100));
    }

    public double racunajPostarinu() {
        if (this.tezina <= 100) {
            return 200;
        } else if (this.tezina > 100 && this.tezina <= 500) {
            return 400;
        } else {
            return 1000;
        }
    }
}

