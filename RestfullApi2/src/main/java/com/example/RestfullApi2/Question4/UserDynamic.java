package com.example.RestfullApi2.Question4;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("UserDynamicFilter")
public class UserDynamic {
    private Long id;
    private String name;
    private String email;
    private String password;

    public UserDynamic() {}
    public UserDynamic(Long id, String name, String email, String password) {
        this.id = id; this.name = name; this.email = email; this.password = password;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
