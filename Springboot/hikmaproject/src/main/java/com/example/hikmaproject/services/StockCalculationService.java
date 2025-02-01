package com.example.hikmaproject.services;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import com.example.hikmaproject.Models.Stock;

@Service
public class StockCalculationService {
    
    public BigDecimal calculateDispoOf(Stock stock) {
        BigDecimal sommeAAC = stock.getSommeA_AC() != null ? stock.getSommeA_AC() : BigDecimal.ZERO;
        BigDecimal quantiteQ = stock.getQuantiteQ() != null ? stock.getQuantiteQ() : BigDecimal.ZERO;
        BigDecimal sommeOFFerme = stock.getSommeOFFerme() != null ? stock.getSommeOFFerme() : BigDecimal.ZERO;
        
        return sommeAAC.add(quantiteQ).subtract(sommeOFFerme);
    }
}