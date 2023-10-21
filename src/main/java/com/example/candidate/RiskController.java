package com.example.candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risks")
public class RiskController {
    @Autowired
    private RiskService riskService; // Assuming you have a RiskService defined

    @PostMapping
    public Risk addRisk(@RequestBody Risk risk) {
        return riskService.save(risk);
    }

    @PutMapping("/{riskId}")
    public Risk updateRisk(@PathVariable int riskId, @RequestBody Risk risk) {
        risk.setRiskId(riskId); // Set the risk ID based on the path variable
        return riskService.update(risk);
    }

    @DeleteMapping("/{riskId}")
    public void deleteRisk(@PathVariable int riskId) {
        riskService.delete(riskId);
    }

    @GetMapping
    public List<Risk> getAllRisks() {
        return riskService.getAll();
    }

    @GetMapping("/{riskId}")
    public Risk getRisk(@PathVariable int riskId) {
        return riskService.getById(riskId);
    }

}
