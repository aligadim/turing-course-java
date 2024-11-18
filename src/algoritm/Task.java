package algoritm;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
        String woods = "Hello teacher";
        int [] nums = {34,23,78};
        int target = 57;
        int [] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));

        System.out.println(lengthOfFirstWord(woods));
        System.out.println(lengthOfLastWord(woods));

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

    }


