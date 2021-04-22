package com.myproject.mysmartcity.controller;

import com.myproject.mysmartcity.model.CityBlog;
import com.myproject.mysmartcity.model.CurrentNews;
import com.myproject.mysmartcity.service.CityBlogService;
import com.myproject.mysmartcity.service.CurrentNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class CityBlogController {

    private CityBlogService cityBlogService;

    @Autowired
    public CityBlogController(CityBlogService cityBlogService) {
        this.cityBlogService = cityBlogService;
    }

    @GetMapping
    public List getAllNews() {
        return this.cityBlogService.getAll();
    }

    @PostMapping
    public CityBlog save(@RequestBody CityBlog cityBlog) {
        return this.cityBlogService.save(cityBlog);
    }

    @PutMapping
    public CityBlog update(@RequestBody CityBlog cityBlog) {
        return this.cityBlogService.update(cityBlog);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        this.cityBlogService.delete(id);
    }
}
