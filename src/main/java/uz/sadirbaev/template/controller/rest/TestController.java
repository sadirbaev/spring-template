package uz.sadirbaev.template.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sadirbaev.template.entity.Test;
import uz.sadirbaev.template.service.TestService;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final TestService service;

    @Autowired
    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping("/")
    private ResponseEntity<List<Test>> test(){
        return service.getAll();
    }
}
