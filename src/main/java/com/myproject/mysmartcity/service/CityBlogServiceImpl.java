package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.CityBlog;
import com.myproject.mysmartcity.model.CurrentNews;
import com.myproject.mysmartcity.repository.CityBlogRepository;
import com.myproject.mysmartcity.repository.CurrentNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityBlogServiceImpl implements CityBlogService {

    @Autowired
    private CityBlogRepository cityBlogRepository;

    public List<CityBlog> getAll() {
        List<CityBlog> currentNewsList = (List<CityBlog>) cityBlogRepository.findAll();
        return currentNewsList;
    }

    public CityBlog save(CityBlog currentNews) {
        currentNews = cityBlogRepository.save(currentNews);
        return currentNews;
    }

    public CityBlog update(CityBlog currentNews) {
        currentNews = cityBlogRepository.save(currentNews);
        return currentNews;
    }

    public void delete(Long id) {
        cityBlogRepository.deleteById(id);
    }
}
