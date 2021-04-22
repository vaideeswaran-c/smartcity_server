package com.myproject.mysmartcity.controller;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.CityBlog;
import com.myproject.mysmartcity.service.AboutPageService;
import com.myproject.mysmartcity.service.CityBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/about")
public class AboutPageController {

    private AboutPageService aboutPageService;

    @Autowired
    public AboutPageController(AboutPageService aboutPageService) {
        this.aboutPageService = aboutPageService;
    }

    @GetMapping
    public List getAllNews() {
        return this.aboutPageService.getAll();
    }

    @PostMapping
    public AboutPage save(@RequestBody AboutPage aboutPage) {
        return this.aboutPageService.save(aboutPage);
    }

    @PutMapping
    public AboutPage update(@RequestBody AboutPage aboutPage) {
        return this.aboutPageService.update(aboutPage);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        this.aboutPageService.delete(id);
    }
}
