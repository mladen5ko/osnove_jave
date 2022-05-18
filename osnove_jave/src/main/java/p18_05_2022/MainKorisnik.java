package p18_05_2022;

public class MainKorisnik {

    public static void main(String[] args) {
        Korisnik m = new Korisnik();
        m.ime = "Milan";
        m.prezime = "Jovanovic";
        m.godine = 27;
        m.email = "milan@gmail.com";
        System.out.println("Ime " + m.ime);
    }
}
