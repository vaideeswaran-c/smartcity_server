package com.myproject.mysmartcity.repository;

import com.myproject.mysmartcity.model.Admin;
import com.myproject.mysmartcity.model.Citizen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiaenRepository extends CrudRepository<Citizen, Long> {
}
