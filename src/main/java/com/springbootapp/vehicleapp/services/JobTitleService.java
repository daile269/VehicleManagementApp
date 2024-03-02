package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.JobTitle;
import com.springbootapp.vehicleapp.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {
    @Autowired
    private JobTitleRepository jobTitleRepository;

    public List<JobTitle> getJobTitle(){
        return jobTitleRepository.findAll();
    }

    public void saveJobTitle(JobTitle jobTitle){
        jobTitleRepository.save(jobTitle);
    }

    public Optional<JobTitle> findById(Long id){
        return jobTitleRepository.findById(id);
    }

    public void deleteJobTitle(Long id){
        jobTitleRepository.deleteById(id);
    }
}
