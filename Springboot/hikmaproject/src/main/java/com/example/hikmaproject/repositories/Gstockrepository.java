package com.example.hikmaproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hikmaproject.Models.Globalstock;

public interface Gstockrepository extends JpaRepository<Globalstock, Long> {

    @SuppressWarnings("null")
    List<Globalstock> findAll();
    List<Globalstock> findByArticle(String article);
    List<Globalstock> findByStatutAndArticle(String statut,String article);
    List<Globalstock> findByDesignation(String designation);
    List<Globalstock> findByStatutAndDesignation(String statut, String designation);
    List<Globalstock> findBylot(String lot);
}
