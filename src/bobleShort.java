import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class bobleShort {
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 4, 1, 8, 44, 36, 21,1,4,3,5};
        int n = arr.length;

        boolean swapped = false;

        for (int i = 0; i < n-1; i++) {
            swapped = false;

            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
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
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < n-1; i++) {
            swapped =false;

            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]< arr[j+1]){
                    int min = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = min;
                    swapped = true;

                }
            }
            if(!swapped){
                break;
            }

        }
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);


        int minimum = arr[0];
        int maksimum = arr[0];

        for (int i = 0; i < n; i++) {
            if(arr[i]<minimum){
                minimum = arr[i];

            }
            if(arr[i]>maksimum){
                maksimum = arr[i];
            }

        }
        System.out.println("Minimum: "+minimum+" Maksimum: "+maksimum);


        HashSet<Integer> seen = new HashSet<>();
        List<Integer> massiv = new ArrayList<>();

        for (int num : arr){
          if(seen.contains(num)){
              massiv.add(num);
          }else{
              seen.add(num);
          }
        }
        System.out.println(massiv);


        int cutCount = 0;
        int tekCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                cutCount++;
            } else {
                tekCount++;
            }
        }
         int[] tekArr = new int[tekCount];
         int[] cutArr = new int[cutCount];

         int tekMassiv = 0, cutMassiv = 0;

            for (int j = 0; j < n; j++) {
                if(arr[j] % 2==0){
                    cutArr[cutMassiv++]=arr[j];
                }else {
                    tekArr[tekMassiv++]=arr[j];
                }

            }




        System.out.println("Tek Ededler: "+Arrays.toString(tekArr)+" Cut Ededler: "+Arrays.toString(cutArr));


    }


}
