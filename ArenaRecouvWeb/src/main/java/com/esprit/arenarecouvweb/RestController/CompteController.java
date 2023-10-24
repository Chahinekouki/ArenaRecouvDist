package com.esprit.arenarecouvweb.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.arenarecouvweb.Services.CompteService;

@RestController
@RequestMapping("/compte")
public class CompteController {
    @Autowired
    CompteService compteService;
}
