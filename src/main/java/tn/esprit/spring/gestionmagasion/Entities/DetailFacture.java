package tn.esprit.spring.gestionmagasion.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
public class DetailFacture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;

    private int qte;
    private float prixtotal;
    private int pourcentageRemise;
    private float montantRemise;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idFacture")
    private Facture facture;

    @OneToMany()
    @JoinColumn(name = "idDetailFacture")
    private List<Produit> produits;

    public DetailFacture() {
        produits = new ArrayList<>();
    }

    public DetailFacture(int i, float v, int i1, float v1, Facture facture1, Produit produit1) {
    }

    public Long getIdDetailFacture() {
        return idDetailFacture;
    }

    public void setIdDetailFacture(Long idDetailFacture) {
        this.idDetailFacture = idDetailFacture;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public float getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(float prixtotal) {
        this.prixtotal = prixtotal;
    }

    public int getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(int pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public float getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(float montantRemise) {
        this.montantRemise = montantRemise;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
}
