package d30_05_2022;
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
public class Ispit {
    private String imePredmeta;
    private int ocena;
    private String profesor;

    public Ispit(String imePredmeta, int ocena, String profesor) {
        this.imePredmeta = imePredmeta;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public Ispit() {
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean polozenIspit(int ocena){
        if (ocena > 5){
            return true;
        }
        return false;
    }

    public void stampanje(){
        System.out.println(this.imePredmeta + " - " + this.profesor + " - " + this.ocena);
    }
}
