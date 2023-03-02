package com.example.model;



@jakarta.persistence.Entity
public class Voiture {
    public enum Couleur {
        Rouge,
        Bleu,
        Verte,
        Jaune,
        Noir,
        Blanche,
        Grise,
        Marron,
        Rose
    }

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private long id;
    private String marque;
    private String modele;

    
    private int annee;
    private Couleur couleur;


    public Voiture() {
    }
    public Voiture(long id, String marque, String modele, int annee, Couleur couleur) {
        super();
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.couleur = couleur;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public Couleur getCouleur() {
        return couleur;
    }
    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
