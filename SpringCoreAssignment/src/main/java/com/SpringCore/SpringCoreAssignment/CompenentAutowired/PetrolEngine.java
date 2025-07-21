package com.SpringCore.SpringCoreAssignment.CompenentAutowired;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}
