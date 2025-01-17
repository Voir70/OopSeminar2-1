import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List <Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();

    public void addAnimal (Animal newAnimal){
        this.animals.add(newAnimal);
    }

    public void showAll (){
        for (Animal animal: this.animals) {
            System.out.println(animal);
        }
    }

    public void noise (){
        for (Speakable speak:noises()) {
            System.out.print(speak.speak());
        }
        System.out.println();
    }

    private List<Speakable> noises (){
        List<Speakable> res = new ArrayList<>();
        for (Animal animal:animals) {
            res.add(animal);
        }
        res.add(radio);
        return res;
    }

    private List<Walkable> runners (){
        List<Walkable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Walkable) {
                res.add((Walkable) animal);
            }
        }
        return res;
    }

    public Animal championByRun () {
        List<Walkable> start = runners();
        Walkable champ = start.get(0);
        for (Walkable runner:start) {
            if (champ.runSpeed()< runner.runSpeed()){
                champ = runner;
            }
        }
        return (Animal)champ;
    }

    private List<Flyable> flyers (){
        List<Flyable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Flyable) {
                res.add((Flyable) animal);
            }
        }
        return res;
    }

    public Animal championByFly () {
        List<Flyable> start = flyers();
        Flyable champ = start.get(0);
        for (Flyable flyer:start) {
            if (champ.flySpeed()< flyer.flySpeed()){
                champ = flyer;
            }
        }
        return (Animal)champ;
    }
    private List<Floatable> swimmers (){
        List<Floatable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Floatable) {
                res.add((Floatable) animal);
            }
        }
        return res;
    }

    public Animal championBySwimming () {
        List<Floatable> start = swimmers();
        Floatable champ = start.get(0);
        for (Floatable swimmers:start) {
            if (champ.swimmingSpeed()< swimmers.swimmingSpeed()){
                champ = swimmers;
            }
        }
        return (Animal)champ;
    }
}
