package lesson6;

public abstract class WaterTransport extends Transport {
    protected String startMonth;
    protected String endMonth;

    public WaterTransport(String number, int capacity) {
        super(number, capacity);
    }

    public abstract void dingDong();

}
