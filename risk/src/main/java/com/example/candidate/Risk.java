package com.example.candidate;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Risk implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int riskId;
    private String description;
    private double riskScore;
    private String category;
}
