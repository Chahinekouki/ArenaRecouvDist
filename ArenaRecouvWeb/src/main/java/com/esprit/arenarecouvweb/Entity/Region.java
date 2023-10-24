package com.esprit.arenarecouvweb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Region {
    @Id
    private Long id;
    private String libelle;


}
