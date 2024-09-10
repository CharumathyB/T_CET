package Tnsif;
interface Sayable {
    String say(String message);
}

public class Program {

    public static void main(String[] args) {

        Sayable sayable = (message) -> "Hello, " + message;

        System.out.println(sayable.say("World!"));

    }

}