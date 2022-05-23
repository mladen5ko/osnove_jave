package d18_05_2022;

public class Proizvod {
    public String naziv;
    public int cena;
    public double tezina;

    public void stampanje(){
        System.out.println(this.naziv + ", " + this.cena + "din, " + this.tezina + "g");
    }
}
