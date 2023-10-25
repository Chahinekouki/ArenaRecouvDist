package com.esprit.arenarecouvweb.RestController;

import com.esprit.arenarecouvweb.Services.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mission")
public class MissionController {
    @Autowired
    MissionService missionService;
}
