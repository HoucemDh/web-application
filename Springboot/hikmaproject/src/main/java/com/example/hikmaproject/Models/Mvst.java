package com.example.hikmaproject.Models;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="mvst")
public class Mvst {
    
    @Id
    @Column(name="article")
    private String article;
    @Column(name="Designation")
    private String Designation;
    @Column(name="Date_imputation")
    private LocalDateTime Date_imputation;
    @Column(name="Quantite_US")
    private BigDecimal Quantite_US;
    @Column(name="Unite_stock")
    private String Unite_stock;
    @Column(name="Quantite")
    private BigDecimal Quantite;
    @Column(name="Unite")
    private String Unite;
    @Column(name="Statut")
    private String Statut;
    @Column(name="Lot")
    private String Lot;
    @Column(name="S_lot")
    private String S_lot;
    @Column(name="Identifiant1")
    private String Identifiant1;
    @Column(name="Identifiant2")
    private String Identifiant2;
    @Column(name="Lot_fournisseur")
    private String Lot_fournisseur;
    @Column(name="Emplacement")
    private String Emplacement;
    @Column(name="Type_transaction")
    private byte Type_transaction;
    @Column(name="Tiers")
    private String Tiers;
    @Column(name="Type_piece")
    private byte Type_piece;
    @Column(name="piece")
    private String piece;
    @Column(name="Piece_origine")
    private String Piece_origine;
    @Column(name="No_ligne_piece")
    private int No_ligne_piece;
    @Column(name="Date_creation")
    private LocalDateTime Date_creation;
    @Column(name="Operateur_creation")
    private String Operateur_creation;
    @Column(name="Date_peremption")
    private LocalDateTime Date_peremption;
    @Column(name="DLU")
    private LocalDateTime DLU;
    @Column(name="Affaire")
    private String Affaire;
}
