package training.organization;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team {
    private List<Employee> juniors = new ArrayList<>();
    private List<Employee> middles = new ArrayList<>();
    private List<Employee> seniors = new ArrayList<>();

    public Team(){}

    public Team(List<Employee> employees){
        for (Employee employee: employees){

            switch (employee.pos){
                case JUNIOR:{
                    this.juniors.add(employee);
                    break;
                }
                case MIDDLE:{
                    this.middles.add(employee);
                    break;
                }
                case SENIOR:{
                    this.seniors.add(employee);
                    break;
                }
            }
        }

    }

    public int getCost(){
        int cost = 0;
        for (Employee employee: juniors){
            cost += employee.getManHours();
        }
        for (Employee employee: middles){
            cost += employee.getManHours();
        }
        for (Employee employee: seniors){
            cost += employee.getManHours();
        }
        return cost;
    }

    public List<Employee> getJuniorsUnderN(int N){
        List<Employee> sorted = new ArrayList<>();
        for (Employee employee: juniors){
            if (employee.getAge() < N){
                sorted.add(employee);
            }
        }
        return sorted;
    }

    public List<Employee> sortBySalary (int minSalary, int maxSalary){
        List<Employee> sorted = new ArrayList<>();
        for (Employee employee: juniors){
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary){
                sorted.add(employee);
            }
        }
        for (Employee employee: middles){
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary){
                sorted.add(employee);
            }
        }
        for (Employee employee: seniors){
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary){
                sorted.add(employee);
            }
        }
        return sorted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(juniors, team.juniors) &&
                Objects.equals(middles, team.middles) &&
                Objects.equals(seniors, team.seniors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(juniors, middles, seniors);
    }

    @Override
    public String toString() {
        return "Team{ " +
                "\njuniors=" + juniors +
                "\nmiddles=" + middles +
                "\nseniors=" + seniors +
                '}';
    }
}
