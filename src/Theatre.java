import Person.Actor;
import Person.Director;
import Person.Gender;
import Show.Show;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Actor> actorArrayList = new ArrayList<>();
        Show show = new Show("Lf", 200, new Director("Dani", "zur", Gender.MALE, 500), actorArrayList);

        show.addActors("Lfyb", "asds", Gender.MALE, 180);
        show.addActors("Lfyb", "asds", Gender.MALE, 180);
        show.addActors("fyb", "ass", Gender.FEMALE, 183);

        show.printAllActors();

        show.changeActor(new Actor("Lyb", "ads", Gender.MALE, 180), "ass");

        show.printAllActors();
    }
}
