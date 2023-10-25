package com.esprit.arenarecouvweb.Repository;

import com.esprit.arenarecouvweb.Entity.TypeDossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDossierDao extends JpaRepository<TypeDossier,Long> {
    public TypeDossier findTypeDossierById(Long id);
}
