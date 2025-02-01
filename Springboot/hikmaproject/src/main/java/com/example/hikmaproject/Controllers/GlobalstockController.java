package com.example.hikmaproject.Controllers;

import java.util.List;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.example.hikmaproject.Models.Globalstock;
import com.example.hikmaproject.services.Globalstockservice;

@Controller
public class GlobalstockController {

    private final Globalstockservice Globalstockservice;

    public GlobalstockController(Globalstockservice globalstockservice) {
        Globalstockservice = globalstockservice;
    }

    @QueryMapping
    public List<Globalstock> getAllArticles() {
        return Globalstockservice.getAllPaginated();
    }


    

    @QueryMapping
    public List<Globalstock> getStatutAndArticle(@Argument String statut,@Argument String article){
        return Globalstockservice.getStatutAndArticle(statut,article);
    }

    @QueryMapping
    public List<Globalstock> getArticle(@Argument String article){
        return Globalstockservice.getArticle(article);
    }

    @QueryMapping
    public List<Globalstock> getDes(@Argument String designation){
        return Globalstockservice.getDesignation(designation);
    }

    @QueryMapping
    public List<Globalstock> getStatutAndDesignation(@Argument String statut,@Argument String designation){
        return Globalstockservice.getStatutAndDesignation(statut, designation);
    }

    @QueryMapping
    public List<Globalstock> getLot(@Argument String Lot){
        return Globalstockservice.getLot(Lot);
    }
}
