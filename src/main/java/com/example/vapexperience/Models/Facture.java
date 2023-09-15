package com.example.vapexperience.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Facture")
public class Facture {
    @Id
    String reference ;
    String date ;
    String cin ;
    String total ;
    String liquide ;
    String quantite ;
    float prix ;

}
