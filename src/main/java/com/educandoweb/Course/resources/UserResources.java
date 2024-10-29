package com.educandoweb.Course.resources;

import com.educandoweb.Course.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "Maria@gmail.com", "132456798", "123456");
        return ResponseEntity.ok().body(u);
    }

}
