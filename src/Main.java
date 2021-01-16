import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args) {
        Human Nez = new Human("Незнайка", 12, Human.Gender.MALE);
        try {
            Nez.SetAge(-5);
        }
        catch (AgeException ex){
            System.out.println("Возникло исключение! " + ex);
        }
        try {
            Nez.thisname("Незнайка");
        }
        catch (NameException ex) {
            ex.getException();
        }

        Anon kids = new Anon() {
            @Override
            public void shorty() {
                System.out.print("малыши");
            }
        };

        System.out.print(Nez.  getHuman() + ". ");
        Human allkids = new Human("Малышки", 0, Human.Gender.SOME);
        Human he = new Human("него", 12, Human.Gender.SOME);
        System.out.println(allkids.getHuman() + allkids.see() + he.getHuman() + " с");
        Emotions amaze = new Emotions("изумлением и ");
        Emotions respect = new Emotions("уважением.");
        House door = new House("дверь", City.Building.HOUSE);
        House room = new House("комнату", City.Building.HOUSE);
        Human snow = new Human("Снежинка", 11, Human.Gender.FEMALE);
        System.out.print(door.open() + door.getName() + ", и в " + room.getName() +
                         snow.run() + snow.getHuman() + ".\n");
        door.HODOR();
        Things mirror = new Things("зеркалу", Things.Nouns.FURNITURE);
        Human she = new Human("она", 0, Human.Gender.FEMALE);
        Things hat = new Things("шляпу", Things.Nouns.CLOTHES);
        System.out.print(she.come() + mirror.getThings() + ", " + she.getHuman() + she.became() + hat.getThings());
        Human all = new Human("Все", 0, Human.Gender.SOME);
        Human neighbors = new Human("соседям", 0, Human.Gender.SOME);
        System.out.print(room.empty() + all.getHuman() + all.went() + neighbors.getHuman() + ".\n");
        Human blue = new Human("Синеглазка", 13, Human.Gender.FEMALE);
        Street street = new Street("улицу", City.Building.STREET);
        Street fence = new Street("заборчики", City.Building.STREET);
        Plants iva = new Plants("ивовых прутьев", "Живая природа");
        System.out.print(blue.getHuman() + ", " + snow.getHuman() +" и " + Nez.getHuman() + Nez.walk() + " " +
                street.getName() + street.stretch() + fence.getName() + iva.iva() + iva.getNature());
        House house = new House("домики", City.Building.HOUSE);
        House roof = new House("крышами", City.Building.HOUSE);
        System.out.print(house.seen() + house.getName());
        Plants apple = new Plants("яблони", "Живая природа");
        Plants plum = new Plants("сливы", "Живая природа");
        Plants pear = new Plants("груши", "Живая природа");
        Plants trees = new Plants("Деревья", "Живая природа");
        Street yards = new Street("дворах", City.Building.YARD);
        roof.Adj();
        System.out.print(roof.getName() + apple.rise() + apple.getNature() + ",\n" + pear.getNature() + " и " +
                         plum.getNature() + ". " + trees.getNature() + trees.grow() + yards.getName() + ".\n");
        City city = new City("Город", City.Building.CITY);
        City greencity = new City("Зеленым городом", City.Building.CITY);
        Things broom = new Things("мётлами", Things.Nouns.TOOLS);
        Street roads = new Street("дорожки", City.Building.STREET);
        System.out.print(city.getName() + city.named() +greencity.getName() + city.work() +
                allkids.getHuman() + allkids.guns() + broom.getThings() + allkids.sweep() + roads.getName() + ". ");
        Water vodoprovod = new Water("водопровод", "Не совсем природа");
        Street fountain = new Street("фонтан", City.Building.STREET);
        Water water = new Water("Вода","Неживая природа");
        House garden = new House("огородов", City.Building.YARD);
        System.out.println(vodoprovod.have() + vodoprovod.getNature() + "." + fountain.has() + "\n" +
                fountain.getName() + ". " + water.getNature() + water.use() + garden.getName() + ", где росли ");
        Eating rep = new Eating("репа", "Живая природа");
        Eating rad = new Eating("редиска", "Живая природа");
        Eating beets = new Eating("свекла", "Живая природа");
        Eating carrot = new Eating("морковка", "Живая природа");
        Things stairs = new Things("лестница",  Things.Nouns.TOOLS);
        System.out.println(rep.getNature() + ", " + rad.getNature() + ", " + beets.getNature() +" и " +
                carrot.getNature() + ". " + Nez.mimo() + apple.getNature() + stairs.put() + stairs.getThings() +
                allkids.seat());
        kids.shorty();
        Human one = new Human("Одна малышка",15, Human.Gender.FEMALE);
        Human other = new Human("другая", 12, Human.Gender.FEMALE);
        House wonder = new House("чудо природы", City.Building.HOUSE);
        Plants green = new Plants("зелёные шары", "неизвестно");
        System.out.print(". " + one.getHuman() + one.saw() + other.getHuman() + other.support() + Nez.getHuman() +
                Nez.seen() + wonder.getName() + " - " + green.getNature() + wonder.size());


    }
}
