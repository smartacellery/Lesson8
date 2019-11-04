package Lesson9.Employee;

public class FTEmployee extends Employee {

    public FTEmployee() {  //constructor not needed
        super();
    }

    @Override
    public double getPay() {
        //over 40 hours is overtime
        double pay;
        if (hours <= 40) {
            pay = rate * hours;
        } else {
            pay = 40 * rate + (hours - 40) * rate * 2;
        }
        totalPay += pay;//adding this pay to static total for entire class
        return pay;

    }

}
