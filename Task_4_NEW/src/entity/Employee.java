package entity;

import java.util.Objects;

public abstract class Employee extends Person{
    private int manHours;
    protected Positions pos;

    public Employee(){

    }

    public Employee(String firstName, String lastName, int age, int salary, int manHours){
        super(firstName, lastName, age, salary);
        this.manHours = manHours;
    }

    public int getManHours() {
        return manHours;
    }

    public void setManHours(int manHours) {
        this.manHours = manHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return manHours == employee.manHours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manHours);
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                super.print()+
                ", manHours = " + manHours+
                ", position = " + pos+
                "}";
    }
}
