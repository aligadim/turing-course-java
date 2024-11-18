package fibanaco;

import java.util.Arrays;
import java.util.Scanner;

public class arrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] m = new int[a];
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1 - i; j++) {
                if(m[j]>m[j+1]){
                    int sum = m[j];
                    m[j] = m[j+1];
                    m[j+1] = sum;
                }

            }

        }
        System.out.println(Arrays.toString(m));

    }
}
