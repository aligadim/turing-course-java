package algoritm;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
        String woods = "Hello teacher";
        int [] nums = {34,23,78};
        int target = 57;
        String s = "codeleet";
        int [] arr = {7,6,5,4,3,2,1,0};
        String response = restoreString(s,arr);

        System.out.println("Evvel: ");
        printArray(arr);
        massiv(arr);
        System.out.println("\n Ters massiv");
        printArray(arr);



        int [] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));

        System.out.println(lengthOfFirstWord(woods));
        System.out.println(lengthOfLastWord(woods));
        System.out.println(response);
        System.out.println(Arrays.toString(arr));



        int [] arr1 = {3,5,7,8};
        int [] arr2 = {4,6,3,7};

        int sum = twoMassivSum(arr1, arr2);
        System.out.println("Birlesmios ededler cemi: "+sum);

    }

    public static int lengthOfFirstWord(String s) {
        s = s.trim();
        int conut = 0;
        for (int i =0; i <s.length(); i++) {
            if(s.charAt(i)== ' '){
                break;
            }else {
                conut +=1;
            }
        }
        return conut;
    }


    public static int lengthOfLastWord(String c){

        c = c.trim();

        int lastWord = 0;
        for (int i = c.length()-1; i >=0 ; i--) {
            if(c.charAt(i)==' '){
                break;
            }else {
                lastWord +=1;
            }
        }
        return lastWord;

    }

    public static int[] twoSum(int[] nums, int target) {
    int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
              if(nums[i] +nums[j] == target){
                  return new int[]{i,j};
              }

            }

        }
        return new int[]{};
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomNoteArray = new int[26];
        int[] magzineArray = new int[26];

        for (char a : ransomNote.toCharArray()){
            ransomNoteArray[a - 'a']++;
        }
        
        for (char b : magazine.toCharArray()){
            magzineArray[b - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(ransomNoteArray[i]> magzineArray[i]){
                return false;
            }


        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int [] arr = new int[26];
        for (char ch : ransomNote.toCharArray()){
            int i = magazine.indexOf(ch,arr[ch %26]);
            if (i == -1)return false;
            arr[ch % 26] = i+1;
        }
        return true;
    }

    public static String restoreString(String s, int[] indices) {
     int n = s.length();
     char [] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);
    }


    public static void massiv(int[]arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
    }
    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
    }


    public static int parseInt(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int nums : arr){
            sb.append(nums);

        }
        int result = Integer.parseInt(sb.toString());
        return result;
    }

    public static int twoMassivSum(int[] arr1, int[] arr2){
        int number1 = parseInt(arr1);
        int number2 = parseInt(arr2);
        return number1 + number2;
    }

    }




