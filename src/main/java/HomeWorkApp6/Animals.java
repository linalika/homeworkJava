package HomeWorkApp6;

public class Animals {
    public static void main(String[] args) {
        Dog bobbiDog = new Dog("Бобби");
        bobbiDog.run(20);

        Dog teddyDog = new Dog("Тедди");
        teddyDog.run(2000);

        Cat abbeyCat = new Cat("Эбби");
        abbeyCat.run(300);
        abbeyCat.swim(30);

        Cat barneyCat = new Cat("Барни");
        barneyCat.run(100);
        barneyCat.swim(30);

        System.out.println(Animal.getAnimalCounter());
        System.out.println(Dog.getAnimalCounter());
        System.out.println(Cat.getAnimalCounter());
    }
}
