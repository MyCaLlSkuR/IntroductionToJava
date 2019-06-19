
import entity.*;
import factory.EmloyeeFactory;
import validator.Validator;
import logic.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        File file = new File("src\\resources\\employees.txt");

        EmloyeeFactory factory = new EmloyeeFactory();

        List<String> temp = factory.fileToStr(file);
        Validator valid = new Validator();
        temp = valid.validator(temp);
        for(String data: temp){
            employees.add(factory.addEmployee(data));
        }

        Team team = new Team(employees);
        System.out.println(team);
        System.out.println("\nTeam cost: " + team.getCost());
        System.out.println("\nSalary between 800 and 1000: " + team.getEmpWithSalaryBetween(800,1000));

        EmployeeSorter sorter = new EmployeeSorter();
        ComparatorByAge byAge = new ComparatorByAge();
        ComparatorBySalary bySalary = new ComparatorBySalary();
        System.out.println("\nEmployees sorted by Age: " + sorter.sortEmp(employees, byAge));
        System.out.println("\nEmployees sorted by Age and Salary: " + sorter.sortEmp(employees, byAge, bySalary));
        System.out.println("\nEmployees sorted by Salary: " + sorter.sortEmp(employees, bySalary));
    }

}
