package com.example.hikmaproject.Controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.hikmaproject.Models.Stock;
import com.example.hikmaproject.Models.PagedResponse;
import com.example.hikmaproject.Models.PageInfo;
import com.example.hikmaproject.services.Stockservice;

@Controller
public class StockController {
    private final Stockservice stockService;

    public StockController(Stockservice stockService) {
        this.stockService = stockService;
    }

    @QueryMapping
    public PagedResponse<Stock> getAllPaginated(@Argument int page, @Argument int size) {
        Page<Stock> stockPage = stockService.getAllPaginated(page, size);
        return createPagedResponse(stockPage);
    }

    private PagedResponse<Stock> createPagedResponse(Page<Stock> page) {
        PageInfo pageInfo = new PageInfo(
            page.getNumber(),
            page.getSize(),
            page.getTotalElements(),
            page.getTotalPages(),
            page.hasNext(),
            page.hasPrevious()
        );
        return new PagedResponse<>(page.getContent(), pageInfo);
    }

    @QueryMapping
    public List<Stock> searchStock(@Argument String query) {
        return stockService.searchByArticleOrDesignation(query);
    }

    @MutationMapping
    public Boolean saveDispoOfToRotationMp() {
    stockService.saveDispoOfToRotationMp();
    return true;
}
}