package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.JobInformation;
import com.myproject.mysmartcity.repository.AboutPageRepository;
import com.myproject.mysmartcity.repository.JobInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobInformationServiceImpl implements JobInformationService {

    @Autowired
    private JobInformationRepository jobInformationRepository;

    public List<JobInformation> getAll() {
        List<JobInformation> currentNewsList = (List<JobInformation>) jobInformationRepository.findAll();
        return currentNewsList;
    }

    public JobInformation save(JobInformation currentNews) {
        currentNews = jobInformationRepository.save(currentNews);
        return currentNews;
    }

    public JobInformation update(JobInformation currentNews) {
        currentNews = jobInformationRepository.save(currentNews);
        return currentNews;
    }

    public void delete(Long id) {
        jobInformationRepository.deleteById(id);
    }
}
