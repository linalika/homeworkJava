package lesson6;

public abstract class Transport {
    protected String number;
    protected int capacity;

    public Transport(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public Transport() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void move() {
        System.out.println("Transport is moving");
    }

    public abstract int stopTimeSec();

}
