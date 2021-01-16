public class Things {
    private String name;
    private Nouns nouns;

    public Things(String name, Nouns nouns) {
        this.name = name;
        this.nouns = nouns;
    }

    public enum Nouns {
        CLOTHES,
        FURNITURE,
        TOOLS;
    }

    public String getThings() {return name;}
    public String put() {String txt; return txt = ", к ней была приставлена ";}
}
