public class AgeException extends Exception{
    int age;

    public AgeException (String msg, int age) {
        super(msg);
        this.age = age;
    }
}
