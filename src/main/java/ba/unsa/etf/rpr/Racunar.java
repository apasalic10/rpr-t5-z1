package ba.unsa.etf.rpr;

public class Racunar {
    private String procesor;
    private String graficka;
    private int ram;
    private String maticna_ploca;
    private String napajanje;

    public Racunar(RacunarBuilder r){
        this.procesor = r.procesor;
        this.graficka = r.graficka;
        this.ram = r.ram;
        this.maticna_ploca = r.maticna_ploca;
        this.napajanje = r.napajanje;
    }

    @Override
    public String toString() {
        return "Racunar{" +
                "procesor='" + procesor + '\'' +
                ", graficka='" + graficka + '\'' +
                ", ram=" + ram +
                ", maticna_ploca='" + maticna_ploca + '\'' +
                ", napajanje='" + napajanje + '\'' +
                '}';
    }

    public static class RacunarBuilder{
        private String procesor;
        private String graficka;
        private int ram;
        private String maticna_ploca;
        private String napajanje;

        public RacunarBuilder setProcesor(String procesor) {
            this.procesor = procesor;
            return this;
        }

        public RacunarBuilder setGraficka(String graficka) {
            this.graficka = graficka;
            return this;
        }

        public RacunarBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public RacunarBuilder setMaticna_ploca(String maticna_ploca) {
            this.maticna_ploca = maticna_ploca;
            return this;
        }

        public RacunarBuilder setNapajanje(String napajanje) {
            this.napajanje = napajanje;
            return this;
        }

        public Racunar build(){
            return new Racunar(this);
        }
    }


}
