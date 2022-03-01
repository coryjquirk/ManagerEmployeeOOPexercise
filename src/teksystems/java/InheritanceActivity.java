package teksystems.java;

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager peter1 = new Manager(126534l, "Peter", "Chennai India", 237844l, 65000);
        Trainee jack1 = new Trainee(29846l, "Jack", "Mumbai India", 442085l, 45000);
        Trainee carlos1 = new Trainee(29847l, "Carlos", "Mumbai India", 442089l, 65000);
        System.out.println("Peter (manager) salary: " + peter1.calculateSalary());
        System.out.println("Peter (manager) transport allowance: " + peter1.calculateTransportAllowance());
        System.out.println("Carlos (trainee) transport allowance (same salary as peter): " + carlos1.calculateTransportAllowance());
        System.out.println("Jack (trainee) salary: " + jack1.calculateSalary());
        System.out.println("Jack (trainee) transport allowance: " + jack1.calculateTransportAllowance());
    }
}
