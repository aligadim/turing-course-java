import java.util.Arrays;

public class task {

    public static void main(String[] args) {
        task t = new task();
        int [] nums = {0,1,2};
        int [] twoRepied = {1,3,5,7,3,5};
        int[] rowSum = {3, 8};
        int[] colSum = {4, 7};

        int [] build = t.buildArray(nums);
        int [] getSnecy = t.getSneakyNumbers(twoRepied);
        int [] connect = t.getConcatenation(nums);

        System.out.println(Arrays.toString(build));
        System.out.println(Arrays.toString(connect));
        System.out.println(Arrays.toString(getSnecy));




    }
    //-----------Tapsiriq - 1 ---------
    public int[] buildArray(int[] nums) {
      int n = nums.length;
      int[] ams = new int[n];
        for (int i = 0; i < n; i++) {
            if(nums[i]>=0 && nums[i] <n) {
                ams[i] = nums[nums[i]];

            }else {
                System.out.println("Xeta: [ "+i+" ] "+nums[i]+" serhedleri asir");
                return new int[] {};
            }
        }
        return ams;

    }
    //-----------Tapsiriq - 2 ---------

    public int[] getConcatenation(int[] nums) {
      int n = nums.length;
      int [] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i]=nums[i];
            ans[i+n] =nums[i];

        }
        return ans;
    }
    //-----------Tapsiriq - 3 ---------
    public int[] getSneakyNumbers(int[] nums) {
        int max = 0;
        for(int num : nums){
            if(num>max){
                max = num;
            }
        }

      int [] ans = new int[max+1];
        int[] temp = new int[2];
        int index = 0;
        for (int num : nums){
            ans[num]++;
        if(ans[num] == 2) {
            temp[index++]=num;
            if(index == 2){
                break;
            }

        }
        }
         return temp;
        }




        }






