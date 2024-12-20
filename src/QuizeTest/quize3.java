package QuizeTest;

import java.util.Locale;

public class quize3 {
    public static void main(String[] args) {
        int [] array = {4,8,-15,6,5,-4,6,-7};
        int temp = array[0];
        int num = array[0];
        for (int element : array){
            if(element<temp){
                num = temp;
                temp = element;
            }else if (element <num){
                num = element;
            }
        }
        System.out.println(num);


      String name = "Osman";
      name = name.toUpperCase();
        System.out.println(name.toLowerCase());
        System.out.println(name);

        String surname = "Afandiyev";
        surname = surname.replace('a','u');
        surname = surname.toUpperCase();
        System.out.println(surname.indexOf('V'));
        System.out.println(surname.charAt(2));

        Cricle cricle = new Cricle(5.0);
        System.out.println(cricle.getDiametrs());


      Counter c1 = new Counter();
      Counter c2 = new Counter();
        System.out.println(Counter.counter);


        Car car = new Car();
        System.out.println(car.drive());
         car.useHeron();
    }


}
