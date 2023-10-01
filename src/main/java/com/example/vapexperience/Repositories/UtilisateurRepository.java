package com.example.vapexperience.Repositories;

import com.example.vapexperience.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository  extends JpaRepository<Users,String> {

    @Query("select u from Users u where u.username = ?1 and u.password = ?2")
    Users findUser(String username , String password);
}
