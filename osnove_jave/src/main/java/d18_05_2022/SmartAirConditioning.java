package d18_05_2022;
//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu: Proizvoljno :)
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metodu za stampu
public class SmartAirConditioning {
    public String marka;
    public double temperatura;
    public boolean mod;

    public void stampanje() {
        System.out.println(this.marka);
        System.out.println("Trenutna temperatura: " + this.temperatura + " stepeni C");
        System.out.println("Da li klima trenutno hladi: " + mod);
    }

}
