package com.esprit.arenarecouvweb.Repository;

import com.esprit.arenarecouvweb.Entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActionDao extends JpaRepository<Action,Long> {

    @Query(value = "CALL displayActionsByClient(:idClient);", nativeQuery = true)
    public List<Action> returnActionsByIdClient(@Param("idClient") String idClient);


}
