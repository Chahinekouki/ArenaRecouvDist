package com.esprit.arenarecouvweb.Repository;

import com.esprit.arenarecouvweb.Entity.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceDao extends JpaRepository<Agence,Long> {
    public Agence findAgenceById(Long id);
}
