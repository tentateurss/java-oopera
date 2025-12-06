import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {

        boolean isActorExist = false;
        for (Actor existingActor : listOfActors) {
            if (existingActor.getName().equalsIgnoreCase(actor.getName()) &&
                    existingActor.getSurname().equalsIgnoreCase(actor.getSurname()) &&
                    existingActor.getHeight() == actor.getHeight()) {
                isActorExist = true;
                break;
            }
        }

        if (isActorExist) {
            System.out.printf("Актер %s %s - уже участвует в представлении!\n",
                    actor.getName(), actor.getSurname());
        } else {
            listOfActors.add(actor);
            System.out.printf("Актер %s %s - успешно добавлен!\n",
                    actor.getName(), actor.getSurname());
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
            System.out.printf("Актер %s не был найден!", surName);
        }
    }

    public void printAllActors() {
        for (Actor listOfActor : listOfActors) {
            System.out.println(listOfActor.toString());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}