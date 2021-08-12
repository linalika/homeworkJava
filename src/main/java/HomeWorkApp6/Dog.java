package HomeWorkApp6;

public class Dog extends Animal {
    private static int dogCounter = 0;

    public Dog(String name) {
        super(name);
        this.maxRunDistance = 500;
        this.maxSwimDistance = 10;
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
        if (distance <= this.maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println("Собака имеет ограничение в " + this.maxRunDistance);
        }
    }

    @Override
    protected void swim(int distance) {
        if (distance <= this.maxSwimDistance) {
            super.swim(distance);
        } else {
            System.out.println("Собака имеет ограничение в " + this.maxRunDistance);
        }
    }
}
