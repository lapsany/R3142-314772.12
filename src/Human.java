import java.util.Objects;

public class Human{
    private String name;
    private int age;
    private Gender gender;

    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public enum Gender {
        MALE,
        FEMALE,
        SOME
    }

    public String getHuman() {return name;}
    public int getAge() {return age;}
    public void SetAge(int age) throws AgeException {
        if (age < 0)
            throw new AgeException("отрицательный возраст.", age);
        else
            this.age = age;
    }

    public void thisname(String name){
        if (name == " ") throw new NameException("Некорректное имя");
        System.out.print("Этого коротышку зовут ");
    }

    @Override
    public int hashCode() {return Objects.hash(name, age, gender);}

    public String see() {String txt; return txt = " смотрели на ";}
    public String run() {String txt; return txt = " вбежала ";}
    public String come() {String txt; return txt = " Подбежав к ";}
    public String became() {String txt; return txt = " стала надевать ";}
    public String went() {String txt; return txt = " ушли рассказывать новость ";}
    public String walk() {String txt; return txt = " вышли на ";}
    public String guns() {String txt; return txt = ".\nВооружившись ";}
    public String sweep() {String txt; return txt = " разметали ";}
    public String mimo() {String txt; return txt = "В это время они проходили мимо ";}
    public String seat() {String txt; return txt = " на которой сидели ";}
    public String saw() {String txt; return txt = " перепиливала черенок дерева, ";}
    public String support() {String txt; return txt = " поддерживала её.\n";}
    public String seen() {String txt; return  txt = " увидел ";}
}
