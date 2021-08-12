package HomeWorkApp6;

public class Cat extends Animal {
    private static int catCounter = 0;
    protected final static int maxRunDistance = 200;

    protected static int getAnimalCounter() {
        return catCounter;
    }

    @Override
    protected void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println("Коты имеют ограничение в " + maxRunDistance + " м");
        }
    }

    @Override
    protected void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public Cat(String name) {
        super(name);
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }
}
