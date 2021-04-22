package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.CityBlog;

import java.util.List;

public interface AboutPageService {

    List<AboutPage> getAll();

    AboutPage save(AboutPage aboutPage);

    AboutPage update(AboutPage aboutPage);

    void delete(Long id);

}
