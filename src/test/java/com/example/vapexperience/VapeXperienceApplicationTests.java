package com.example.vapexperience;

import com.example.vapexperience.Models.Users;
import com.example.vapexperience.Services.UtilisateurService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VapeXperienceApplicationTests {

    UtilisateurService utilisateurService;
    @Test
    void contextLoads() {

    }
    @Test
    void TestSignup(){
        //populate a new user ;
        Users u = new Users();
        u.setUsername("admin");
        u.setPassword("admin");
        u.setRole("admin");

        Assertions.assertEquals(true,utilisateurService.adduser(u));
    }
    @Test
    void testLogin(){
        Assertions.assertEquals(true,utilisateurService.Login("admin","admin"));


    }

}
