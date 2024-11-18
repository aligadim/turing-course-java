package fibanaco;

public class Solution {
    int fib(int n){
        if(n<=0){
            return n;
        }else{
            int a = 0; int b = 1;
            for (int i = 2; i <n ; i++) {
                int next = a+b;
               a = b;
               b = next;

            }
            return b;
        }

    }

    public int isPalindrome(int n){
        int a = n;
        int b = 0;
        while(n>0){
            b = b*10 + n%10;
           n/=10;
        }
      return b;
    }

}
