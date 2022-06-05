package d02_06_2022;

//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
// ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
// suma plata svih sektor / broj sektora * 0.5
// override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).

public class Magacioner extends Radnik {

    public Magacioner(String punoIme) {
        super(punoIme);
    }

    private double prosecnaPlata() {
        double prosek = 0;
        double suma = 0;
        int counter = 0;
        for (int i = 0; i < sektori.size(); i++) {
            suma = suma + sektori.get(i).getPlataSektora();
            counter ++;
            prosek = suma / counter * 0.5;
        }

        return prosek;
    }


    @Override
    public double plata() {
        double plata = 0;
        for (int i = 0; i < sektori.size(); i++) {
            plata = prosecnaPlata() * (sektori.size()+1);
        }
        return plata;
    }
}
