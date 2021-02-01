package pl.kacper.zielinski.toukplayground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping
    public String helloGet() {
        return "Hello";
    }
}
