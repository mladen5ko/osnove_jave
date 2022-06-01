package d31_05_2022_za_vezbanje;

public class Osoba {
    protected String fullIme;
    protected String jmbg;
    protected int godRodjenja;

    public Osoba() {
    }

    public Osoba(String fullIme, String jmbg, int godRodjenja) {
        this.fullIme = fullIme;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public String getFullIme() {
        return fullIme;
    }

    public void setFullIme(String fullIme) {
        this.fullIme = fullIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void stampaj(){
        System.out.println(this.fullIme + ", " + this.jmbg + ", " + this.godRodjenja);
    }
}
