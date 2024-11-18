package fibanaco;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayClas {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//        arr[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j < n-1-j; j++) {
//                if(arr[0]>arr[i]){
//                    int temp =arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] =temp;
//                }
//
//            }
//            System.out.print(arr[i+1]);


//
//        int max = arr[0];
//        for (int i = 1; i <n ; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//
//        }
//        System.out.println(max);

        Scanner sm = new Scanner(System.in);
        int m = sm.nextInt();
        int[] massiv = new int[m];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = sm.nextInt();
            System.out.print(massiv[i]);

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m -1-i; j++) {
                if(massiv[j]>massiv[j+1]){
                    int sum = massiv[j];
                    massiv[j] = massiv[j+1];
                    massiv[j+1]=sum;


                }

            }

        }
        System.out.println(Arrays.toString(massiv));
    }
}

