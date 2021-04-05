import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stack hanoi = new Stack(5);
        hanoi.push(1);
        hanoi.push(2);
        hanoi.push(3);
        hanoi.push(5);

        hanoi.pop();

        hanoi.printStapel();

    }

    public static void print(String arg) {
        System.out.println(arg);
    }
}
