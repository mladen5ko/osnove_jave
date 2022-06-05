package d02_06_2022;

//U glavnom programu kreirati jednog magacionera i jednog menadzera,
// postaviti sektore u kojima rade i ispisati platu za svakog

public class RadnikSektorMain {
    public static void main(String[] args) {

        Radnik magacioner = new Magacioner("Mile Magacioner");
        magacioner.zaposliUsektor(new Sektor("Magacin", 50000));
        magacioner.zaposliUsektor(new Sektor("sindikat", 3000));

        Radnik menadzer = new Menadzer("Oliver Nedeljkovic");
        menadzer.zaposliUsektor(new Sektor("Uprava", 90000));
        menadzer.zaposliUsektor(new Sektor("Upravni odbor",30000));
        menadzer.zaposliUsektor(new Sektor("menadzment",70000));

        System.out.println("Zaposleni " + magacioner.getPunoIme() + ", ima platu od " + magacioner.plata() + " din");
        System.out.println();
        System.out.println("Zaposleni " + menadzer.getPunoIme() + ", ima platu od " + menadzer.plata() + " din");
    }
}
