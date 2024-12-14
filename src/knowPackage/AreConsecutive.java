package knowPackage;

import java.util.Arrays;

public class AreConsecutive {
    boolean areConsecutive(int arr[], int n)
    {
        //Sort the array
        Arrays.sort(arr);
        // checking the adjacent elements
        for(int i=1;i<n;i++) {
            if(arr[i]!=arr[i-1]+1) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args)
    {
        AreConsecutive consecutive = new AreConsecutive();
        int arr[] = {5, 2, 3, 1, 4 };
        int n = arr.length;
        if (consecutive.areConsecutive(arr, n) == true)
            System.out.println("Array elements are consecutive");
        else
            System.out.println("Array elements are not consecutive");
    }
}
