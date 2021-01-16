package sda.finalproject.jgroup10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWourldController {
    @GetMapping("/hello/{name}")
    public String showName(@PathVariable("name") String name) {
        return "Hello" + name;
    }
}
