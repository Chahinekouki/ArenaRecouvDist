package com.esprit.arenarecouvweb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Affaire {
    @Id
    private Long idAffaire;
    private String nomPrenom;
    private String ncpt;
    private String affaire;
    private String natureAss;
    private String juridiction;
    private String avocat;
    private Float montantImp;
    @Temporal(TemporalType.DATE)
    private Date dateTransmission;
    @Temporal(TemporalType.DATE)
    private Date dateAudience;
    private String tribunal;
    private String localite;
    private Integer numAffaire;
    @Temporal(TemporalType.DATE)
    private Date dateJugement;
    private String dispositif;
    private Float mntJugement;
    private Float mntPr;
    private Float mntIntr;
    private Float mntAutres;

    private String numDossier;

}
