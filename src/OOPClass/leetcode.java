package OOPClass;

public class leetcode {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String s = gcdOfStrings(str1,str2);
        System.out.println(s);
    }
    public static String gcdOfStrings(String str1, String str2) {
       if(!(str1+str2).equals(str1+str2)){
           return "";
       }
       int temp = temp(str1.length(),str2.length());
       return str1.substring(0,temp);
       
    }

    private static int temp(int a, int b) {
        return b ==0 ? a : temp(b,a%b);
    }

    public static String GDCstring(String str1,String str2){
        if(!(str1+str2).equals(str1+str2)){
            return "";

        }
        int gdcTemp = gdcTemp(str1.length(),str2.length());
        return str1.substring(0,gdcTemp);
    }

    private static int gdcTemp(int a,int b ){
        return b == 0 ? a : gdcTemp(b,a%b);
    }
}
