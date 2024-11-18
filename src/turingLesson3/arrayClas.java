package turingLesson3;

import java.util.Arrays;
import java.util.Random;

public class arrayClas {
    public static void main(String[] args) {
// 5 elementli massiv yaradilmasi
        int [] massiv = new int[5];

//Massive Random ededler daxil edilmesi
        randomMassivValue(massiv);

//Massivin consola cap edilmesi
        printArray(massiv);

//Massivin sortlasmasi
        Arrays.sort(massiv);

//Massivin consola cap edilmesi
        printArray(massiv);

//Massivinb daxilinde hansi ededinse axtarilmasai
        int index = Arrays.binarySearch(massiv,1);
        if(index < 0){
            System.out.println("Tapilmadi... ");
        }else{
            System.out.println("Tapildi "+index);
        }
//Massivin 2 ci elementinin silinmesi
      int[]  myArray = new int[massiv.length - 1];
        for (int i = 0; i < massiv.length; i++) {
            if(i ==2){
                continue;
            }

            if(i>2){
                myArray[i-1] = massiv[i];
            }else {
                myArray[i] = massiv[i];
            }

        }
        printArray(myArray);
    }

   static void randomMassivValue(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(100)+1;
            array[i]=randomNumber;

        }

    }
    static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
