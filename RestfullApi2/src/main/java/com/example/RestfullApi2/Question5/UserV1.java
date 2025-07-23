package com.example.RestfullApi2.Question5;

public class UserV1 {
    private Long id;
    private String name;

    public UserV1() {}
    public UserV1(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

