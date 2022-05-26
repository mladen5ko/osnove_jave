package d23_05_2022;
//Kreirati klasu Vaga koja ima:
//merna jedinica (kg ili lb)
//proizvod (proizvod koji se meri)
//TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//default-ni konstuktor
//getteri i setteri za sve atribute
//metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
// Na racunanje cene utice i merna jedinica na koju je vaga podesena.
//metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//   (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
//   Ukupno: (ukupna cena)
public class Vaga {
    private String mJedinica;
    private Proizvod proizvod;

    public String getmJedinica() {
        return mJedinica;
    }

    public void setmJedinica(String mJedinica) {
        this.mJedinica = mJedinica;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double sracunajCenu (double tezina){
        if (mJedinica.equals("kg")){
            return this.proizvod.getCenaKg();
        }else {
            return this.proizvod.getCenaLb();
        }
    }

    public void stampanje(double tezina){
        this.proizvod.stampanje();
        if (mJedinica.equals("kg")) {
           System.out.println("Cena : " + this.proizvod.getCenaKg() + " za " + mJedinica + " x " + tezina + " kg");
       }else {
           System.out.println("Cena: " + this.proizvod.getCenaLb() + " za " + mJedinica + " x " + tezina + " lb");
       }
        System.out.println("Ukupno : " + this.sracunajCenu(tezina) * tezina);
  }

}
