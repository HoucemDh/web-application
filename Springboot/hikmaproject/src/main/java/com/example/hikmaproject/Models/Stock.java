package com.example.hikmaproject.Models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="article")
    private String article;
    @Column(name="designation")
    private String designation;
    @Column(name="Unite")
    private String Unite;
    @Column(name="Famille")
    private String Famille;
    @Column(name="QuantiteA")
    private BigDecimal QuantiteA;
    @Column(name="QuantiteAC")
    private BigDecimal QuantiteAC;
    @Column(name="SommeA_AC")
    private BigDecimal SommeA_AC;
    @Column(name="QuantiteQ")
    private BigDecimal QuantiteQ;
    @Column(name="QuantiteQPR")
    private BigDecimal QuantiteQPR;
    @Column(name="OFPlanifie")
    private BigDecimal OFPlanifie;
    @Column(name="OFSuggere")
    private BigDecimal OFSuggere;
    @Column(name="SommeOFFerme")
    private BigDecimal SommeOFFerme;
    @Column(name="sommeDA")
    private BigDecimal sommeDA;
    @Column(name="SommeCDE")
    private BigDecimal SommeCDE;
    @Column(name="UniteStock")
    private String UniteStock;
    @Column(name="NBlinge")
    private Integer NBlinge;
    @Column(name="Qinimum")
    private BigDecimal Qinimum;
    @Column(name="PMP")
    private BigDecimal PMP;
    @Column(name="Pays")
    private String Pays;
    @Column(name="Leadtime")
    private BigDecimal Leadtime;
    @Column(name="Stocksecurite")
    private BigDecimal Stocksecurite;
    
    @Transient
    private BigDecimal Dispo_Of;

}
