package entity;

public class Senior extends Employee{

    public Senior(String firstName, String lastName, int age, int salary, int manHours){
        super(firstName, lastName, age, salary, manHours);
        this.pos = Positions.SENIOR;
    }
}
