package knowPackage;

import java.util.Arrays;

import static knowPackage.task.Array;

public class reapiedTask {
    public static void main(String[] args) {
        int[] number1 ={1,3,5};
        int [] number2 = {4,6,8};
        System.out.println(twoArraySum(number1,number2));
        int sum = twoArraySum(number1,number2);
        System.out.println(revorse(sum));



    }

    public static int concatMassiv(int[] x){
        StringBuilder sb = new StringBuilder();
        for (int arr : x){
            sb.append(arr);
        }
        int resulut = Integer.parseInt(sb.toString());
        return resulut;
    }
    public static int twoArraySum(int[] arr1, int[]arr2){
        int number1 = concatMassiv(arr1);
        int number2 = concatMassiv(arr2);
        int Sum = number1 + number2;
        return Sum;

    }
    public static int revorse(int m){
        int sum = 0;
        int n = 0;
        while (m>0){
            n = m%10;
            sum = (sum * 10)+n;
            m = m/10;
        }
        return sum;
    }
}
