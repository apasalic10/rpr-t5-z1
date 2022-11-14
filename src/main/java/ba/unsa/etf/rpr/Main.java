package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {

        Racunar r = new Racunar.RacunarBuilder().setGraficka("Nvidia").setRam(16).build();
        System.out.println(r);
    }
}