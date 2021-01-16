public class Water extends Nature{
    public Water(String name, String life) {
        super(name, life);
    }

    public class Tubing {
        public void giveWater() {
            System.out.print("водопроводная вода");
        }
    }

    public String have() {String txt; return txt = "В зеленом городе имелся ";}
    public String use() {String txt; return txt = " из которого использовалась для орошения ";}
}

