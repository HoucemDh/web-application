package com.example.hikmaproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hikmaproject.Models.RotationMp;
import com.example.hikmaproject.repositories.RotationRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RotationMpService {

    @Autowired
    private final RotationRepo rotationRepo;

    public List<RotationMp> findAll(){
        return rotationRepo.findAll();
    }
}
