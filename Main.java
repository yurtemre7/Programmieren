import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        for (String string : args) {
            int number = 0;
            try {
                number = Integer.parseInt(string);
            } catch (NumberFormatException e) {
                print(e.toString());
            }
            
            print("Zahl als Int: " + number);
        }

        ArrayList<Integer> klassenkameraden = new ArrayList<Integer>();
        klassenkameraden.add(10);
        print("" + klassenkameraden.get(0));
        print("" + klassenkameraden.contains(10));
        print(klassenkameraden.toString());

    }

    public static void print(String arg) {
        System.out.println(arg);
    }
}
