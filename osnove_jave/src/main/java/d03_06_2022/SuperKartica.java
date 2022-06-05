package d03_06_2022;

//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)

public class SuperKartica {
    private String brojKartice;
    private String imeVlasnika;
    private int popust;

    public SuperKartica(String brojKartice, String imeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.imeVlasnika = imeVlasnika;
        this.popust = popust;
    }

    public SuperKartica() {
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampaj() {
        System.out.println("Super Kartica");
        System.out.println("br. kartice: " + this.brojKartice + ", vlasnik: " + this.imeVlasnika);
        System.out.println();
    }
}
