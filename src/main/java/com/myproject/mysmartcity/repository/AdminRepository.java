package com.myproject.mysmartcity.repository;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
}
