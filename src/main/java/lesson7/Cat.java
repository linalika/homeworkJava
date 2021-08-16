package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }

    public void eat(Plate plate) {
        if (this.appetite >= plate.getAmountOfFood()) {
            System.out.println(this.name + " не наелся");
        } else {
            plate.decreaseAmountOfFood(this.getAppetite());
            this.satiety = true;
        }

    }
}
