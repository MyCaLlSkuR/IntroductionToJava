package training.organization;


public class Junior extends Employee {

    public Junior(String firstName, String lastName, int age, int salary, int manHours){
        super(firstName, lastName, age, salary, manHours);
        this.pos = Positions.JUNIOR;
    }
}
