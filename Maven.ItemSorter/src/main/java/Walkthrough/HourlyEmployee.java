package Walkthrough;

public class HourlyEmployee extends Employee implements IPayable{
    private int hourlyRate, hourWork;

    public HourlyEmployee(String name, HireDate hireDate) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hourWork = hourWork;
    }


    public double calculatePay() {

        return this.hourlyRate*this.hourWork;
    }
}
