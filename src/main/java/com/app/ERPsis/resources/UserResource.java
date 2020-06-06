package com.app.ERPsis.resources;

import com.app.ERPsis.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Vinicius", "Killerhomage@gmail.com", "(21)99222-5935", "123456");
        return ResponseEntity.ok().body(u);
    }
}
