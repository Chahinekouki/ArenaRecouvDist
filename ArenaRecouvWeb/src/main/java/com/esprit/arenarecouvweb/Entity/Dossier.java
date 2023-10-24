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
public class Dossier {
    @Id
    private String numDossier;
    private String classeIMP;//
    private String classeFinal;//
    private Long typeDossier;
    private Integer joursdb;
    private Integer jourimp;
    @Temporal(TemporalType.DATE)
    private Date entreCTX;
    @Temporal(TemporalType.DATE)
    private Date sortieCTX;
    @Temporal(TemporalType.DATE)
    private Date entreRecouv;
    @Temporal(TemporalType.DATE)
    private Date sortieRecouv;
    private Float encoursGlobal;//
    private Float mntImpaye;//
    private Float mntSdb;//
    private String  phase;//


    private String idClient; //





}
