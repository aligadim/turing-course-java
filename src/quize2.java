import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quize2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən say uzunluğunu alırıq
        System.out.println("Ededin hansi uzunluqda olacagini teyin edin ");
        int count = sc.nextInt();

        Random random = new Random();

        // Random ədədi yaranacaq aralığı hesablayırıq
        int low = (int) Math.pow(10, count - 1); // ən kiçik eded (count sayda rəqəmli)
        int hi = low * 10; // ən böyük eded (count sayda rəqəmli)

        boolean found = false;

        while (!found) { // Dövr istifadəçi düzgün cavab tapana qədər davam edəcək
            // Random ədədini yaradırıq
            int randomNumber = random.nextInt(low, hi);
            String randomNumberString = String.valueOf(randomNumber);

            // Random ədədini konsolda göstəririk
            System.out.println("Random ədəd: " + randomNumberString);

            // İstifadəçidən daxil etdiyi ədədin hər bir rəqəmini alırıq
            System.out.println("Daxil edin: ");
            int[] userInputArray = new int[count];
            for (int i = 0; i < count; i++) {
                userInputArray[i] = sc.nextInt();
            }

            // Random ədədin rəqəmlərini massivə çeviririk
            int[] randomNumberArray = new int[count];
            for (int i = 0; i < count; i++) {
                randomNumberArray[i] = Character.getNumericValue(randomNumberString.charAt(i));
            }

            // Daxil edilən və random ədədləri sıralayırıq (ya da sıralanmış halda müqayisə edirik)
            int partialMatchCount = 0;
            int exactMatchCount = 0;

            // Bütün əlamətləri müqayisə edirik
            for (int i = 0; i < count; i++) {
                if (userInputArray[i] == randomNumberArray[i]) {
                    exactMatchCount++;  // Dəqiq uyğunluq (həm dəyər, həm də mövqe)
                }
                int finalI = i;
                if (Arrays.stream(randomNumberArray).anyMatch(x -> x == userInputArray[finalI])) {
                    partialMatchCount++;  // Yalnız dəyər uyğunluğu
                }
            }

            // Nəticələri çap edirik
            if (exactMatchCount == count) {
                System.out.println("Win");
                found = true; // İstifadəçi tapdısa, dövr bitir
            } else if (partialMatchCount == count) {
                System.out.println("Green " + partialMatchCount);
            } else if (partialMatchCount > 0) {
                System.out.println("Yellov " + partialMatchCount);
            } else {
                System.out.println("Tapilmadi. Yeniden cehd edin.");
            }
        }
    }
}
