public class Street extends City {
    public Street(String name, Building building) {
        super(name, building);
    }
    @Override
    public void Cond() {
        System.out.println("Напишу");
    }

    @Override
    public void Adj() {
        System.out.println("");
    }

    @Override
    public void Verb() {
        System.out.println("");
    }

    public String stretch() {String txt; return txt = ", по обеим сторонам которой тянулись ";}
    public String has() {String txt; return txt = "Кроме того, перед каждым домом имелся ";}
}
