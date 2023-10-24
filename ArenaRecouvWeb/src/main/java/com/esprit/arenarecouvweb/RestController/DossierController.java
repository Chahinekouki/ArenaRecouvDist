package com.esprit.arenarecouvweb.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.esprit.arenarecouvweb.Entity.*;
import com.esprit.arenarecouvweb.Services.*;


import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

@RestController

@RequestMapping("/dossier")
public class DossierController {
    @Autowired
    DossierService dossierService;
    @Autowired
    RegionService regionService;
    @Autowired
    CompteService compteService;
    @Autowired
    RechercheService rechercheService;
    @Autowired
    ReportService reportService;



    @GetMapping("/getalldossier")
    public List<Dossier> getDossiers() {
        return dossierService.returnAllDossier();
    }

    @GetMapping("/getallregion")
    public List<Region> getRegions() {
        return regionService.getAllRegion();
    }

    @GetMapping("/getRegionbyId/{id}")
    public Region getRegionsByid(@PathVariable Long id) {
        return dossierService.returnRegionById(id);
    }

    @GetMapping("/getallgroups")
    public List<Groupe> getGroups() {
        return dossierService.returnGroupes();
    }

    @GetMapping("/getGroupnbyId/{id}")
    public Groupe getGroupByid(@PathVariable Long id) {
        return dossierService.returnGroupeById(id);
    }

    @GetMapping("/getallsegments")
    public List<Segment> getsegments() {
        return dossierService.returnSegments();
    }

    @GetMapping("/getSegmentbyId/{id}")
    public Segment getSegmentByid(@PathVariable Long id) {
        return dossierService.returnSegmentById(id);
    }

    @GetMapping("/getallMarches")
    public List<Marche> getMarches() {
        return dossierService.returnMarches();
    }

    @GetMapping("/getMarchebyId/{id}")
    public Marche getMarcheByid(@PathVariable Long id) {
        return dossierService.returnMarcheById(id);
    }

    @GetMapping("/getDossierByNumDossier/{id}")
    public Dossier getDossierBynumDossier(@PathVariable String  id) {
        return dossierService.getDossierByNumDossier(id);
    }

    @GetMapping("/getComptebyIdclient/{id}")
    public  List<Compte> getComptesbyIdclient(@PathVariable String id) {
        return compteService.getCompteByIdClient(id);
    }

    @GetMapping("/getAllcomptes")
    public  List<Compte> getAllComptes() {
        return compteService.getAllComptes();
    }

    @GetMapping("/getIdClientByIdDossier/{id}")
    public  String getIdClientByIdDossier(@PathVariable String  id) {
        return dossierService.getIdClientByIdDossier(id);
    }

    @GetMapping("/getallTypeDossier")
    public List<TypeDossier> getTypeDossier() {
        return dossierService.returnTypeDossier();
    }

    @GetMapping("/getTypeDossierbyId/{id}")
    public TypeDossier getTypeDossierByid(@PathVariable Long id) {
        return dossierService.returntypedossierById(id);
    }

    @GetMapping("/getallAgences")
    public List<Agence> getAgences() {
        return dossierService.returnAgences();
    }

    @GetMapping("/getAgencebyId/{id}")
    public Agence getAgenceByid(@PathVariable Long id) {
        return dossierService.returnAgenceById(id);
    }


/*
    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format)  {
        try {
            return reportService.exportReport(format);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/reportInfo/{format}/{idClient}")
    public String generateReport(@PathVariable String format ,@PathVariable String idClient )  {
        try {
            return reportService.infoReport(format,idClient);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/reportNew/{idClient}")
    public String re(@PathVariable String idClient) {
        try {
            return reportService.generateCombinedReport(idClient);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/
}
