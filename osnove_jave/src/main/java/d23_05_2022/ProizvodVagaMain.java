package d23_05_2022;

public class ProizvodVagaMain {
    public static void main(String[] args) {
        Proizvod jabuke = new Proizvod("126548","Jabuka crvena",70);
        Proizvod tresnje = new Proizvod("196303","Tresnja",120);

        Vaga zaJabuku = new Vaga();
        double tezina = 2;
        zaJabuku.setmJedinica("kg");
        zaJabuku.setProizvod(jabuke);
        zaJabuku.stampanje(tezina);

        System.out.println();

        Vaga jabukaUlb = new Vaga();
        tezina = 5;
        jabukaUlb.setmJedinica("lb");
        jabukaUlb.setProizvod(jabuke);
        jabukaUlb.stampanje(tezina);

        System.out.println();

        Vaga tresnjeUKg = new Vaga();
        tezina = 5.5;
        tresnjeUKg.setmJedinica("kg");
        tresnjeUKg.setProizvod(tresnje);
        tresnjeUKg.stampanje(tezina);

        System.out.println();

        Vaga tresnjaUlb = new Vaga();
        tezina = 1;
        tresnjaUlb.setmJedinica("lb");
        tresnjaUlb.setProizvod(tresnje);
        tresnjaUlb.stampanje(tezina);

    }
}
