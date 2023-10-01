package com.example.vapexperience.Models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
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
    @JoinColumn(name = "cin", referencedColumnName = "cin", nullable = false,insertable = false,updatable = false)
    private Users usersByCin;

    public String getRefFacture() {
        return refFacture;
    }

    public void setRefFacture(String refFacture) {
        this.refFacture = refFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getLiquide() {
        return liquide;
    }

    public void setLiquide(String liquide) {
        this.liquide = liquide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Facture facture = (Facture) o;

        if (Double.compare(total, facture.total) != 0) return false;
        if (refFacture != null ? !refFacture.equals(facture.refFacture) : facture.refFacture != null) return false;
        if (dateFacture != null ? !dateFacture.equals(facture.dateFacture) : facture.dateFacture != null) return false;
        if (cin != null ? !cin.equals(facture.cin) : facture.cin != null) return false;
        if (liquide != null ? !liquide.equals(facture.liquide) : facture.liquide != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = refFacture != null ? refFacture.hashCode() : 0;
        result = 31 * result + (dateFacture != null ? dateFacture.hashCode() : 0);
        result = 31 * result + (cin != null ? cin.hashCode() : 0);
        temp = Double.doubleToLongBits(total);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (liquide != null ? liquide.hashCode() : 0);
        return result;
    }

    public Users getUsersByCin() {
        return usersByCin;
    }

    public void setUsersByCin(Users usersByCin) {
        this.usersByCin = usersByCin;
    }
}
