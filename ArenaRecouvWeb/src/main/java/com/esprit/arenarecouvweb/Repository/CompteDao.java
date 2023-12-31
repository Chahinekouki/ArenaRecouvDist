package com.esprit.arenarecouvweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.arenarecouvweb.Entity.Compte;

import java.util.List;

@Repository
public interface CompteDao extends JpaRepository<Compte,Long> {
    public List<Compte> getComptesByIdClient(String id);

}
