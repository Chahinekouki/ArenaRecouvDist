package com.esprit.arenarecouvweb.Services;

import com.esprit.arenarecouvweb.Entity.Compte;

import java.util.List;

public interface ICompteService {
    public  List<Compte> getCompteByIdClient(String id);
    public List<Compte> getAllComptes();
}
