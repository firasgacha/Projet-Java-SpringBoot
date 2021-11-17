package tn.esprit.spring.gestionmagasion.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionmagasion.Entities.Facture;

import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<Facture,Long>
{
    @Query(value = "select f from Facture f where f.client = :idClient")
    List<Facture> findFactureByClient(@Param("idClient")Long idClient);
}
