package by.it.academy;

public class App {
    static int a = 5;
    static int b = 8;

    public String getGreeting() {
        return "Hello world!";
    }


    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(a + b);
    }
}
