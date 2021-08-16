package lesson7;

/**
 * Кот голодный. Кот хочет поесть. Поесть может из тарелки
 */

public class App {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Boris", 30);
        cats[1] = new Cat("Barsik", 30);
        cats[2] = new Cat("Ponchick", 50);
        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() +" " + cat.isSatiety());
        }

        System.out.println(plate);
    }
}
