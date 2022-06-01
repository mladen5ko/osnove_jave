package d31_05_2022_prvi_zadatak;

public class OsobaMain {
    public static void main(String[] args) {
        Igrac cf = new Igrac("Luis Nazario de Lima Ronaldo","18099765184",
                1976,9, "CF",false);
        Igrac g = new Igrac("Zlatan Ibrahimovic","031098135485",1981,
                11,"Forward",true);

        Trener p = new Trener("Pep Guardiola","18018712354894",1971,
                15, "za igru");

        Trener m = new Trener("Pera Peric","15049842145874",1984,
                10,"pomocni");

        cf.stampaj();
        System.out.println();
        g.stampaj();
        System.out.println();
        p.stampaj();
        System.out.println();
        m.stampaj();
    }
}
