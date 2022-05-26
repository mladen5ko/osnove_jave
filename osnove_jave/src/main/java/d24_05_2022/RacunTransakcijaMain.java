package d24_05_2022;

public class RacunTransakcijaMain {
    public static void main(String[] args) {
        Racun uplatilac = new Racun("354-6684142146-48", "Mladen Petkovic", 500);
        uplatilac.stampanje();
        uplatilac.novoStanjaNaRacunu(15000);
        System.out.println("Novo stanje na racunu:");
        uplatilac.stampanje();
        System.out.println();

        Racun primalac = new Racun("351-684632158-97", "Pera Peric", 1000);
        primalac.stampanje();
        System.out.println();

        Transakcija kupovina = new Transakcija("Kompenzacija :D", uplatilac, primalac);
        kupovina.izvrsiTransakciju(5000);

        kupovina.stampaj();
        System.out.println();
        System.out.println("Stanje nakon transakcije: ");
        uplatilac.stampanje();
        System.out.println();
        primalac.stampanje();


    }
}
