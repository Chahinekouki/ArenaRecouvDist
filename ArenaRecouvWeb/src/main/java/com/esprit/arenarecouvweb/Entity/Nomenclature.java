package com.esprit.arenarecouvweb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Nomenclature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cacc ;
    private Long cnom ;
    private String libelle;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idNom;

}
