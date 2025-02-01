package com.example.hikmaproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hikmaproject.Models.Bom;
import java.math.BigDecimal;



public interface BOMRepository extends JpaRepository<Bom, Long> {
        @SuppressWarnings("null")
        List<Bom> findAll();
        List<Bom> findByCodeproduit(String codeproduit);
        List<Bom> findByLibellesMP(String libellesMP);
        List<Bom> findByUnite(String unite);
        List<Bom> findBytaillelot(BigDecimal taillelot);
}
