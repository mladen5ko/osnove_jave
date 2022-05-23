package d20_05_2022;
//Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
// Konstruktore:
//difoltni konstuktor
//konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1
public class FacebookPost {
    public String korisnikKojiJeObjavio;
    public String korisnikKodKogaJeObjavljeno;
    public String objava;
    public int brLajkova;
    public int brDeljenja;

    public FacebookPost() {}

    public FacebookPost(String korisnikKojiJeObjavio, String korisnikKodKogaJeObjavljeno, String objava) {
        this.korisnikKojiJeObjavio = korisnikKojiJeObjavio;
        this.korisnikKodKogaJeObjavljeno = korisnikKodKogaJeObjavljeno;
        this.objava = objava;
    }

    public int like() {
        return brLajkova = brLajkova + 1;
    }

    public int dislike() {
        if (brLajkova < 0) {
            return brLajkova = 0;
        } else {
            return brLajkova = brLajkova - 1;
        }
    }

    public int share() {
        return brDeljenja = brDeljenja + 1;
    }

    public void stampanje() {
        System.out.println(korisnikKojiJeObjavio + " >>> " + korisnikKodKogaJeObjavljeno);
        System.out.println(objava);
        System.out.println("Lakes " + brLajkova + " | " + "Shares " + brDeljenja);
    }
}
