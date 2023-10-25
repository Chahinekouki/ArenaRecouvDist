package com.esprit.arenarecouvweb.Repository;

import com.esprit.arenarecouvweb.Entity.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeDao extends JpaRepository<Groupe,Long> {
    public Groupe getGroupeById(Long id);

}
