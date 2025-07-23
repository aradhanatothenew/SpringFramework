package com.example.RestfullApi2.Question5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserVersioningController {

    @GetMapping(value = "/user", produces = "application/vnd.company.app-v1+json")
    public UserV1 getUserV1Mime() {
        return new UserV1(1L, "Aradhana");
    }

    @GetMapping(value = "/user", produces = "application/vnd.company.app-v2+json")
    public UserV2 getUserV2Mime() {
        return new UserV2(1L, "Aradhana", "aradhana@example.com", "Delhi, India");
    }

    @GetMapping(value = "/user/param", params = "version=1")
    public UserV1 getUserV1Param() {
        return new UserV1(1L, "Aradhana");
    }

    @GetMapping(value = "/user/param", params = "version=2")
    public UserV2 getUserV2Param() {
        return new UserV2(1L, "Aradhana", "aradhana@example.com", "Delhi, India");
    }

    @GetMapping("/v1/user")
    public UserV1 getUserV1Uri() {
        return new UserV1(1L, "Aradhana");
    }

    @GetMapping("/v2/user")
    public UserV2 getUserV2Uri() {
        return new UserV2(1L, "Aradhana", "aradhana@example.com", "Delhi, India");
    }

    @GetMapping(value = "/user/header", headers = "X-API-VERSION=1")
    public UserV1 getUserV1Header() {
        return new UserV1(1L, "Aradhana");
    }

    @GetMapping(value = "/user/header", headers = "X-API-VERSION=2")
    public UserV2 getUserV2Header() {
        return new UserV2(1L, "Aradhana", "aradhana@example.com", "Delhi, India");
    }
}
