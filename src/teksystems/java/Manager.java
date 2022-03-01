package teksystems.java;

public class Manager extends Employee{
    public Manager(){

    }
    public Manager(long id, String Name, String address, long phone, double salary){
        super(id, Name, address, phone);
        this.basicSalary = salary;
    }
    public double calculateTransportAllowance () {
        double transportAllowance = (15d / 100d * basicSalary);
        return transportAllowance;
    }
}
