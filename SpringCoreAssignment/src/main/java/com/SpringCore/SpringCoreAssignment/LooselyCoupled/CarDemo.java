package com.SpringCore.SpringCoreAssignment.LooselyCoupled;

public class CarDemo {
    private Engine engine;

    // Constructor Injection
    public CarDemo(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
    }

    public static void main(String[] args) {
        // Choose the engine type at runtime
        Engine engine = new DieselEngine(); // or new PetrolEngine()
        CarDemo carDemo = new CarDemo(engine);
        carDemo.startCar();
    }
}

