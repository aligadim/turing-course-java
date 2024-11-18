package testSalary;

public class MainRunner {
    public static void main(String[] args) {
        Person men = new Person();
        men.age = 20;
        Person sen =new Person();
        sen.age = 36;

        SalaryCalculate calculate = new SalaryCalculate();
        System.out.println(men.salary);
        calculate.calculateSalary(men);
        System.out.println(men.salary);
        System.out.println(sen.salary);
        calculate.calculateSalary(sen);
        System.out.println(sen.salary);


    }
}
