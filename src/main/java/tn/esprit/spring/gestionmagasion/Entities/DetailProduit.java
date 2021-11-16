package tn.esprit.spring.gestionmagasion.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class DetailProduit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDerniereModification;

    private CategorieProduit categorieProduit;

    public DetailProduit() {
    }

    public DetailProduit(Date date, Object o, tn.esprit.spring.gestionmagasion.Entities.CategorieProduit alimentaire) {
    }

    public Long getIdDetailProduit() {
        return idDetailProduit;
    }

    public void setIdDetailProduit(Long idDetailProduit) {
        this.idDetailProduit = idDetailProduit;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDerniereModification() {
        return dateDerniereModification;
    }

    public void setDateDerniereModification(Date dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(CategorieProduit categorieProduit) {
        this.categorieProduit = categorieProduit;
    }

    @Override
    public String toString() {
        return "DetailProduit{" +
                "idDetailProduit=" + idDetailProduit +
                ", dateCreation=" + dateCreation +
                ", dateDerniereModification=" + dateDerniereModification +
                ", categorieProduit=" + categorieProduit +
                '}';
    }

    private enum CategorieProduit{
        Electromenager, Alimentaire, Quincaillerie
    }

}
