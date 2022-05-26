package d24_05_2022;
//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//        konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//        Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//
//        U glavnoj klasi:
//        kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

public class ZeleniKarton {
    private String punoIme;
    private int brIndeksa;
    private String predmet;
    private String imeProfesora;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String punoIme, int brIndeksa, String predmet, String imeProfesora, int ocena) {
        this.punoIme = punoIme;
        this.brIndeksa = brIndeksa;
        this.predmet = predmet;
        this.imeProfesora = imeProfesora;
        this.ocena = ocena;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean polozenIspit(int ocena){
        if (ocena > 5){
            return true;
        }
        return false;
    }

    public void stampanje (){
        System.out.println(this.predmet + " - " + this.ocena);
        System.out.println("Student: " + this.punoIme + ", br. indeksa " + this.brIndeksa);
        System.out.println("Profesor: " + this.imeProfesora);
        System.out.println();
    }
}
