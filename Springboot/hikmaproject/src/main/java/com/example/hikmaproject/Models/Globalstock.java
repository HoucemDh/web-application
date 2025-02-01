package com.example.hikmaproject.Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;



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
@Table(name = "globalstock")
public class Globalstock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="Article")
    private String article;
    @Column(name="designation")
    private String designation;
    @Column(name="Categorie")
    private String Categorie;
    @Column(name="Quantite_US")
    private BigDecimal Quantite_US;
    @Column(name="Unite_stock")
    private String Unite_stock;
    @Column(name="Quantite_active_US")
    private BigDecimal Quantite_active_US;
    @Column(name="Quantite_Allouee")
    private BigDecimal Quantite_Allouee;
    @Column(name="Lot")
    private String lot;
    @Column(name="S_lot")
    private String S_lot;
    @Column(name="Identifiant")
    private String Identifiant;
    @Column(name="Identifiant2")
    private String Identifiant2;
    @Column(name="Emplacement")
    private String Emplacement;
    @Column(name="statut")
    private String statut;
    @Column(name="Lot_fournisseur")
    private String Lot_fournisseur;
    @Column(name="Date_Peremption")
    private LocalDateTime Date_Peremption;
    @Column(name="Date_recontrole")
    private LocalDateTime Date_recontrole;
    @Column(name="Demande_analyse")
    private String Demande_analyse;
    @Column(name="Quantite_UC")
    private BigDecimal Quantite_UC;
    @Column(name="Coef_UC_US")
    private BigDecimal Coef_UC_US;
    
}
