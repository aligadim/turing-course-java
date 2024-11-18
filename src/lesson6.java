public class lesson6 {
    public static void main(String[] args) {
        String s1 = "Hello World";

        int index = -1;
        do {
            index = s1.indexOf('l',index+1);
            if(index> -1){
                System.out.println(index);
            }
        }while (index > -1);





        StringBuilder builder = new StringBuilder(34);
        for (int i = 0; i < 10; i++) {
            builder.append("*");
        }
        String s = builder.toString();
        System.out.println(s);


    }
}
