package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost a = new FacebookPost("Mladen Petkoivc", "Pera Peric",
                "Ovo je tekst objave");
        a.brLajkova = 0;
        a.brDeljenja = 0;
        a.like();
        a.dislike();
        a.like();
        a.like();
        a.share();
        a.share();
        a.share();
        a.stampanje();

        System.out.println();
        FacebookPost b = new FacebookPost("Rados Bajic", "RTS",
                "I takoooooooo");
        b.brLajkova = 0;
        b.brDeljenja = 0;
        b.like();
        b.dislike();
        b.like();
        b.like();
        b.dislike();
        b.dislike();
        b.dislike();
        b.dislike();
        b.share();
        b.stampanje();

    }
}
