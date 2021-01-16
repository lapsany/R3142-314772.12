public class NameException extends RuntimeException{
    private String str;

    public NameException(String str) {
        super(str);
    }

    public void getException() {
        System.out.println("NameException: Некорректное имя.");
    }
}
