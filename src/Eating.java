public class Eating extends Nature{
    public Eating(String name, String life) {
        super(name, life);

    }

    static class Vegetables {
        private Veg veg;
        public Vegetables(Veg veg) {
            this.veg = veg;
        }

        enum Veg {
            TURNIPS("репа"),
            RADISHES("редиска"),
            BEETS("свекла"),
            CARROTS("морковка");

            private String kind;
            Veg(String kind) { this.kind = kind;}
        }
    }


}
