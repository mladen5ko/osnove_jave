package p19_05_2022;

public class Auto {
    public String vozac;
    public String automobil;
    public int vrata;
    public double potrosnja;
    public int brzina;
    public String registracija;

    public boolean klima;

    public void stampanje() {
        System.out.println(this.vozac);
        System.out.println(this.automobil + " - " + this.vrata + "-oro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja);
        System.out.println(this.brzina + " km/h je trenutna brzina");


    }

    public boolean prekoracenje(int ogranicenje) {
        if (brzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }


    public int kazna(int ogranicenje) {
        if (brzina > ogranicenje) {
            return (brzina - ogranicenje) * 1000;
        }
        return 0;
    }

    public void gas(){
        brzina = brzina + 10;
    }
    public void koci{
        if (!(brzina - 10 = 0)) {
            brzina = brzina - 10;
        }else {
            brzina = 0;
        }
    }
    public double trenutnaPotrosnja (){
        if (klima){
           return potrosnja= (brzina / 100 * potrosnja) * 1.2;
        }else {
           return potrosnja = brzina / 100 * potrosnja;
        }
    }

}

