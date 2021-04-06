public class Emre extends Mensch {

    public Emre(int alter, String name) {
        super(alter, name);
    }

    void programmieren() {
        System.out.println("Emre programmiert...");

        System.out.println("Programm fertig!");
    }

    @Override
    void hello() {
        System.out.println("Hey du! :^D!");
    }

    
}
