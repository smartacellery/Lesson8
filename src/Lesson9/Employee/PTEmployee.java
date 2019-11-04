package Lesson9.Employee;

public class PTEmployee extends Employee {

    public PTEmployee() {  //constructor not needed
        super();
    }

    @Override
    public double getPay() {
        totalPay += rate * hours;//adding to tatoalPay
        return hours * rate;

    }

}
