package testSalary.company;

public class Person {
    String name;
    int age;
    int yearsWorked;

    public Person(String name, int age, int yearsWorked) {
        this.name = name;
        this.age = age;
        this.yearsWorked = yearsWorked;
    }

    public double calculateSalary(){
        double baseSalary = 200.0;
        int increaseInterval = 10;
        double increaseAmount = 100;

        int incraseCount =yearsWorked / increaseInterval;
        return baseSalary +(increaseAmount * incraseCount);
    }
}
