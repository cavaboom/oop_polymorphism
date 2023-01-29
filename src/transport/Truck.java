package transport;

import Drivers.DriverC;
import Interfaces.Competing;

public class Truck extends transport implements Competing {
    public Truck (String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    public void start() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " начинает движение");
    }

    public void stop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    public void pitStop() {
        System.out.println("Пит-стоп для грузовика");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel());
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel());
    }
}
