package com.Restfull.RestwithSpring.Question9;
import jakarta.validation.constraints.*;
public class Employee1 {

    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 65, message = "Age must not exceed 65")
    private int age;

    // Constructors
    public Employee1() {}
    public Employee1(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

