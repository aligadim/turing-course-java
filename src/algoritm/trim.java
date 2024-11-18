package algoritm;

public class trim {

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0){
            return "";

        }
        String prefix = strs[0];
        for (int i = 1; i <strs.length ; i++) {
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;

    }

    public static String findString (String[] arts){
        if(arts == null || arts.length==0){
            return "";
        }
        String prefix = arts[0];

        for (int i = 1; i <arts.length ; i++) {
            while (arts[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;

    }


    public static String findPrefix(String [] arm){
        if(arm == null || arm.length == 0){
            return "";
        }

        String prefix = arm[0];
        for (int i = 1; i < arm.length; i++) {
            while (arm[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }

        }
        return prefix;
    }

    public static String findPrefixtwo(String [] pro){
        if(pro == null || pro.length  == 0){
            return "";
        }
        String prefix = pro[0];
        for (int i = 1; i <pro.length ; i++) {
            while (pro[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] cheker = {"flower","flow","flight"};
        System.out.println(findPrefixtwo(cheker));
    }



}
