public abstract class Mensch {
    private int alter;
    private String name;


    public Mensch(int alter, String name){
        this.alter = alter;
        this.name = name;
    }

    void hello(){
        System.out.println("Hallo!");
    }

    int getAlter(){
        return this.alter;
    }

    String getName(){
        return this.name;
    }


}
