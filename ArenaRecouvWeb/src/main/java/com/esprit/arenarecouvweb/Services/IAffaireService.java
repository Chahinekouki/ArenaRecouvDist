package com.esprit.arenarecouvweb.Services;

import com.esprit.arenarecouvweb.Entity.Affaire;

import java.util.List;

public interface IAffaireService {
    public List<Long> getAllIdsAffaire();
    public Affaire getAffaireById(Long id);

    public Affaire validateAffaire(Affaire affaire);

    public String getNomPrenomByIdClient(String idClient);
    public String getNombyIddossier(String Dossier);

    public List<Long> getComptesByIdDossier(String idDossier);

    public List<Long> getAffairesByNumDossier(String idDossier);

    public List<Long> getAffairesByIDclients(String idClient);
}
