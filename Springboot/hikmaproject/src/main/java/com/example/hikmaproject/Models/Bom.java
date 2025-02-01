package com.example.hikmaproject.Models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bom")
public class Bom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="codeproduit")
    private String codeproduit;

    @Column(name="BOM_Alternative")
    private byte BOM_Alternative;

    @Column(name="Categorie_Produit")
    private String Categorie_Produit;

    @Column(name="libelles_PF")
    private String libelles_PF;

    @Column(name="taillelot")
    private BigDecimal taillelot;

    @Column(name="article")    
    private String article;

    @Column(name="libellesMP")
    private String libellesMP;

    @Column(name="Qte_besoin")
    private BigDecimal Qte_besoin;

    @Column(name="unite")
    private String unite;
}
