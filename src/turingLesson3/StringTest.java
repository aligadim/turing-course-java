package turingLesson3;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String s = "Hello my dear students. How are you today";

        String s2 = s.toString();
        System.out.println(s2);

        String s3 = s.concat(s2);
        System.out.println(s3);

        String s4 = s.toLowerCase();
        System.out.println(s4);

        String s5 = s.toUpperCase();
        System.out.println(s5);

        String s6 = s.repeat(5);
        System.out.println(s6+ "/n");

        String s7 = s.replace('H','t');
        System.out.println(s7);

        char s8 = s.charAt(6);
        System.out.println(s8);

    }

}
