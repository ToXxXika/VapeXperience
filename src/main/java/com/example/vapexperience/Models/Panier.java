package com.example.vapexperience.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Panier")
public class Panier {
    @Id
    String reference ;

}
