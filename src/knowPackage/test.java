package knowPackage;

public class test {
    public static void main(String[] args) {
        int[] massiv1 = {1, 2, 3};
        int[] massiv2 = {3, 4, 5};
        int[] massiv3 = massiv1;
        massiv2[1] = 5;
        massiv3[1] = 4;
        System.out.println(massiv1[1] + " " + massiv2[1] + " " + massiv3[1]);
    }
}
