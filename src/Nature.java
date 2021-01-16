import java.util.Objects;

public abstract class Nature {
    private String name;
    private String life;
    public Nature(String name, String life) {
        this.name = name;
        this.life = life;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Nature)) return false;
        Nature nature = (Nature) obj;
        return Objects.equals(name, life);
    }
    public String getNature() {return name;}
}
