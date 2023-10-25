package com.esprit.arenarecouvweb.Repository;

import com.esprit.arenarecouvweb.Entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionDao extends JpaRepository<Region,Long> {
    public Region getRegionById(Long id);
}
