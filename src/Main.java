public class Main {
    public static void main(String[] args) {
       greetings("Arnold");
    }

    public static void greetings(String name) {
        var text = "hello my friend ";
        System.out.println(text + name);
    }
}