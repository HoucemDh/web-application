package com.example.hikmaproject.Controllers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.hikmaproject.Models.Mvst;
import com.example.hikmaproject.services.MvstService;

@Controller
public class MvstController {
    public final MvstService MvstService;

    public MvstController(com.example.hikmaproject.services.MvstService mvstService) {
        MvstService = mvstService;
    }

    @QueryMapping
    public List<Mvst> getAllMvst(){
        return MvstService.getAll();
    }
}
