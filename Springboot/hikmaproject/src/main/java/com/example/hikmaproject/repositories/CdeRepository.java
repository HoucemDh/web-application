package com.example.hikmaproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hikmaproject.Models.Cde;


public interface CdeRepository extends JpaRepository<Cde, Long>{

    @SuppressWarnings("null")
    List<Cde> findAll();
    List<Cde> findByNocommandeAndArticle(String nocommande,String article);
    List<Cde> findByArticle(String article);
    List<Cde> findByNocommande(String nocommande);
    List <Cde> findByRaisonsociale(String raisonsociale);
}
