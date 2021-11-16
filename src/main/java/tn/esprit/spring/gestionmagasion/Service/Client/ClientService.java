package tn.esprit.spring.gestionmagasion.Service.Client;


import tn.esprit.spring.gestionmagasion.Entities.CategorieClient;
import tn.esprit.spring.gestionmagasion.Entities.Client;

import java.util.Date;
import java.util.List;

public interface ClientService {
    Client add(Client client);
    Client update(Client client, Long id);
    void delete(long id);
    List<Client> findAll();
    Client findById(Long id);
    float getChiffreAffiareParCategorie(CategorieClient categorieClient, Date startDate, Date EndDate);
}
