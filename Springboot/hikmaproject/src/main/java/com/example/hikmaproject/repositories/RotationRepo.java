package com.example.hikmaproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hikmaproject.Models.RotationMp;

public interface RotationRepo extends JpaRepository<RotationMp,Long>{

    @SuppressWarnings("null")
    List<RotationMp> findAll();
}
