package knowPackage;

public class romanNumber {
    public static void main(String[] args) {
     int  number = 3828;
        System.out.println("Roman number: "+romanNumber(number));
    }

    public static String romanNumber(int num){
        String [] thousands = {"","M","MM","MMM"};
        String [] hundres = {"","C","CC","CCC","CD","D","DCC","DCCC","CM"};
        String [] tens = {"","X","XX","XXX","XL","LX","LXX","LXXX","XC"};
        String [] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        return thousands[num / 1000] + hundres[(num%1000)/100] + tens[(num % 100) /10] +units[num %10];
    }
}
