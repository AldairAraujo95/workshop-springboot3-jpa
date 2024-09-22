package com.araujo.curso.resources;

import com.araujo.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> finAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "71991337219","12345");
        return ResponseEntity.ok().body(u);
    }

}
