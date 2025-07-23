package com.example.RestfullApi2.Question3;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "User entity containing basic information")
public class Userone {

    @Schema(description = "Unique ID of the user", example = "1")
    private Long id;

    @Schema(description = "Name of the user", example = "Aradhana")
    private String name;

    @Schema(description = "Email of the user", example = "aradhana@example.com")
    private String email;

    public Userone() {}

    public Userone(Long id, String name, String email) {
        this.id = id; this.name = name; this.email = email;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}