package tn.esprit.spring.gestionmagasion.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fournisseur  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private String code;
    private String libelle;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Produit_Fournisseur", joinColumns =
            {
            @JoinColumn(name = "idFournisseur") }, inverseJoinColumns = {
            @JoinColumn(name = "idProduit")})
    @JsonIgnore
    private List<Produit> produits;

    public Fournisseur() {
        produits = new ArrayList<>();
    }

    public Fournisseur(String f1, String s) {
    }

    public Long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "idFournisseur=" + idFournisseur +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", produits=" + produits +
                '}';
    }
}
