package com.example.hikmaproject.Controllers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.hikmaproject.Models.Cde;
import com.example.hikmaproject.services.Cdeservice;

@Controller
public class CdeController {
    private final Cdeservice Cdeservice;

    public CdeController(Cdeservice cdeservice) {
        Cdeservice = cdeservice;
    }

    @QueryMapping
    public List<Cde> getAllCommande(){
        return Cdeservice.getAllCommandes();
    }

    @QueryMapping
    public List<Cde>getCdeAndArticle(@Argument String nocommande,@Argument String article){
        return Cdeservice.getCdeAndArticle(nocommande, article);
    }
    @QueryMapping
    public List<Cde> getCdeArticle(@Argument String article){
        return Cdeservice.getCdeArticle(article);
    }
    @QueryMapping
    public List<Cde> getNocommande(@Argument String nocommande){
        return Cdeservice.getNocommande(nocommande);
    }
    @QueryMapping
    public List<Cde> getRaisonsociale(@Argument String Raisonsociale){
        return Cdeservice.getRaisonsociale(Raisonsociale);
    }

}
