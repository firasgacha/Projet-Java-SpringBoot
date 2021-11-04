package tn.esprit.spring.gestionmagasion.Service.Client;


import tn.esprit.spring.gestionmagasion.Entities.Client;

import java.util.List;

public interface ClientService {
    Client add(Client client);
    Client update(Client client, Long id);
    void delete(long id);
    List<Client> findAll();
    Client findById(Long id);
}
