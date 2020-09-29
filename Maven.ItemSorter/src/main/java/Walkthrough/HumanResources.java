package Walkthrough;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HumanResources {
    private void printPaymentInfo(IPayable person){
        System.out.println(person.getClass().getSimpleName() + "Should be paid" + person.calculatePay());
    }
    public void paidPerson(IPayable[] people){
        for (IPayable person: people) {
            printPaymentInfo(person);
        }
    }

    public void sortPeopleByIncome(ArrayList<IPayable> people){
        Collections.sort(people, new PeopleComparator());
        for (IPayable peron:people
             ) {
            printPaymentInfo(peron);
        }
    }
    public void issueBadge(Employee[] employees) {
        for (Employee empty : employees) {
            if (empty instanceof SalariedEmployee ){
                System.out.println(empty.printBadge());
                System.out.println(" ");
            }else if (empty instanceof HourlyEmployee ){
                System.out.println(empty.printBadge());
            }else {
                System.out.println("You do not belong here");
            }
        }
    }
}
