package OOPClass.selfTask;

public class MainRunner {
    public static void main(String[] args) {
        Cat cat = new Cat("Catyonac","green",20);
        cat.eat();
        System.out.println(cat.name);
        System.out.println(cat.color);
        System.out.println(cat.run);

        beard b = new beard("Rio","black",23);
        b.eat();
        System.out.println(b.name);
        System.out.println(b.color);
        System.out.println(b.flying);



    }
}
