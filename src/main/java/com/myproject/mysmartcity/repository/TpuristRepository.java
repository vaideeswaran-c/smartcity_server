package com.myproject.mysmartcity.repository;

import com.myproject.mysmartcity.model.Admin;
import com.myproject.mysmartcity.model.Tourist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TpuristRepository extends CrudRepository<Tourist, Long> {
}
