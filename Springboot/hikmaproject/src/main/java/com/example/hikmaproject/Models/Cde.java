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
@Table(name="cde")
public class Cde {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="nocommande")
    private String nocommande;
    @Column(name="Date_commande")
    private LocalDateTime Date_commande;
    @Column(name="Date_recept_prevue")
    private LocalDateTime Date_recept_prevue;
    @Column(name="Fournisseur")
    private String Fournisseur;
    @Column(name="Raison_sociale")
    private String raisonsociale;
    @Column(name="article")
    private String article;
    @Column(name="Designation")
    private String Designation;
    @Column(name="Quantite_UA")
    private BigDecimal Quantite_UA;
    @Column(name="Quantite_US")
    private BigDecimal Quantite_US;
    @Column(name="Unite_achat")
    private String Unite_achat;
    @Column(name="Reste_livrer")
    private BigDecimal Reste_livrer;
    @Column(name="Devise")
    private String Devise;
    @Column(name="Prix_brut")
    private BigDecimal Prix_brut;
    @Column(name="Montant_ligne")
    private BigDecimal Montant_ligne;
    @Column(name="Pays")
    private String Pays;
    @Column(name="Condition_paiement")
    private String Condition_paiement;
    @Column(name="Ligne_soldee")
    private byte Ligne_soldee;
    @Column(name="Solde_Reception")
    private byte Solde_Reception;
    @Column(name="Qte_Recept_UA")
    private BigDecimal Qte_Recept_UA;
    @Column(name="Qte_Facture_UA")
    private BigDecimal Qte_Facture_UA;
    @Column(name="Reste_livrer_US")
    private BigDecimal Reste_livrer_US;
    @Column(name="Mode_livraison")
    private String Mode_livraison;
    @Column(name="Type_Achat")
    private byte Type_Achat;
    @Column(name="Piece_Origine")
    private String Piece_Origine;
    @Column(name="Categorie") 
    private String Categorie;
    @Column(name="Facturee")
    private byte Facturee;
    @Column(name="Imprimee")
    private byte Imprimee;
    @Column(name="Signee")
    private byte Signee;
    @Column(name="Date_confirm_frs")
    private LocalDateTime Date_confirm_frs;
    @Column(name="Date_rec_facture")
    private LocalDateTime Date_rec_facture;
    @Column(name="Date_doc_transport")
    private LocalDateTime Date_doc_transport;
    @Column(name="Date_embarquement")
    private LocalDateTime Date_embarquement;
    @Column(name="Date_prevue_arr_port")
    private LocalDateTime Date_prevue_arr_port;
    @Column(name="Date_avis_arrivee")
    private LocalDateTime Date_avis_arrivee;
    @Column(name="Date_rec_site")
    private LocalDateTime Date_rec_site;
    @Column(name="dispo_of")
    private BigDecimal dispo_of;


    
}
