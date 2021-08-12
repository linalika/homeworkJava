package HomeWorkApp6;

public class Dog extends Animal {
    private static int dogCounter = 0;
    protected final static int maxSwimDistance = 10;
    protected final static int maxRunDistance = 500;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    // не уверена, что перегрузка геттера нужна была
    protected static int getAnimalCounter() {
        return dogCounter;
    }

//     возможно стоило создать свой геттер, но тогда при вызове Animal.getAnimalCounter() мы бы получали число всех животных
//    public static int getDogCounter() {
//        return dogCounter;
//    }


    @Override
    protected void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println("Собака имеет ограничение в " + maxRunDistance + " м");
        }
    }

    @Override
    protected void swim(int distance) {
        if (distance <= maxSwimDistance) {
            super.swim(distance);
        } else {
            System.out.println("Собака имеет ограничение в " + maxRunDistance + " м");
        }
    }
}
