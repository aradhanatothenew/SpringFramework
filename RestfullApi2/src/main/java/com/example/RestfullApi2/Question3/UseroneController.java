package com.example.RestfullApi2.Question3;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
@Tag(name = "User Controller", description = "CRUD operations for managing users")

public class UseroneController {
    private Map<Long, Userone> userMap = new HashMap<>();

    @Operation(summary = "Get a user by ID", description = "Returns user details based on the given ID")
    @GetMapping("/{id}")
    public Userone getUser(@PathVariable Long id) {
        return userMap.get(id);
    }

    @Operation(summary = "Create a new user", description = "Saves user details using POST request")
    @PostMapping
    public String createUser(@RequestBody Userone user) {
        userMap.put(user.getId(), user);
        return "User created: " + user.getName();
    }

    @Operation(summary = "Delete a user by ID", description = "Deletes the user based on the given ID")
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userMap.remove(id);
        return "User deleted with ID: " + id;
    }
}

