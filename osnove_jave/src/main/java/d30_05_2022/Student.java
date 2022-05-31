package d30_05_2022;

import java.util.ArrayList;

//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
public class Student {
    private String punoIme;
    private int brIndeksa;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student() {
    }

    public Student(String punoIme, int brIndeksa, String tipStudija) {
        this.punoIme = punoIme;
        this.brIndeksa = brIndeksa;
        this.tipStudija = tipStudija;
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

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }

    public double prosek(){
        double prosek = 0;
        double suma = 0;
        double counter = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).polozenIspit(ispiti.get(i).getOcena()) == true) {
                suma = suma + ispiti.get(i).getOcena();
                counter++;
            }
            prosek = suma / counter;
        }
        return prosek;
    }

    public void stapmanje(){
        System.out.println(this.brIndeksa + " - " + this.punoIme + " - " + this.tipStudija);
        System.out.println();
        System.out.println("Predmeti:");
        for (int i = 0; i < ispiti.size(); i++) {
          ispiti.get(i).stampanje();
        }
        System.out.println();
        System.out.println("Prosecna ocena: " + this.prosek());
    }

}
