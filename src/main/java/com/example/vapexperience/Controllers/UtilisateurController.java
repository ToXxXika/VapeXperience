package com.example.vapexperience.Controllers;

import com.example.vapexperience.Repositories.UtilisateurRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateur")
@CrossOrigin("*")
public class UtilisateurController {
    public UtilisateurRepository utilisateurRepository;

    public UtilisateurController(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }

    @PostMapping("/login")
    public String login(){
        return "login";
    }
}
