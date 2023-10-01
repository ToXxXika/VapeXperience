package com.example.vapexperience.Controllers;

import com.example.vapexperience.Models.Users;
import com.example.vapexperience.Services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
@CrossOrigin("*")
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService ;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;

    }

    @PostMapping("/login")
    public Boolean login(@RequestParam(name = "username") String username , @RequestParam(name = "password") String password){
        return  this.utilisateurService.Login(username,password);

    }
    @GetMapping("/gu")
    public List<Users> getUsers(){
        return this.utilisateurService.getAllUsers();
    }
    // au  = addUser
    @PostMapping("/au")
    public boolean addUser(@RequestBody Users u){
        return this.utilisateurService.adduser(u);
    }
}
