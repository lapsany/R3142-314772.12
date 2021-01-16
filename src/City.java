public class City implements Tools, Condition{
    private String name;
    private Building building;

    public City (String name, Building building) {
        this.name = name;
        this.building = building;
    }
    @Override
    public String toString() {
        return "City{" + "name='" + name + '}';
    }

    public enum Building {
        STREET("улица"),
        YARD("двор"),
        HOUSE("дом"),
        CITY("город");

        private String where;
        Building(String where) { this.where = where;}
        public String getBuilding() {return where;}
    }

    public String getName() {return name;}

    public void Cond() {
        System.out.println("Состояние");
    }
    public void Adj() {
        System.out.println("Прилагательное");
    }
    public void Verb() {
        System.out.println("Глагол");
    }

    public String named() {String txt; return txt = " назывался ";}
    public String work() {String txt; return txt = " Во всех дворах работали ";}
}

