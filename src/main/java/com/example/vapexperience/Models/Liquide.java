package com.example.vapexperience.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Liquide")
public class Liquide {
    @Id
    String reference ;
    String nom ;

    String saveur ;
    String marque ;
    String description ;

}
