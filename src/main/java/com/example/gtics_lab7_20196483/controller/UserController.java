package com.example.gtics_lab7_20196483.controller;

import com.example.gtics_lab7_20196483.entity.Users;
import com.example.gtics_lab7_20196483.reposity.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

public class UserController {
    final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/usuarios/{id}")
    public Users obtenerUsuarioPorId(@PathVariable("id") String idStr){
        try{
            int id = Integer.parseInt(idStr);
            Optional<Users> optUsuario = userRepository.findById(id);
            if (optUsuario.isPresent()){

            }else{

            }

        } catch (NumberFormatException e) {
        }
    }
}
