package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.CurrentNews;
import com.myproject.mysmartcity.repository.CurrentNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrentNewsServiceImpl implements CurrentNewsService {

    @Autowired
    private CurrentNewsRepository currentNewsRepository;

    public List<CurrentNews> getAll() {
        List<CurrentNews> currentNewsList = (List<CurrentNews>) currentNewsRepository.findAll();
        return currentNewsList;
    }

    public CurrentNews save(CurrentNews currentNews) {
        currentNews = currentNewsRepository.save(currentNews);
        return currentNews;
    }

    public CurrentNews update(CurrentNews currentNews) {
        currentNews = currentNewsRepository.save(currentNews);
        return currentNews;
    }

    public void delete(Long id) {
        currentNewsRepository.deleteById(id);
    }
}
