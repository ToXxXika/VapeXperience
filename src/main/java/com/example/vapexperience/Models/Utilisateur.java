package com.example.vapexperience.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
    @Id
    String cin ;
    String nom ;
    String prenom ;
    String email ;
    String password ;

}
