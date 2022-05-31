package d30_05_2022;

public class IspitStudentMain {
    public static void main(String[] args) {
        Student mladen = new Student("Mladen Petkovic",1022,"Onsovne studije");

        mladen.dodajIspit(new Ispit("Matematika 1", 7,"Dragisa Dragic"));
        mladen.dodajIspit(new Ispit("Matematika 2", 6,"Dragisa Dragic"));
        mladen.dodajIspit(new Ispit("Matematika 3", 5,"Dragisa Dragic"));
        mladen.dodajIspit(new Ispit("Statika", 9,"Milos Ristic"));
        mladen.dodajIspit(new Ispit("Fizika", 8,"Dragana Mirkovic"));
        mladen.dodajIspit(new Ispit("Dinamika", 7,"Boban Bobanovic"));
        mladen.dodajIspit(new Ispit("Tehnicko crtaje", 10,"Milan Milovanovic"));

        mladen.stapmanje();
    }
}
