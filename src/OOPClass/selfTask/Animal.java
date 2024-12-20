package OOPClass.selfTask;

public class Animal extends AbstractClass {
    String name;
    String color;

    public Animal(String name,String color){
        super();
        this.name = name;
        this.color = color;
    }
    @Override
    public void eat() {
        System.out.println("Heyvanlar yeyir");
    }
}
