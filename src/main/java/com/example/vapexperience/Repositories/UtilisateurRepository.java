package com.example.vapexperience.Repositories;

import com.example.vapexperience.Models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository  extends JpaRepository<String, Utilisateur> {

}
