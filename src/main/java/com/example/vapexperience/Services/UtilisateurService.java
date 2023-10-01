package com.example.vapexperience.Services;

import com.example.vapexperience.Models.Users;
import com.example.vapexperience.Repositories.UtilisateurRepository;
import com.example.vapexperience.Services.Implementation.UtilisateurServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService implements UtilisateurServiceInt {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public boolean adduser(Users u) {
        try {
            utilisateurRepository.save(u);
            return true;
        } catch (Exception e) {
            return false;
        }


    }

    @Override
    public List<Users> getAllUsers() {
        return utilisateurRepository.findAll();
    }

    @Override
    public boolean Login(String username, String password) {
        try {
            Users u = utilisateurRepository.findUser(username, password);
            if (u == null) return false;
            else return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
