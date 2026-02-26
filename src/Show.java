import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public boolean changeActor(Actor newActor, String surnamePrev){
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surnamePrev)) {
                listOfActors.set(i, newActor);
                return true;
            }
        }
        return false;
    }

    public void addActor(Actor actor){
        for (Actor currentActor : listOfActors) {
            if (currentActor.equals(actor)) {
                System.out.println("Этот актер уже есть в списке.");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public ArrayList<Actor> getListOfActors(){
        return listOfActors;
    }
}
