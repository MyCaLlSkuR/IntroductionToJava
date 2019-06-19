package logic;

import entity.Employee;

import java.util.Comparator;
import java.util.List;

public class EmployeeSorter {

    public List<Employee> sortEmp (List<Employee> employees, Comparator<Employee> comparator){
        employees.sort(comparator);
        return employees;
    }

    public List<Employee> sortEmp (List<Employee> employees,
                                   Comparator<Employee> comparator1,
                                   Comparator<Employee> comparator2){
        employees.sort(comparator1.thenComparing(comparator2));
        return employees;
    }
}
