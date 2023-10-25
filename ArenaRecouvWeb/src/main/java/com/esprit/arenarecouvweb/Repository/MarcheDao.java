package com.esprit.arenarecouvweb.Repository;

import com.esprit.arenarecouvweb.Entity.Marche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MarcheDao extends JpaRepository<Marche,Long> {
    public Marche findMarcheById(Long id);
}
