package com.example.candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class RiskService {
    @Autowired
    private RiskRepository riskRepository;

    public Risk save(Risk risk) {
        return riskRepository.save(risk);
    }

    public void delete(int riskId) {
        riskRepository.deleteById(riskId);
    }

    public Risk update(Risk risk) {
        return riskRepository.save(risk);
    }

    public List<Risk> getAll() {
        return riskRepository.findAll();
    }

    public Risk getById(int riskId) {
        return riskRepository.findById(riskId).orElse(null);
    }

}
