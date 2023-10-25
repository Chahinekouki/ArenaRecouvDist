package com.esprit.arenarecouvweb.Repository;

import com.esprit.arenarecouvweb.Entity.Affaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffaireDao extends JpaRepository<Affaire,Long> {
    public Affaire getAffaireByIdAffaire(Long id);


}
