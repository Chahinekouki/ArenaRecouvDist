package com.esprit.arenarecouvweb.Repository;

import com.esprit.arenarecouvweb.Entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionDao extends JpaRepository<Mission,Long> {

    public Mission getMissionsByIdMission(Long idMission);
}
