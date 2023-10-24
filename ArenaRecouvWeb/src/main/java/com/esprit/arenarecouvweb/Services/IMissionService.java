package com.esprit.arenarecouvweb.Services;

import com.esprit.arenarecouvweb.Entity.Mission;

import java.util.List;

public interface IMissionService {
    public Mission validated(Mission ms);
    public List<Long> getIdMissionsByIdClient(String idClient);
    public Mission getMissionByIdMission(Long idMission);
}
