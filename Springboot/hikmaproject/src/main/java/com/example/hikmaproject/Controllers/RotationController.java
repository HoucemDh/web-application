package com.example.hikmaproject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.hikmaproject.Models.RotationMp;
import com.example.hikmaproject.services.RotationMpService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class RotationController {

    @Autowired
    private final RotationMpService rotationMpService;

    @QueryMapping
    public List<RotationMp> getAllRotation(){
        return rotationMpService.findAll();
    }
}
