package OOPClass.selfTask;

public class beard extends Animal{
    int flying;
    public beard(String name, String color,int flying) {
        super(name, color);
        this.flying = flying;
    }
    @Override
    public void eat() {
        System.out.println("Quslar hesarat yeyir");
    }
}
