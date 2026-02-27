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

    public void changeActor(Actor newActor, String surnamePrev){
        boolean isSet = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surnamePrev)) { //если фамилия текущего актера равна фамилии
                // актера назначенного под замену, то
                if (newActor.getSurname().equals(surnamePrev)){ //если фамилия нового актера равна surnamePrev - предупреждение и отмена замены.
                    System.out.println("Замена не была произведена. У заменяемого актера такая же фамилия, " +
                            "как и у заменяющего актера.");
                    return;
                }
                listOfActors.set(i, newActor);
                isSet = true;
            }
        }
        if (!isSet){
            System.out.println("Замена не была произведена. В этом спектакле нет такого актера.");
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
