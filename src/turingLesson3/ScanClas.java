package turingLesson3;

import java.util.Scanner;

public class ScanClas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a- ni daxil edin: ");
        int a = sc.nextInt();
        System.out.print("b- ni daxil edin: ");
        int b = sc.nextInt();
        System.out.print("c ni daxil edin : ");
       int c = sc.nextInt();

        int e = 0;
        if(c==1){
            e=a+b;
            System.out.println(a+" + "+b+" = "+e);
        }else if(c==2){
            e=a-b;
            System.out.println(a+" - "+b+" = "+e);
        }else if(c==3){
            e=a/b;
            System.out.println(a+" / "+b+" = "+e);
        }else if(c==4){
            e=a*b;
            System.out.println(a+" x "+b+" = "+e);
        }else {
            System.out.println("Yalniz 1 den 4 e qeder ededler daxil edin");
        }
//
//        if(c==1){
//            e=a+b;
//            System.out.println(a+" + "+b+" = "+c);
//        }else if(c==2){
//            e=a-b;
//            System.out.println(a+" - "+b+" = "+c);
//        }else if(c==3){
//            c=a/b;
//            System.out.println(a+" / "+b+" = "+c);
//        } else if (c==4) {
//            c=a*b;
//            System.out.println(a+" * "+b+" = "+c);
//        }else{
//            System.out.println("Yalniz 1 den 4-e qeder simvol daxil edin");
//        }
//        switch (c){
//            case 1:
//                c=a+b;
//                System.out.println(a+" + "+b+" = "+c);
//                break;
//            case 2:
//                c=a-b;
//                System.out.println(a+" - "+b+" = "+c);
//                break;
//            case 3:
//                c=a/b;
//                System.out.println(a+" / "+b+" = "+c);
//                break;
//            case 4:
//                c=a*b;
//                System.out.println(a+" * "+b+" = "+c);
//                break;
//            default:
//                System.out.println("Yalniz 1-den 4-e qeder ededler daxil edin");
//        }






    }
}
