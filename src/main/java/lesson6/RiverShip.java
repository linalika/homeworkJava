package lesson6;

public class RiverShip extends WaterTransport{
    private double cost;

    public RiverShip(String number, int capacity, double cost) {
        super(number, capacity);
    }

    @Override
    public void dingDong() {

    }

    @Override
    public int stopTimeSec() {
        return 0;
    }
}
