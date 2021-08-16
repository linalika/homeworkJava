package lesson6;

public class PolyApp {
    public static void main(String[] args) {
        // is a - является чем-то
        Transport bus = new Bus("a123bc",40,"Liaz");
        Transport miniBus = new MiniBus("z123op",20,"Gazel","Shanson");
        Transport riverShip = new RiverShip("z123",100,500);
        Transport[] transports = new Transport[] {bus, miniBus, riverShip};
        for (Transport transport : transports) {
            if(transport.getCapacity()<30){
                continue;
            }
            System.out.println(transport);
        }
    }
}
