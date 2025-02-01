package com.example.hikmaproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hikmaproject.Models.Cde;
import com.example.hikmaproject.repositories.CdeRepository;

@Service
public class Cdeservice {
    @Autowired
    private CdeRepository cdeRepository;
    
    public List<Cde> getAllCommandes(){
        return cdeRepository.findAll();
    }
    
    public List<Cde> getCdeAndArticle(String nocommande,String article){
        return cdeRepository.findByNocommandeAndArticle(nocommande, article);
    }
    public List<Cde> getCdeArticle(String article){
        return cdeRepository.findByArticle(article);
    }
    public List<Cde> getNocommande(String nocommande){
        return cdeRepository.findByNocommande(nocommande);
    }
    public List<Cde> getRaisonsociale(String Raisonsociale){
        return cdeRepository.findByRaisonsociale(Raisonsociale);
    }


}