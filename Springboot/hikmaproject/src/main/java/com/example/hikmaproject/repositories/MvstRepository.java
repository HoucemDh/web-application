package com.example.hikmaproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hikmaproject.Models.Mvst;

public interface MvstRepository extends JpaRepository<Mvst, String>{

    @SuppressWarnings("null")
    List<Mvst> findAll();

}
