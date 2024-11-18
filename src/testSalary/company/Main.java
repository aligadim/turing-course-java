package testSalary.company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ali",34,20);
        double salary = person.calculateSalary();
        System.out.println("Maash: "+salary+" AZN");
    }
}
