import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class quize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededin hansi uzunluqda olacagini teyin edin ");
        int count = sc.nextInt();

        Random random = new Random();

        int low = (int) Math.pow(10, count-1);
        int hi = low * 10;

        boolean found = false;

        while (!found) {

            int randomNumber = random.nextInt(low, hi);
            String randomNumberString = String.valueOf(randomNumber+" ");

            int[] userInputArray = new int[count];
            for (int i = 0; i < count; i++) {
                userInputArray[i] = sc.nextInt();
            }


            int[] randomNumberArray = new int[count];
            for (int i = 0; i < count; i++) {
                randomNumberArray[i] = Character.getNumericValue(randomNumberString.charAt(i));
            }


            int partialMatchCount = 0;
            int exactMatchCount = 0;

            for (int i = 0; i < count; i++) {
                if (userInputArray[i] == randomNumberArray[i]) {
                    exactMatchCount++;
                }
                int finalI = i;
                if (Arrays.stream(randomNumberArray).allMatch(x -> x == userInputArray[finalI])) {
                    partialMatchCount++;
                }

            }

            if (exactMatchCount == count) {
                System.out.println("Win");
                found = true;
            } else if (partialMatchCount == 0) {
                System.out.println("Green " + partialMatchCount);
            } else if(partialMatchCount > 0){
                System.out.println("Yellov " + partialMatchCount);
            }else {
                System.out.println("Tapilmadi: Yeniden ceht edin...");
            }
        }

    }

    }
















