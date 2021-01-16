public class House extends City{
    public House(String name, Building building) {
        super(name, building);
    }
    void HODOR() {
        String toDo = "Дверь закрылась.";
        class hold {
            public void getDo() {
                System.out.print(toDo);
            }
        }
        hold obj_hold = new hold();
        obj_hold.getDo();
    }
    @Override
    public void Cond() {
        System.out.println("Что-то");
    }

    @Override
    public void Adj() {
        System.out.print(" с красными и зелеными ");
    }

    @Override
    public void Verb() {
        System.out.println("");
    }

    public String open() {String txt; return txt = " В это время открылась ";}
    public String empty() {String txt; return txt = ".\nКомната мигом опустела. ";}
    public String seen() {String txt; return txt = ". Виделись красивые ";}
    public String size() {String txt; return txt = " размером с дом.";}

    }
