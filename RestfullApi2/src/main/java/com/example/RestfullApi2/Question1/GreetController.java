package com.example.RestfullApi2.Question1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GreetController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String sayHello(
            @RequestParam String username,
            @RequestHeader(name = "Accept-Language", required = false) Locale locale) {

        return messageSource.getMessage("hello.message", new Object[]{username}, locale);
    }
}
