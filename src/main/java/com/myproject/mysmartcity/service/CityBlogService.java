package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.CityBlog;
import java.util.List;

public interface CityBlogService {

    List<CityBlog> getAll();

    CityBlog save(CityBlog cityBlog);

    CityBlog update(CityBlog cityBlog);

    void delete(Long id);

}
