package com.esprit.arenarecouvweb.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.arenarecouvweb.Entity.Region;
import com.esprit.arenarecouvweb.Repository.RegionDao;

import java.util.List;
@Service
@Slf4j
public class RegionService implements IRegionServie{
    @Autowired
    RegionDao regionDao;
    @Override
    public List<Region> getAllRegion() {
        return regionDao.findAll();
    }
}
