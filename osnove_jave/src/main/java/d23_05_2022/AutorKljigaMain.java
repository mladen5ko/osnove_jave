package d23_05_2022;

public class AutorKljigaMain {
    public static void main(String[] args) {

        Autor nusic = new Autor("Branislav", "Nusic");
        Knjiga gospMinist = new Knjiga("123-456-489-548", "Gospodja ministarka", 1929, nusic);
        Knjiga mrDolar = new Knjiga("123-456-489-656", "Mister Dolar", 1932, nusic);

        Autor andric = new Autor("Ivo", "Andric");
        Knjiga naDrini = new Knjiga("123-456-789-845", "Na Drini cuprija", 1945, andric);
        Knjiga avlija = new Knjiga("123-456-789-125", "Prokleta avlija", 1954, andric);

        Autor sergej = new Autor("Sergej", "Trifunovic");
        Knjiga stovariste = new Knjiga("123-456-5-8465", "Stovariste", 2022, sergej);

        gospMinist.stampanje();
        mrDolar.stampanje();
        System.out.println();
        naDrini.stampanje();
        avlija.stampanje();
        System.out.println();
        stovariste.stampanje();

    }
}
