package com.solution.restaurant.test.contoller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Solution Restaurant Test");
    }
}
