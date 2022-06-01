package d31_05_2022_prvi_zadatak;

public class Osoba {
    protected String punoIme;
    protected String jmbg;
    protected int godRodj;

    public Osoba() {
    }

    public Osoba(String punoIme, String jmbg, int godRodj) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godRodj = godRodj;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodRodj() {
        return godRodj;
    }

    public void setGodRodj(int godRodj) {
        this.godRodj = godRodj;
    }

    public void stampaj(){
        System.out.println("Ime i prezime: " + this.punoIme +  ", jmbg: " + this.jmbg
                + ", godina rodjenja: " + this.godRodj);
    }
}
