package com.esprit.arenarecouvweb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
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




}
