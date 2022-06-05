package d02_06_2022;

//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
// override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

public class Menadzer extends Radnik {

    public Menadzer(String punoIme) {
        super(punoIme);
    }

    @Override
    public double plata() {
        double suma = 0;
        for (int i = 0; i < sektori.size(); i++) {
            suma = suma + sektori.get(i).getPlataSektora();
        }
        return suma;
    }
}
