package com.example.vapexperience.Models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facture {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ref_facture", nullable = false, length = 50)
    private String refFacture;
    @Basic
    @Column(name = "date_facture", nullable = false)
    private Date dateFacture;
    @Basic
    @Column(name = "cin", nullable = false, length = 8)
    private String cin;
    @Basic
    @Column(name = "total", nullable = false, precision = 0)
    private double total;
    @Basic
    @Column(name = "liquide", nullable = false, length = 10)
    private String liquide;
    @ManyToOne
    @JoinColumn(name = "cin", referencedColumnName = "cin", nullable = false, insertable = false, updatable = false)
    private Users usersByCin;

}
