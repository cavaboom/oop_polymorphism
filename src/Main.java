import transport.Car;
import transport.Bus;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car1 = new Car("Lada", "Granta", 1.7, "yellow", 120, 2015, "Russia", "Manual", "sedan", "с865мк", 4, true);
        Car.Key key1 = car1.new Key(true, true);
        System.out.println(car1);
        System.out.println();
        int month = 11;
        car1.changeTires(month);
        System.out.println(car1);
        System.out.println(key1);

        Bus bus1 = new Bus("Toyota", "Hiace", 2016, "Japan", "white", 120);
        Bus bus2 = new Bus("Hyundai", "County", 2010, "South Korea", "white", 120);
        Bus bus3 = new Bus("ГАЗ", "ГАЗель Next", 2020, "Russia", "white", 120);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}