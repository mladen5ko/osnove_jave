package d24_05_2022;

//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
//privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//ako je prenos sredstava manji od 4500, provizija je fiksna 45
//ako je prenos sredstava veci od 4500, provizija je 1%
//S obzirom da se provizija racuna na osnovu visine transakcije,
// znaci da metoda prima parametar koji predstavlja visinu transakcije
public class Transakcija {
    private String id;
    private Racun uplatilac;
    private Racun primalac;

    public Transakcija(String id, Racun uplatilac, Racun primalac) {
        this.id = id;
        this.uplatilac = uplatilac;
        this.primalac = primalac;
    }

    public Transakcija() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getUplatilac() {
        return uplatilac;
    }

    public void setUplatilac(Racun uplatilac) {
        this.uplatilac = uplatilac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    private double provizija(double transakcija) {
        if (transakcija < 4500) {
            return 45.0;
        } else {
            return transakcija * 0.1;
        }
    }

    public void izvrsiTransakciju(double transakcija) {
        if (this.getUplatilac().getTrenutnoStanje() > transakcija) {
            this.getUplatilac().novoStanjaNaRacunu(
                    this.uplatilac.getTrenutnoStanje() - transakcija - this.provizija(transakcija));
        }
        if (this.getUplatilac().getTrenutnoStanje() > transakcija){
            this.getPrimalac().novoStanjaNaRacunu(this.primalac.getTrenutnoStanje() + transakcija);
        }
        else{
            System.out.println("Na racunu nema dovoljno sredstva za ovu transakciju.");
        }
    }

    public void stampaj() {
        System.out.println("ID transakcije " + this.id);
        System.out.println("Racun sa: " + this.uplatilac.getPunoIme() + " - " + this.uplatilac.getBrRacuna());
        System.out.println("Racun na: " + this.primalac.getPunoIme() + " - " + this.primalac.getBrRacuna());
    }

}
