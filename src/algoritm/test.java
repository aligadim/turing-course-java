package algoritm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {


    public static int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                 arr[0] = i;
                 arr[1] = j;
                 return arr;

                }

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int [] nums = {2,4,5,6};
        int target = 11;
        int [] result = twoSum(nums,target);
        System.out.println("indexler ["+result[0]+" ] ["+result[1]+" ] ");

        System.out.println("-------Nums1 = Nums2 and short----------");
        test t = new test();
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {5,6,7};
        int m = 3;
        int n = 3;
        t.merge(nums1,m,nums2,n);
        for (int num : nums1){
            System.out.println(num);
        }
        System.out.println("------- cut ededler----------");
        int Myarr[] = {1,2,4,5,6,3,7,8,4,5,6,8};
        array2(Myarr);
        System.out.println();
        System.out.println("-------Array Short ---------");

        MyArrayShort(Myarr);

        System.out.println("----------- Min Short--------");
       minSum(Myarr);

        System.out.println("-----------Sneak---------");
        sneak(Myarr);

        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = n+m-1;

        while (i>0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j>=0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }

    }
public static void array2(int [] arr){

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] %2 == 0){
            System.out.print(arr[i]);
        }

    }
}

public static void MyArrayShort(int [] arr){
int n = arr.length;

    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

    }


    System.out.println(Arrays.toString(arr));


}

public static void minSum(int [] arr){
        int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if(arr[j]< arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

    }
    System.out.println(Arrays.toString(arr));
}

public static void sneak(int [] arr){
        int n = arr.length;
        int[] arr1 = new int[n*2];

    for (int i =0; i < n; i++) {
        arr1[i] = arr[i];
        arr1[i+n]= arr[i];

    }
    System.out.println(Arrays.toString(arr1));
}

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

      int i = 0, j = 0;


      while (i<word1.length() && j<word2.length()){
          result.append(word1.charAt(i));
          result.append(word2.charAt(j));
          i++;
          j++;
      }

      while (i<word1.length()){
          result.append(word1.charAt(i));
          i++;
      }
        while (j<word1.length()){
            result.append(word1.charAt(j));
            j++;
        }

        return result.toString();

    }

}
