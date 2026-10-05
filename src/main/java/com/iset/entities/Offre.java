package com.iset.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Offre {

    @Id
    @GeneratedValue
    private Long code;

    private String intitulé;
    private String spécialité;
    private String société;
    private int nbpostes;
    private String pays;

    public Offre() {
    }

    public Offre(String intitulé, String spécialité, String société,
                  int nbpostes, String pays) {
        this.intitulé = intitulé;
        this.spécialité = spécialité;
        this.société = société;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public String getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }

    public String getSociété() {
        return société;
    }

    public void setSociété(String société) {
        this.société = société;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}