package teksystems.java;

public class Trainee extends Employee{
    public Trainee(){

    }
    public Trainee(long id, String Name, String address, long phone, double salary){
        super(id, Name, address, phone);
        this.basicSalary = salary;
    }
}
