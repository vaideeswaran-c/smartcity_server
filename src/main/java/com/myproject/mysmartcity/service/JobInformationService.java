package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.JobInformation;

import java.util.List;

public interface JobInformationService {

    List<JobInformation> getAll();

    JobInformation save(JobInformation jobInformation);

    JobInformation update(JobInformation jobInformation);

    void delete(Long id);

}
