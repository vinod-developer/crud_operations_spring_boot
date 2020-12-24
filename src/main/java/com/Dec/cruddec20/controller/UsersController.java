package com.Dec.cruddec20.controller;

import com.Dec.cruddec20.Users;
import com.Dec.cruddec20.repository.UsersJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersJpaRepository usersJpaRepository;

    @GetMapping(value = "/all")
    public List<Users> findAll(){
        return usersJpaRepository.findAll();
    }
    
    
    @PostMapping(value = "/save")
    public  void saveRecords(@RequestBody  Users users){
          usersJpaRepository.save(users);
    }
    
    @GetMapping(value = "/{name}")
    public Users getAll(@PathVariable String name){
        return usersJpaRepository.findByName( name);
        
    }
    


}
