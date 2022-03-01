package teksystems.java;

public class Employee {
    protected long employeeId;
    protected String employeeName;
    protected String employeeAddress;
    protected long employeePhone;
    protected double basicSalary;
    protected double specialAllowance = 250.80;
    protected double Hra = 1000.50;

    public Employee(){

    }

    public Employee(long Id, String Name, String address, long phone){
        this.employeeId = Id;
        this.employeeName = Name;
        this.employeeAddress = address;
        this.employeePhone = phone;
    }

    public double calculateSalary(){
        double salary;
        return(basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100));
    }
    public double calculateTransportAllowance () {
        double transportAllowance = (10d / 100d * basicSalary);
        return transportAllowance;
    }
}
