package com.example.candidate;

import javax.persistence.*;
import java.io.Serializable;

import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Risk implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRisque;
    private Long agence;
    private Integer totalEngagement;
    private String natureProduit;
    private Float montantCreanceEntree;
    private Float tauxICmarge;
    private Float montantRecupere;
    private Float montantICEntree;
    private Float tauxIndexe;
    private Float tauxIRmarge;
    private Float montantFrais;
    private Float montantRestantDut;
    private String observation;


    private String numDossier;



}
