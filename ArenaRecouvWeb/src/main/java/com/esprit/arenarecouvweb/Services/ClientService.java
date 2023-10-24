package com.esprit.arenarecouvweb.Services;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.arenarecouvweb.Entity.Client;
import com.esprit.arenarecouvweb.Entity.Compte;
import com.esprit.arenarecouvweb.Entity.Dossier;
import com.esprit.arenarecouvweb.Repository.ClientDao;
import com.esprit.arenarecouvweb.Repository.CompteDao;
import com.esprit.arenarecouvweb.Repository.DossierDao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ClientService implements IClientService{
    @Autowired
    ClientDao clientDao;
    @Autowired
    DossierDao dossierDao;
    @Autowired
    CompteDao compteDao;

    @Override
    public Client getClient(String idClient) {
        return clientDao.getClientByIdClient(idClient);
    }

    @Override
    public List<Client> getClients() {
        return clientDao.findAll();
    }

    @Override
    public void generateReport(String idClient) {

    }


}
