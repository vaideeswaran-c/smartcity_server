package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.CityBlog;
import com.myproject.mysmartcity.repository.AboutPageRepository;
import com.myproject.mysmartcity.repository.CityBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutPageServiceImpl implements AboutPageService {

    @Autowired
    private AboutPageRepository aboutPageRepository;

    public List<AboutPage> getAll() {
        List<AboutPage> currentNewsList = (List<AboutPage>) aboutPageRepository.findAll();
        return currentNewsList;
    }

    public AboutPage save(AboutPage currentNews) {
        currentNews = aboutPageRepository.save(currentNews);
        return currentNews;
    }

    public AboutPage update(AboutPage currentNews) {
        currentNews = aboutPageRepository.save(currentNews);
        return currentNews;
    }

    public void delete(Long id) {
        aboutPageRepository.deleteById(id);
    }
}
