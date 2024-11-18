package turingLesson3;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

//       int number = 5;
//        System.out.println("Multiplication Table for "+number);
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(number+" x "+i+" = "+number*i);
//        }


        Scanner sc = new Scanner(System.in);
        System.out.print("a-ni daxil edin: ");
        int a = sc.nextInt();
        System.out.print("c-ni daxil edin: ");
        int c = sc.nextInt();
        System.out.print("d-ni daxil edin: ");
        int d = sc.nextInt();
        int b  = 0;
        System.out.println("Multiplication table for "+a);
        for (int i = 1; i <=10 ; i++) {
         b = a*i;
            System.out.println(a+" x "+i+" = "+b);
        }
//        Integer e = switch (d){
//            case 1 ->a+c;
//            case 2 ->a-c;
//            case 3 ->a/c;
//            case 4  ->a*c;
//            default -> 0;
//        };
//        System.out.println(e);

    }


}
