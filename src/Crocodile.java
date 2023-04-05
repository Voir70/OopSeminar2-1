public class Crocodile extends Predator implements Walkable, Floatable {

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "ХрХрр";
    }

    @Override
    public int runSpeed() {
        return 10;
    }

    @Override
    public int swimmingSpeed() {
        return 40;
    }
}
