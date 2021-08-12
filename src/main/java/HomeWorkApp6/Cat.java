package HomeWorkApp6;

public class Cat extends Animal {
    private static int catCounter = 0;

    protected static int getAnimalCounter() {
        return catCounter;
    }

    @Override
    protected void run(int distance) {
        if (distance <= this.maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println("Кошка имеет ограничение в " + this.maxRunDistance);
        }
    }

    @Override
    protected void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public Cat(String name) {
        super(name);
        this.maxRunDistance = 500;
        this.catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }
}
