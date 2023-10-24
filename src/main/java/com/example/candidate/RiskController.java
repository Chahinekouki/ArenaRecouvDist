package com.example.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risque")  // Set the base path for this controller
public class RiskController {
    @Autowired
    private RiskService riskService;

    @PostMapping("/ajouter")  // Endpoint: /risque/ajouter
    public Risk addRisk(@RequestParam Risk risk) {
        return riskService.save(risk);
    }

    @PutMapping("/{riskId}")  // Endpoint: /risque/{riskId}
    public Risk updateRisk(@PathVariable int riskId, @RequestBody Risk risk) {
        risk.setIdRisque(riskId);
        return riskService.update(risk);
    }

    @DeleteMapping("/DeleteRisque/{riskId}")  // Endpoint: /risque/{riskId}
    public void deleteRisk(@PathVariable int riskId) {
        riskService.delete(riskId);
    }

    @GetMapping("/getAll")  // Endpoint: /risque/getAll
    public List<Risk> getAllRisks() {
        return riskService.getAll();
    }

    @GetMapping("/getRisqueByIdRisque/{riskId}")  // Endpoint: /risque/{riskId}
    public Risk getRisk(@PathVariable int riskId) {
        return riskService.getById(riskId);
    }
}
