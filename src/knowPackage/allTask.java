package knowPackage;

import java.util.List;

public class allTask {
    public static void main(String[] args) {
        String word1 = "salam";
        String word2 = "necesiz";
        System.out.println(mergeAlternately(word1, word2));
        String word = "hello";
        String words = "how old are you";
        System.out.println(mergeAlternately(word, words));

        String str1 = "ABCABCDE";
        String str2 = "ABCAB";
        System.out.println(gcdOfStrings3(str1, str2));


        System.out.println("------------Roman numiral-------------");
        int number = 1994;
        System.out.println("Roman numiral: "+intToRoman(number));

        System.out.println("----------Marge---------------");
        allTask task = new allTask();
        int[] num1 = {1,2,3,4,0,0,0,0};
        int[] num2 = {5,6,7,8};
        int n = 4;
        int m = 4;
       task.marge(num1,n,num2,m);
       for (int num : num1){
           System.out.print(num);
       }
        System.out.println("-------------------------------------");
        System.out.println("---------Remove Element--------------");
        int[] nums = {1,2,3,4,4,2,9,6,4};
        int val = 4;
        System.out.println(removeElement(nums,val));
        System.out.println("---------------------------------------");


        System.out.println("------------Remove Dublicate Element--------");
        int [] nums1 = {1,1,1,3,3,3,2,2,2,5};
         int result = removeDuplicates(nums1);
        System.out.println(result);

        System.out.print("Yenilənmiş massiv: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println("----------------");
        System.out.println("---------Dubilcate Array2--------");
         int [] arr = {1,2,3,4,5,5,4,6,7,3};
         int res = removeDuplicates2(arr);
        System.out.println(res);
        System.out.println("yeni massiv");
        for (int numsArr : arr){
            System.out.println("Dublicate Array: "+numsArr);
        }

        }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder prefix = new StringBuilder();

        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            prefix.append(word1.charAt(i));
            prefix.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
            prefix.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            prefix.append(word2.charAt(j));
            j++;
        }
        return prefix.toString();
    }




    public static String gcdOfStrings2(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gdcLenght = gcd(str1.length(), str2.length());
        return str1.substring(0, gdcLenght);

    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;

    }

    public static String gcdOfStrings3(String str1, String str2) {
        char [] chars1 = str1.toCharArray();
        char [] chars2 = str2.toCharArray();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.min(chars1.length,chars2.length); i++) {
            if(chars1[i] == chars2[i]){
                result.append(chars1[i]);
            }
        }
        return result.toString();

    }

    public static int[] finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int y = 0;

        for (String comand : commands){
            switch (comand){
                case "UP" :
                    y+=1; //Simala hereket etdir
                    break;
                case "DOWN" :
                    y-=1; // Cenuba  Hereket etdir
                    break;
                case "LEFT":
                    x+=1; //Sola hereket etdir
                    break;
                case "Right":
                    x-=1; // Saga  hereket emek
                    break;


            }
        }
        return new int[]{x,y};

    }
       public static String intToRoman(int num) {
      String [] thousands={"","M","MM","MMM"};
      String [] hundres = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
      String [] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
      String [] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

      return thousands[num / 1000]+ hundres[(num % 1000) /100] + tens[(num %100)/10] + units[num % 10];
    }

    public String restoreString(String s, int[] indices) {
      int n = s.length();
      char [] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[indices[i]] = s.charAt(i);

        }
        return String.valueOf(arr);
    }
public static void marge(int[] num1, int n, int [] num2, int m){
        int i = n-1;
        int j = m-1;
        int k = m+n-1;

        while (i>0 && j>=0){
            if(num1[i]>num2[j]){
                num1[k] = num1[i];
                i--;
            }else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
        while (j>=0){
            num1[k] = num2[j];
            k--;
            j--;
        }

  }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0)return 0;

     int j = 0;

        for (int i = 1; i <n ; i++) {
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];

            }
        }
        return j+1;
    }
    public static int removeDuplicates2(int[] nums) {
     int n = nums.length;
        if(n == 0)return 0;
        int j = 0;
        int arr = nums[0];
        for (int i = 1; i < n-1; i++) {
            if(arr>nums[i]){
                arr = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = arr;
                arr = nums[i+1];
            }
            return arr;  
        }

        for (int i = 1; i < n; i++) {
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }

        }
        return j;

    }


}