package d18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
        SmartAirConditioning s = new SmartAirConditioning();
        s.marka = "Samsung";
        s.temperatura = 35;
        s.mod = false;
        s.stampanje();
        System.out.println();
        SmartAirConditioning l = new SmartAirConditioning();
        l.marka = "Samsung";
        l.temperatura = 16;
        l.mod = true;
        l.stampanje();
    }
}
