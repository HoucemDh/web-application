package com.example.hikmaproject.services;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.hikmaproject.Models.RotationMp;
import com.example.hikmaproject.Models.Stock;
import com.example.hikmaproject.repositories.RotationRepo;
import com.example.hikmaproject.repositories.Stockrepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class Stockservice {
    private static final Logger logger = LoggerFactory.getLogger(Stockservice.class);
    private final Stockrepository stockRepository;
    private final StockCalculationService calculationService;
    private final RotationRepo rotationMpRepository;

    public Stockservice(Stockrepository stockRepository, StockCalculationService calculationService,RotationRepo rotationMpRepository) {
        this.stockRepository = stockRepository;
        this.calculationService = calculationService;
        this.rotationMpRepository=rotationMpRepository;
    }
    
    public Page<Stock> getAllPaginated(int page, int size) {
        Page<Stock> stockPage = stockRepository.findAll(PageRequest.of(page, size));
        stockPage.getContent().forEach(stock -> {
            try {
                BigDecimal dispoOf = calculationService.calculateDispoOf(stock);
                stock.setDispo_Of(dispoOf);
                logger.info("Set Dispo_Of for stock {}: {}", stock.getId(), dispoOf);
            } catch (Exception e) {
                logger.error("Error calculating Dispo_Of for stock {}: {}", stock.getId(), e.getMessage());
            }
        });
        return stockPage;
    }
    
    public List<Stock> searchByArticleOrDesignation(String query) {
        List<Stock> stocks = stockRepository.findByArticleContainingIgnoreCaseOrDesignationContainingIgnoreCase(query, query);
        stocks.forEach(stock -> {
            try {
                BigDecimal dispoOf = calculationService.calculateDispoOf(stock);
                stock.setDispo_Of(dispoOf);
                logger.info("Set Dispo_Of for stock {}: {}", stock.getId(), dispoOf);
            } catch (Exception e) {
                logger.error("Error calculating Dispo_Of for stock {}: {}", stock.getId(), e.getMessage());
            }
        });
        return stocks;
    }


    public void saveDispoOfToRotationMp() {
        List<Stock> stocks = stockRepository.findAll();
        stocks.forEach(stock -> {
            BigDecimal dispoOf = calculationService.calculateDispoOf(stock);
            RotationMp rotationMp = new RotationMp();
            rotationMp.setDispoof(dispoOf);
            rotationMpRepository.save(rotationMp);
        });
    }
}