package training.organization;

import java.util.List;
import java.util.Objects;

public class Team {
    private List<Junior> juniors;
    private List<Middle> middles;
    private List<Senior> seniors;

    public Team(){

    }
    public Team(List<Junior> juniors,List<Middle> middles,List<Senior> seniors){
        this.juniors = juniors;
        this.middles = middles;
        this.seniors = seniors;
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
        return "Team{" +
                "juniors=" + juniors +
                ", middles=" + middles +
                ", seniors=" + seniors +
                '}';
    }
}
