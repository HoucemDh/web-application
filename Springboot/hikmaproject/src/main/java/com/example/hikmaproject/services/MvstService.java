package com.example.hikmaproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hikmaproject.Models.Mvst;
import com.example.hikmaproject.repositories.MvstRepository;

@Service
public class MvstService {
    public final MvstRepository MvstRepository;

    public MvstService(MvstRepository mvstRepository) {
        MvstRepository = mvstRepository;
    }

    public List<Mvst> getAll(){
        return MvstRepository.findAll();
    }
}
