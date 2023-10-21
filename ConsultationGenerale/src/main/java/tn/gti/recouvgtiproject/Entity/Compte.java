package tn.gti.recouvgtiproject.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compte {
    @Id
    private Long numCompte;
    private Long agence;
    private Float montant;
    private Long typeDossier;
    private Float mntImpaye;
    private Integer jrImpaye;
    private Float mntSdb;
    private Integer jrSdb;

    private String idClient;

    public Compte() {
    }

    public Compte(Long numCompte, Long agence, Float montant, Long typeDossier, Float mntImpaye, Integer jrImpaye, Float mntSdb, Integer jrSdb, String idClient) {
        this.numCompte = numCompte;
        this.agence = agence;
        this.montant = montant;
        this.typeDossier = typeDossier;
        this.mntImpaye = mntImpaye;
        this.jrImpaye = jrImpaye;
        this.mntSdb = mntSdb;
        this.jrSdb = jrSdb;
        this.idClient = idClient;
    }

    public Long getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(Long numCompte) {
        this.numCompte = numCompte;
    }

    public Long getAgence() {
        return agence;
    }

    public void setAgence(Long agence) {
        this.agence = agence;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public Long getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(Long typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Float getMntImpaye() {
        return mntImpaye;
    }

    public void setMntImpaye(Float mntImpaye) {
        this.mntImpaye = mntImpaye;
    }

    public Integer getJrImpaye() {
        return jrImpaye;
    }

    public void setJrImpaye(Integer jrImpaye) {
        this.jrImpaye = jrImpaye;
    }

    public Float getMntSdb() {
        return mntSdb;
    }

    public void setMntSdb(Float mntSdb) {
        this.mntSdb = mntSdb;
    }

    public Integer getJrSdb() {
        return jrSdb;
    }

    public void setJrSdb(Integer jrSdb) {
        this.jrSdb = jrSdb;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }
}
