package transport;

import Drivers.DriverD;
import Interfaces.Competing;

public class Bus extends transport implements Competing {
    public Bus (String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    public void start() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начинает движение");
    }

    public void stop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    public void pitStop() {
        System.out.println("Пит-стоп для автобуса");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel());
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel());
    }
}
