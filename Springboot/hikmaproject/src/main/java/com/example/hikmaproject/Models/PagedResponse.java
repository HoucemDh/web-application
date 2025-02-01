package com.example.hikmaproject.Models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagedResponse<T> {
    private List<T> content = new ArrayList<>();
    private PageInfo pageInfo = new PageInfo();

    public void setContent(List<T> content) {
        this.content = content != null ? content : new ArrayList<>();
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo != null ? pageInfo : new PageInfo();
    }
}
