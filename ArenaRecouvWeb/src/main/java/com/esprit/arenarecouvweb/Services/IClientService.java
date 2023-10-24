package com.esprit.arenarecouvweb.Services;

import com.esprit.arenarecouvweb.Entity.Client;

import java.util.List;

public interface IClientService {
    public Client getClient(String idClient);
    public List<Client> getClients();


    public void generateReport(String idClient);

}
