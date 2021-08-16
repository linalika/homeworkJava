package lesson7;

/**
 * Кот голодный. Кот хочет поесть. Поесть может из тарелки
 */

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Boris",20);
        Plate plate = new Plate(100);
//        int newAmountOfFood = plate.getAmountOfFood() - cat.getAppetite();
//        plate.setAmountOfFood(newAmountOfFood);
        //plate.decreaseAmountOfFood(cat.getAppetite());

        cat.eat(plate);
        System.out.println(cat);
        System.out.println(plate);
    }
}
