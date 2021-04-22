package com.myproject.mysmartcity.controller;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.JobInformation;
import com.myproject.mysmartcity.service.AboutPageService;
import com.myproject.mysmartcity.service.JobInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job")
public class JobInformationController {

    private JobInformationService jobInformationService;

    @Autowired
    public JobInformationController(JobInformationService jobInformationService) {
        this.jobInformationService = jobInformationService;
    }

    @GetMapping
    public List getAllNews() {
        return this.jobInformationService.getAll();
    }

    @PostMapping
    public JobInformation save(@RequestBody JobInformation aboutPage) {
        return this.jobInformationService.save(aboutPage);
    }

    @PutMapping
    public JobInformation update(@RequestBody JobInformation aboutPage) {
        return this.jobInformationService.update(aboutPage);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        this.jobInformationService.delete(id);
    }
}
