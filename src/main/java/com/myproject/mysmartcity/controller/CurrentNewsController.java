package com.myproject.mysmartcity.controller;

import com.myproject.mysmartcity.model.CurrentNews;
import com.myproject.mysmartcity.service.CurrentNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/news")
public class CurrentNewsController {

    private CurrentNewsService currentNewsService;

    @Autowired
    public CurrentNewsController(CurrentNewsService currentNewsService) {
        this.currentNewsService = currentNewsService;
    }

    @GetMapping
    public List getAllNews() {
        return this.currentNewsService.getAll();
    }

    @PostMapping
    public CurrentNews save(@RequestBody CurrentNews currentNews) {
        return this.currentNewsService.save(currentNews);
    }

    @PutMapping
    public CurrentNews update(@RequestBody CurrentNews currentNews) {
        return this.currentNewsService.update(currentNews);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        this.currentNewsService.delete(id);
    }
}
