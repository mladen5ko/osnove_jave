package p19_05_2022;

public class AutoMain {

    public static void main(String[] args) {


        Auto prvi = new Auto();
        prvi.vozac = "Mladen Petkovic";
        prvi.automobil = "Ford Mustang";
        prvi.vrata = 3;
        prvi.potrosnja = 50;
        prvi.brzina = 82;
        prvi.registracija = "NI 325 DA"

        Auto drugi = new Auto();
        drugi.vozac = "Pera Peric";
        drugi.automobil = "Audi";
        drugi.vrata = 5;
        drugi.potrosnja = 10;
        drugi.brzina = 75;
        drugi.registracija = "BG 5234 OK"

        int ogranicenje = 80;

        prvi.stampanje();
        System.out.println("Da li je prekoracio  brzinu?");
        int kazna = prvi.kazna(ogranicenje);
        boolean daLiJePrekoracio = prvi.prekoracenje(ogranicenje);
        if (daLiJePrekoracio == true) {
            System.out.println("Prekoracio je brzinu! Kazna je: " + kazna);
        } else {
            System.out.println("Nije prekoracio brzinu. Kazna je: " + kazna);
        }



        System.out.println();

        drugi.stampanje();
        System.out.println("Da li je prekoracio  brzinu?");
        kazna = drugi.kazna(ogranicenje);
        daLiJePrekoracio = drugi.prekoracenje(ogranicenje);
        if (daLiJePrekoracio == true) {
            System.out.println("Prekoracio je brzinu! Kazna je: " + kazna);
        } else {
            System.out.println("Nije prekoracio brzinu. Kazna je: " + kazna);
        }


    }
}
