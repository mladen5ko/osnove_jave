package p18_05_2022;

public class MainSlackMessage {
    public static void main(String[] args) {
        SlackMessage korisnik1 = new SlackMessage();
        korisnik1.korisnik = "Mladen Petkovic";
        korisnik1.datumIvreme = "01.08.2021 18:55";
        korisnik1.tekst = "bla bla bla bla";

        SlackMessage korisnik2 = new SlackMessage();
        korisnik2.korisnik = "Rados Bajic";
        korisnik2.datumIvreme = "01.08.2021 20:00";
        korisnik2.tekst = "I takoooooo";

        System.out.println(korisnik1.korisnik + " " + korisnik1.datumIvreme );
        System.out.println(korisnik1.tekst);
        System.out.println("");
        System.out.println(korisnik2.korisnik + " " + korisnik2.datumIvreme );
        System.out.println(korisnik2.tekst);
    }
}
