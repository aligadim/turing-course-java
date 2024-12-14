package OOPClass;

public class OOPTask{
    public String name;
    public int age;

    static int MinAge=20;
 OOPTask(){
    System.out.println("None constructor");
}
   static  {
       System.out.println("static intilaze");
     MinAge =18;

    }
    {
        System.out.println("None static intilaze");
        name = "Jhon";
        age = 44;
    }

 OOPTask(String name){
    System.out.println("constructor that takes one paramatrs");
    this.name = name;
}
OOPTask(String name,int age){
    System.out.println("construktor that takes two paramaters");
    this.name = name;
    this.age = age;
}
}
