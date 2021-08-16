package lesson6;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("1K", 40, "Ikarus");
        bus.move();
        System.out.println(bus.stopTimeSec());
        MiniBus miniBus = new MiniBus("1K", 60, "Gazel", "Mountain");
        miniBus.move();
        System.out.println(miniBus.stopTimeSec());

    }
}