package com.esprit.arenarecouvweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.arenarecouvweb.Entity.Nomenclature;
@Repository
public interface nomenDao extends JpaRepository<Nomenclature,Long> {
    public Nomenclature getNomenclatureByIdNom(String idNom);
}
