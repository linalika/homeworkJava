package HomeWorkApp6;

public abstract class Animal {
    protected String name;
    protected int maxSwimDistance;
    protected int maxRunDistance;
    private static int animalCounter = 0;

    protected static int getAnimalCounter() {
        return animalCounter;
    }


    public Animal(String name) {
        this.name = name;
        this.maxRunDistance = 0;
        this.maxSwimDistance = 0;
        animalCounter++;
    }

    protected void run(int distance) {
        System.out.println(this.name + " пробежал " + distance + "м.");
    }

    protected void swim(int distance) {
        System.out.println(this.name + " пробежал " + distance + "м.");
    }

}
