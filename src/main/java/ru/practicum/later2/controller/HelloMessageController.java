package ru.practicum.later2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.practicum.later2.service.HelloMessageService;

@RestController
@RequestMapping("/hello")
public class HelloMessageController {
    private final HelloMessageService messageService;

    @Autowired
    public HelloMessageController(HelloMessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String hello() {
        return messageService.getHelloMessage();
    }
}