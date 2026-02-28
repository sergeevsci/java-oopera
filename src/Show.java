import java.util.ArrayList;
import java.util.List;

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

    public void changeActor(Actor newActor, String surnamePrev) {
        List<Integer> matchingIndices = new ArrayList<>(); //массив индексов совпадений-Актеров по фамилии, которую хотим менять.

        for (int i = 0; i < listOfActors.size(); i++) { // Все индексы актёров с заданной фамилией
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surnamePrev)) {
                matchingIndices.add(i);
            }
        }

        if (matchingIndices.isEmpty()) {
            System.out.println("Замена не была произведена. В этом спектакле нет актёра с фамилией '" + surnamePrev + "'.");
        } else if (matchingIndices.size() > 1) {
            System.out.println("Замена не была произведена. В спектакле найдено " + matchingIndices.size() +
                    " актёров с фамилией '" + surnamePrev + "'. Не ясно кого конкретно надо заменить.");
        } else { //только если там всего один такой актер меняем
            int indexReplace = matchingIndices.get(0);
            listOfActors.set(indexReplace, newActor);
            System.out.println("Актёр с фамилией '" + surnamePrev + "' успешно заменён на " + newActor.getName() + " " + newActor.getSurname());
        }
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

    public void printActors(){
        for (Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    public void printDirector(){
        System.out.println(director);
    }
}