package com.myproject.mysmartcity.repository;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.JobInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInformationRepository extends CrudRepository<JobInformation, Long> {
}
