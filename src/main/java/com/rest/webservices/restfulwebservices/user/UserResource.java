package com.rest.webservices.restfulwebservices.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    //GET /users
    @GetMapping(path="/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    @GetMapping(path="/users/{id}")
    public User retriveUser(@PathVariable Integer id){
        User user =  service.findOne(id);
        if (user == null) {
            throw new UserNotFoundException("id:" + id );
        }
        return user;
    }

    @DeleteMapping(path="/users/{id}")
    public void deleteUser(@PathVariable Integer id){
        service.deleteById(id);
    }

    // Post /users
    @PostMapping(path="/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);
        URI location  = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
