package com.esprit.arenarecouvweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.arenarecouvweb.Entity.Segment;


@Repository
public interface SegementDao extends JpaRepository<Segment,Long> {
    public Segment findSegmentById(Long id);
}
