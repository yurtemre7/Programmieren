public abstract class Mensch {
    private int alter;
    private String name;


    public Mensch(int alter, String name){
        this.alter = alter;
        this.name = name;
    }

    abstract void hello();

    int getAlter(){
        return this.alter;
    }

    String getName(){
        return this.name;
    }


}
