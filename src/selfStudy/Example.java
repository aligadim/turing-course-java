package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Example {
    public static void main(String[] args) {
      int sum = sumTwoVarible(5,6);
        System.out.println(sum);

        int [] nums= {2,5,6,8,2,3,1,6};
        System.out.println(findingDblicates(nums ));
        System.out.println(cutEdedler(nums));
        bobleShort(nums);
        System.out.println("Siralanmis massiv:");
        for (int num: nums){
            System.out.print(num+ " ");
        }



        int [] mass = {3,5,7,8,2,9,7,5};
        int dublicate = 5;
        System.out.println(maxValue(mass));
        System.out.println(dublicateValue(mass,dublicate));
    }

    public static int sumTwoVarible(int a,int b){
        int c = a + b;
        return c;
    }

    public static List<Integer> findingDblicates(int[] arr){

        HashSet<Integer> seen = new HashSet<>();
        List<Integer> dubilcate = new ArrayList<>();

        for (int num : arr){
            if(seen.contains(num)){
                dubilcate.add(num);
            }else {
                seen.add(num);
            }

        }
        return dubilcate;
    }

    public static  int maxValue(int[] massiv){
        int value = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if(value<massiv[i]){
                value = massiv[i];
            }

        }
        return value;

    }


    public static int cutEdedler(int[] cut){
        int sum = 0;
        for (int i = 0; i < cut.length; i++) {
            if(cut[i]%2 == 0){
                sum+=cut[i];
            }
        }
        return sum;
    }

    public static int dublicateValue(int arr[],int dublicate){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==dublicate){
                count ++;
            }
        }
        return count;
    }

    public static void bobleShort(int[] arr){
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n-1; i++) {
            swapped = false;

            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }

    public static void bubleShort2(int[] arr){
        int n = arr.length;
        boolean spawed = false;

        for (int i = 0; i <n-1 ; i++) {
            spawed = false;

            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    spawed = true;
                }
            }
            if (!spawed){
                break;
            }

        }
    }
}
