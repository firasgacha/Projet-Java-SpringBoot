package tn.esprit.spring.gestionmagasion.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionmagasion.Entities.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture,Long> {
}
