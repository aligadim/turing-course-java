package knowPackage;

public class allKnow {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,7,3};
        System.out.println(sum(arr));

        int[] nums1 = {1,3,4,3,2,4,1};
        dublicate(nums1);


        int x = 121;
        palondrome(x);


        int m = 1110;
        palindrome2(m);


        int[] arr1 = {2,3,4};
        int [] arr2 = {4,6,7};

        int massiv1 = tamMassiv(arr1);
        int massiv2 = tamMassiv(arr2);
     }

    public static int sum(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void dublicate(int [] nums1){

        for (int i = 0; i < nums1.length; i++) {
            for (int j = i+1; j < nums1.length; j++) {
                if(nums1[i] == nums1[j]){
                    System.out.println("Dublicate Element: "+nums1[i]);
                    break;
                }
            }
        }
    }


    public static void palondrome(int x){
        int a = 0;
        int sum = 0;

        int temp = x;

        while (x>0){
            a = (x%10);
            sum = (sum*10)+a;
            x = x/10;
        }
        if(temp == sum){
            System.out.println("is Palindrome");
        }else{
            System.out.println("not Palindrome");
        }


    }

    public static void palindrome2(int m){
        int sum = 0;
        int n = 0;
        int temp = m;
        while (m>0){
            n = m%10;
            sum = (sum *10)+n;
            m = m/10;
        }
        if(temp == sum){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("not Palindrome");
        }


    }

    public static void palindrome3(int y) {
        int a = 0;
        int sum = 0;
        int temp = y;
        while (y>0){
            a = y % 10;
            sum = (sum*10)+a;
            y = y / 10;
        }
        if(sum == temp){
            System.out.println("Is palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
    public static int tamMassiv(int [] arr){
        StringBuilder app = new StringBuilder();

        for (int num : arr){
            app.append(num);
            System.out.println("Birlesmis ededler: "+app.toString());
        }
        int result = Integer.parseInt(app.toString());


        return result;
    }

}













