package com.example.hikmaproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hikmaproject.repositories.Gstockrepository;
import com.example.hikmaproject.Models.Globalstock;

@Service
public class Globalstockservice {
    private final Gstockrepository Gstockrepository;

    public Globalstockservice(Gstockrepository Gstockrepository) {
        this.Gstockrepository = Gstockrepository;
    }
   
    public List<Globalstock> getAllPaginated(){
        return Gstockrepository.findAll();
    }
    public List<Globalstock> getStatutAndArticle(String statut,String article) {
        return Gstockrepository.findByStatutAndArticle(statut,article);
    }
        
    public List<Globalstock> getArticle(String article){
        return Gstockrepository.findByArticle(article);
    }
    public List<Globalstock> getDesignation(String designation){
        return Gstockrepository.findByDesignation(designation);
    }
    public List<Globalstock> getStatutAndDesignation(String statut, String designation){
        return Gstockrepository.findByStatutAndDesignation(statut, designation);
    }
    public List<Globalstock> getLot(String Lot){
        return Gstockrepository.findBylot(Lot);
    }
}
