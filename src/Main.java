import transport.Car;
import transport.Bus;
import transport.Truck;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Иванов Сергей Сергеевич", true, 20, "B");
        DriverC driverC = new DriverC("Рогов Константин Алексеевич", true, 15, "C");
        DriverD driverD = new DriverD("Васильев Николай Александрович", true, 15, "D");


        Car car1 = new Car("BMW", "Z8", 3.0, driverB);
        Car car2 = new Car("Kia", "Sportage", 2.4, driverB);
        Car car3 = new Car("Hyundai", "Avante", 1.6, driverB);
        Car car4 = new Car("Lexus", "LX570", 5.7, driverB);

        Bus bus1 = new Bus("Toyota", "Hiace", 2.0, driverD);
        Bus bus2 = new Bus("Hyundai", "County", 2.0, driverD);
        Bus bus3 = new Bus("ГАЗ", "ГАЗель Next", 2.0, driverD);
        Bus bus4 = new Bus("Ford", "Transit", 2.2, driverD);

        Truck truck1 = new Truck("Toyota", "Dyna", 4.1, driverC);
        Truck truck2 = new Truck("КамАЗ", "43118", 11.7, driverC);
        Truck truck3 = new Truck("DAF", "95XF", 13.0, driverC);
        Truck truck4 = new Truck("Isuzu", "Elf", 5.2, driverC);

        System.out.println("Водитель " + driverB + " управляет автомобилем " + car1 + " и будет участвовать в заезде");
        System.out.println("Водитель " + driverC + " управляет автомобилем " + truck1 + " и будет участвовать в заезде");
        System.out.println("Водитель " + driverD + " управляет автомобилем " + bus1 + " и будет участвовать в заезде");

        driverB.fillTheCar();
        driverB.start();
        car4.start();
        car4.stop();
        System.out.println();

        car2.pitStop();
        truck1.bestLapTime();
    }
}