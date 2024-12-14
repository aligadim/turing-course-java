package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class exampleClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int i = sc.nextInt();
        int sum = 0;
        while(i!=0){
            int temp=i%10;
            sum = sum+temp;
            i = i/10;
        }
        System.out.println(sum);
        System.out.println("ikinci ededi daxil edin");
        int t = sc.nextInt();

        System.out.println(Sum(t));


        System.out.println("------------------ marge Array-----------");

        int[] arr1 = {1,7,3,0,0,0};
        int[] arr2 = {4,2,6};
        int m = 3;
        int n = 3;
        Arrays.sort(arr1,0,m);
        Arrays.sort(arr2);
        margeArray(arr1,m,arr2,n);
        for (int arr : arr1){
            System.out.print(arr);
        }
    }

    public static int Sum(int m){

        int sum = 0;
        while (m!=0){
            int temp = m%10;
            sum+=temp;
            m/=10;
        }
        return sum;
    }

    public static void margeArray(int[] arr1,int m,int[] arr2,int n){
        int i = m-1;
        int j= n-1;
        int k= m+n-1;

        while (i>=0 && j>=0){
            if(arr1[i] > arr2[j]){
                arr1[k] = arr1[i];
                i--;
            }else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        while (j>=0){
            arr1[k] = arr2[j];
            j--;
            k--;
        }


    }



}
