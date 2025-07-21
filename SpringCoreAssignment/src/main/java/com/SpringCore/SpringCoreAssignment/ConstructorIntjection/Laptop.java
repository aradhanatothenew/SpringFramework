package com.SpringCore.SpringCoreAssignment.ConstructorIntjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private final Processor processor;

    // Constructor Injection
    @Autowired
    public Laptop(Processor processor) {
        this.processor = processor;
    }

    public void displaySpecs() {
        System.out.println("Laptop Processor: " + processor.getProcessorType());
    }
}

