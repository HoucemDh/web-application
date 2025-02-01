package com.example.hikmaproject.Controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.hikmaproject.Models.Bom;
import com.example.hikmaproject.services.Bomservice;

@Controller
public class BomController {
    private final Bomservice bomservice;

    public BomController(Bomservice bomservice) {
        this.bomservice = bomservice;
    }

    @QueryMapping
    public List<Bom> getBom() {
        return bomservice.getBom();
    }
    
    @QueryMapping
    public List<Bom> getCodeProduit(@Argument String codeproduit) {
        return bomservice.getCodeProduit(codeproduit);
    }

    @QueryMapping
    public List<Bom> getLibellesMP(@Argument String libellesMP) {
        return bomservice.getLibellesMP(libellesMP);
    }
    
    @QueryMapping
    public List<Bom> getUnite(@Argument String unite) {
        return bomservice.getUnite(unite);
    }
    @QueryMapping
    public List<Bom> getTaillelot(@Argument BigDecimal taillelot) {
        return bomservice.getTaillelot(taillelot);
    }
    
   
}  

