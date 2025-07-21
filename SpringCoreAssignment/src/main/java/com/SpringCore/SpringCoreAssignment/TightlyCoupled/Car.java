package com.SpringCore.SpringCoreAssignment.TightlyCoupled;
public class Car {
    PetrolEngine engine;

    public Car() {
        engine = new PetrolEngine();
    }

    public void startCar() {
        engine.start();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}

