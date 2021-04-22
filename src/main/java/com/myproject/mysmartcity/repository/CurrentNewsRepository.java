package com.myproject.mysmartcity.repository;

import com.myproject.mysmartcity.model.CurrentNews;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentNewsRepository extends CrudRepository<CurrentNews, Long> {
}
