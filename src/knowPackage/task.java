package knowPackage;

public class task {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};

        int sum = twoArraySum(arr1, arr2);

        System.out.println("Birlesmis ededlerin cemi: " + sum);
        int twoSumArray = revorse(sum);
        System.out.println("Revorse: " + twoSumArray);

        int[] arr = {2, 4, 5, 7, 2, 1, 3, 5, 3, 5};
        dublicateElements(arr);

        dublicate2(arr);

        int[] arr3 = {9,4,6,3,4,2,7,3,1,2,3,45,6,7,8,9};

        dublicate3(arr3);


    }

    public static int Array(int[]arr){
        StringBuilder sb = new StringBuilder();

        for(int massiv : arr){
            sb.append(massiv);
        }
        int result = Integer.parseInt(sb.toString());
        return result;
    }

    public static int twoArraySum(int []arr1, int[] arr2){


        int number1 = Array(arr1);
        int number2 = Array(arr2);
        int Sum =  number1 + number2;


        return Sum;
    }

    public static int revorse(int x){

        int sum = 0;
        int m = 0;
        int index = x;
        while (x>0){
            m = x % 10;
            sum = (sum * 10)+m;
            x = x/10;
        }
        return sum;
    }

    public static void dublicateElements(int[] arr){
        int [] dublicates = new int[arr.length];
        int dublicateIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] == arr[j]) {
                    boolean alredyAppend = false;
                    for (int k = 0; k < dublicateIndex; k++) {
                        if(dublicates[k] == arr[i]){
                            alredyAppend = true;
                            break;
                        }

                    }
                    if(!alredyAppend) {
                        dublicates[dublicateIndex++] = arr[i];
                    }
                }


            }

        }
        System.out.println("Tekrarlanan elementler ");
        for (int i = 0; i < dublicateIndex; i++) {
            System.out.println(dublicates[i]+" ");

        }
    }

    public static void dublicate2(int [] massiv){
        int [] dublicate = new int[massiv.length];
        int dublicateIndex = 0;

        for (int i = 0; i < massiv.length; i++) {
            for (int j = i+1; j <massiv.length ; j++) {
                if(massiv[i] == massiv[j]){
                    boolean isAppend = false;
                    for (int k = 0; k < dublicateIndex; k++) {
                        if(dublicate[k] == massiv[i]){
                            isAppend = true;
                            break;
                        }

                    }
                    if(!isAppend){
                        dublicate[dublicateIndex++] = massiv[i];
                    }
                }
            }

        }
        System.out.println("Tekrarlanan ededler: ");
        int temp = 0;
        for (int i = 0; i < dublicateIndex; i++) {
            for (int j = 0; j <j-i ; j++) {
               if(dublicate[j] > dublicate[j+1]){
                   temp = dublicate[j];
                   dublicate[j] = dublicate[j+1];
                   dublicate[j+1] = temp;
               }
            }
            System.out.print(dublicate[i]+" ");

        }
    }
    public static void dublicate3(int [] arr3){
        int [] dublicate = new int[arr3.length];
        int dublicateIndex = 0;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = i+1; j < arr3.length ; j++) {
                if (arr3[i] == arr3[j]){
                    boolean isAppend = false;
                    for (int k = 0; k < dublicateIndex; k++) {
                        if(dublicate[k] == arr3[i]){
                            isAppend = true;
                            break;
                        }
                    }
                    if(!isAppend){
                        dublicate[dublicateIndex++] = arr3[i];
                    }
                }
            }

        }
        System.out.println("Tekrarlanan elementler3: ");
        for (int i = 0; i < dublicateIndex; i++) {
            System.out.print(dublicate[i]+" ");
        }
    }
}
