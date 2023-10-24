package com.esprit.arenarecouvweb.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.arenarecouvweb.Entity.Compte;
import com.esprit.arenarecouvweb.Repository.CompteDao;

import java.util.List;

@Service
@Slf4j
public class CompteService implements ICompteService {
    @Autowired
    CompteDao compteDao;

    @Override
    public  List<Compte> getCompteByIdClient(String id) {
        return  compteDao.getComptesByIdClient(id);
    }

    @Override
    public List<Compte> getAllComptes() {
        return compteDao.findAll();
    }
}
