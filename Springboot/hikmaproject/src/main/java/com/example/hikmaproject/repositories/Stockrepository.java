package com.example.hikmaproject.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.hikmaproject.Models.Stock;

@Repository
public interface Stockrepository extends JpaRepository<Stock, Long> {
    @SuppressWarnings("null")
    Page<Stock> findAll(Pageable pageable);
    
    List<Stock> findByArticleContainingIgnoreCaseOrDesignationContainingIgnoreCase(String article, String designation);
}