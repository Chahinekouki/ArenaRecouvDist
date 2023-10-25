package com.esprit.arenarecouvweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.arenarecouvweb.Entity.classe;

@Repository

public interface ClasseDao extends JpaRepository<classe,Long> {
}
