package fibanaco;

import java.util.Arrays;
import java.util.Scanner;

public class test {
  int fib(int c){
      if(c<=0){
          return c;

      }else {
          int a = 1;
          int b = 0;
          for (int i = 0; i < c; i++) {
              int next = a+b;
              a = b;
              b = next;
              System.out.println(i+" . "+b);
          }
          return b;
      }
  }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int m = e.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = e.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
