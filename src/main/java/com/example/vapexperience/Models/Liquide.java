package com.example.vapexperience.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Liquide {
    @Id
    @Basic
    @Column(name = "ref_liq", nullable = false, length = 10)
    private String refLiq;
    @Basic
    @Column(name = "libelle", nullable = false, length = 50)
    private String libelle;
    @Basic
    @Column(name = "saveur", nullable = false, length = 50)
    private String saveur;
    @Basic
    @Column(name = "type", nullable = false, length = 50)
    private String type;
    @Basic
    @Column(name = "marque", nullable = false, length = 50)
    private String marque;
    @Basic
    @Column(name = "description", nullable = false, length = 255)
    private String description;

}
