package HomeWorkApp6;

public abstract class Animal {
    protected String name;
    private static int animalCounter = 0;

    protected static int getAnimalCounter() {
        return animalCounter;
    }

    public Animal(String name) {
        this.name = name;
        animalCounter++;
    }

    protected void run(int distance) {
        System.out.println(this.name + " пробежал " + distance + "м.");
    }

    protected void swim(int distance) {
        System.out.println(this.name + " пробежал " + distance + "м.");
    }

}
