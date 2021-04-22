package com.myproject.mysmartcity.repository;

import com.myproject.mysmartcity.model.CityBlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityBlogRepository extends CrudRepository<CityBlog, Long> {
}
