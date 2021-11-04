package tn.esprit.spring.gestionmagasion.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionmagasion.Entities.DetailFacture;

@Repository
public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
