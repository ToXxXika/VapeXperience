package com.example.vapexperience.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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

    public String getRefLiq() {
        return refLiq;
    }

    public void setRefLiq(String refLiq) {
        this.refLiq = refLiq;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getSaveur() {
        return saveur;
    }

    public void setSaveur(String saveur) {
        this.saveur = saveur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Liquide liquide = (Liquide) o;

        if (refLiq != null ? !refLiq.equals(liquide.refLiq) : liquide.refLiq != null) return false;
        if (libelle != null ? !libelle.equals(liquide.libelle) : liquide.libelle != null) return false;
        if (saveur != null ? !saveur.equals(liquide.saveur) : liquide.saveur != null) return false;
        if (type != null ? !type.equals(liquide.type) : liquide.type != null) return false;
        if (marque != null ? !marque.equals(liquide.marque) : liquide.marque != null) return false;
        if (description != null ? !description.equals(liquide.description) : liquide.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = refLiq != null ? refLiq.hashCode() : 0;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (saveur != null ? saveur.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (marque != null ? marque.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
