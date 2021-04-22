package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.CurrentNews;
import java.util.*;

public interface CurrentNewsService {

    List<CurrentNews> getAll();

    CurrentNews save(CurrentNews currentNews);

    CurrentNews update(CurrentNews currentNews);

    void delete(Long id);

}
