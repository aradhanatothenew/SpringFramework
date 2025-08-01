package com.example.inheritanceMapping.Joined;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("FULL_TIME")
public class FullTimeEmployee extends Employee {
    private double salary;
}
