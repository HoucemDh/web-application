package com.example.hikmaproject.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo {
    private int pageNumber = 0;
    private int pageSize = 10;
    private long totalElements = 0;
    private int totalPages = 0;
    private boolean hasNext = false;
    private boolean hasPrevious = false;
}
