package com.STLCookingFamily.user.service.controller;


import com.STLCookingFamily.user.service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
//permet de designer une classe comme controleur, lui conferant la capacite de traiter les requêtes de type GET, POST, etc.  repondre directement sans passer par une vue.
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String showIndex(){
        return "Bonjour, comment allez-vous les cocos ! ";
    }

    @GetMapping("/connexion/{}")
    public String connexionUser()
}
