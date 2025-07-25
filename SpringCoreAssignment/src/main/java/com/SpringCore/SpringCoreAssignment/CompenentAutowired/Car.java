package com.SpringCore.SpringCoreAssignment.CompenentAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
    public class Car {
        private Engine engine;

        @Autowired  // Constructor-based dependency injection
        public Car(Engine engine) {
            this.engine = engine;
        }

        public void startCar() {
            engine.start();
        }
}
