package com.example.RestfullApi2.Question6;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hateoas")
public class UserHateoasController {

    @GetMapping("/user/{id}")
    public EntityModel<UserClass> getUser(@PathVariable Long id) {
        UserClass user = new UserClass(id, "Aradhana", "aradhana@example.com");
        EntityModel<UserClass> resource = EntityModel.of(user);
        resource.add(
                WebMvcLinkBuilder.linkTo(
                                WebMvcLinkBuilder.methodOn(UserHateoasController.class).getAllTopics())
                        .withRel("all-topics")
        );

        return resource;
    }

    @GetMapping("/topics")
    public List<String> getAllTopics() {
        return List.of("Spring Boot", "REST API", "HATEOAS", "Swagger");
    }
}

