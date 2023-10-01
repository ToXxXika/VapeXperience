package com.example.vapexperience.Services.Implementation;

import com.example.vapexperience.Models.Users;

import java.util.List;

public interface UtilisateurServiceInt {

    //TODO : don't forget to implement SpringSecurity
     boolean adduser(Users u);
     List<Users> getAllUsers();
     boolean Login(String username , String password);

}
