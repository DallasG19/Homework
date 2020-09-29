package Walkthrough;

public class SalariedEmployee extends Employee implements IPayable{
    private double salary;
    public SalariedEmployee(String name, HireDate hireDate) {
        super(name, hireDate);
        this.salary= salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double calculatePay() {
        return getSalary();

    }
}
