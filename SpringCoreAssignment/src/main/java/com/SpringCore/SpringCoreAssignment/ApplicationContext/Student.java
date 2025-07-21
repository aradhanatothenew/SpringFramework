package com.SpringCore.SpringCoreAssignment.ApplicationContext;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id = 101;
    private String name = "Aradhana";
    private String course = "Spring Boot";

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}
