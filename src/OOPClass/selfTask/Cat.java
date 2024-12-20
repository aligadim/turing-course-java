package OOPClass.selfTask;

public class Cat extends Animal {
     int run;

    public Cat(String name, String color,int run) {
        super(name, color);
        this.run = run;
    }
    @Override
    public void eat() {
        System.out.println("Pisikler Sican yeyir");
    }
}
