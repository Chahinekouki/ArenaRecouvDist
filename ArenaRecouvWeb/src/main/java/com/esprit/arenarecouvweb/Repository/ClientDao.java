package com.esprit.arenarecouvweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.arenarecouvweb.Entity.Client;

import java.util.List;

@Repository
public interface ClientDao extends JpaRepository<Client, String> {
    public Client getClientByIdClient(String idClient);

    public List<Client> findByNomPrenom(String nomPrenom);
}
