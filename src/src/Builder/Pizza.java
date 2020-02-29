package Builder;

public class Pizza {
    // parametry podstawowe
    private String składnik;
    private String ciasto;
    private String sos;

    //parametry opcjonalne
    private boolean czyBiała;
    private boolean czyOstra;


    public String getSkładnik() { return składnik; }
    public String getCiasto() { return ciasto; }
    public String getSos() { return sos; }

    public boolean isCzyBiała() { return czyBiała; }
    public boolean isCzyOstra() { return czyOstra; }

    private Pizza(PizzaBuilder builder){
        składnik =builder.składnik;
        ciasto = builder.ciasto;
        sos = builder.sos;
        czyBiała = builder.czyBiała;
        czyOstra = builder.czyOstra;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "składnik='" + składnik + '\'' +
                ", ciasto='" + ciasto + '\'' +
                ", sos='" + sos + '\'' +
                ", czyBiała=" + czyBiała +
                ", czyOstra=" + czyOstra +
                '}';
    }

    //Builder Class
    public static class PizzaBuilder {

        // parametry podstawowe
        private String składnik;
        private String ciasto;
        private String sos;

        //parametry opcjonalne
        private boolean czyBiała;
        private boolean czyOstra;

        public PizzaBuilder setCzyBiała(boolean czyBiała) {
            this.czyBiała = czyBiała;
            return this;
        }

        public PizzaBuilder setCzyOstra(boolean czyOstra) {
            this.czyOstra = czyOstra;
            return this;
        }
        public PizzaBuilder(String składnik, String ciasto, String sos) {
            this.składnik = składnik;
            this.ciasto = ciasto;
            this.sos = sos;

        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
    }

