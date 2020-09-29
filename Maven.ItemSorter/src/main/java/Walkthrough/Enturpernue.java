package Walkthrough;

public class Enturpernue extends Person implements IPayable{
    private double income;
    public Enturpernue() {
        super();
        this.income =income;
    }

    public double getIncome() {
        return income;
    }


    public double calculatePay() {
        return income;
    }
}
