package Show;

import Person.Actor;
import Person.Director;
import Person.Gender;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActors(String name, String surName, Gender gender, int height) {
        Actor tempActor = new Actor(name, surName, gender, height);

        boolean isActorExist = false;
        for (Actor listOfActor : listOfActors) {
            if (listOfActor.getName().equalsIgnoreCase(name) &&
                    listOfActor.getSurname().equalsIgnoreCase(surName) &&
                    listOfActor.getHeight() == height) {
                isActorExist = true;
                break;
            }
        }

        if (isActorExist) {
            System.out.printf("Актер %s %s - Уже участвует в спектакле!\n", name, surName);
        } else {
            Actor actor = new Actor(name, surName, gender, height);
            listOfActors.add(actor);
            System.out.printf("Актер %s %s - Успешно добавлен!\n", name, surName);
        }
    }

    public void changeActor(Actor actor, String surName) {
        if (surName == null || actor == null) {
            System.out.println("Поле не может быть пустым!");
            return;
        }

        boolean found = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equalsIgnoreCase(surName)) {
                Actor noChangeActor = listOfActors.get(i);
                listOfActors.set(i, actor);
                found = true;
                System.out.printf("Актер %s %s - Успешно изменен на %s %s !\n",
                        noChangeActor.getName(),
                        noChangeActor.getSurname(),
                        actor.getName(),
                        actor.getSurname());
                break;
            }
        }

        if (!found) {
            System.out.println("Актер не был найден!");
        }
    }

    public void printAllActors() {
        for (Actor listOfActor : listOfActors) {
            System.out.println(listOfActor.toString());
        }
    }

}
