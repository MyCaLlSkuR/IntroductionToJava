package training;

import training.organization.Employee;
import training.factory.EmloyeeFactory;
import training.organization.Team;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        File file = new File("src\\training\\source\\employees.txt");

        EmloyeeFactory factory = new EmloyeeFactory();

        List<String> temp = factory.fileToStr(file);
        temp = validator(temp);
        for(String data: temp){
            employees.add(factory.addEmployee(data));
        }

        Team team = new Team(employees);
        System.out.println(team);
        System.out.println("Team cost: " + team.getCost());
        System.out.println("Salary between 800 and 1000: " + team.sortBySalary(800,1000));
        System.out.println("Juniors under 20: " + team.getJuniorsUnderN(20));
    }
    private static final String REGEX_FOR_STRING = "[a-zA-Z]+";
    private static final String REGEX_FOR_INTEGER = "\\d+";
    public static List<String> validator (List<String> data){
        for(String dat: data) {
            String[] str = dat.split(" ");
            if (!(str[0].equals("middle") || str[0].equals("junior") || str[0].equals("senior"))) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[1].matches(REGEX_FOR_STRING)) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[2].matches(REGEX_FOR_STRING)) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[3].matches(REGEX_FOR_INTEGER)) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[4].matches(REGEX_FOR_INTEGER)) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[5].matches(REGEX_FOR_INTEGER)) {
                data.remove(dat);
                validator(data);
                break;
            }
        }
        return data;
    }
}
