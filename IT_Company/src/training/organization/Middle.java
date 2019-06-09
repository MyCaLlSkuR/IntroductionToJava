package training.organization;

public class Middle extends Employee{
    public Middle(String firstName, String lastName, int age, int salary, int manHours){
        super(firstName, lastName, age, salary, manHours);
        this.pos = Positions.MIDDLE;
    }
}
