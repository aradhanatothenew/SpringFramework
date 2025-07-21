package com.SpringCore.SpringCoreAssignment.ConstructorIntjection;

import org.springframework.stereotype.Component;

@Component
public class Processor {
    public String getProcessorType() {
        return "Intel Core i7";
    }
}
