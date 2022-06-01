package d31_05_2022_prvi_zadatak;

public class Trener extends Osoba{
    private int godIskustva;
    private String tipTrenera;

    public Trener(String punoIme, String jmbg, int godRodj, int godIskustva, String tipTrenera) {
        super(punoIme, jmbg, godRodj);
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodIskustva() {
        return godIskustva;
    }

    public void setGodIskustva(int godIskustva) {
        this.godIskustva = godIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Trener: " + this.tipTrenera);
        System.out.println("Godine iskustva: " + this.godIskustva + " god.");
    }
}
