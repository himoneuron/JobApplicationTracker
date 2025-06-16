package com.jobtracker.job_tracker.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobtracker.job_tracker.dto.JobApplicationDTO;
import com.jobtracker.job_tracker.entity.JobApplication;
import com.jobtracker.job_tracker.repository.JobApplicationRepository;
import com.jobtracker.job_tracker.service.JobApplicationService;
@Service
public class JobApplicationServiceImpl implements JobApplicationService{
     @Autowired
    private JobApplicationRepository repository;

   @Override
    public JobApplication create(JobApplicationDTO dto) {
        JobApplication job = JobApplication.builder()
                .company(dto.getCompany())
                .position(dto.getPosition())
                .status(dto.getStatus())
                .appliedDate(dto.getAppliedDate())
                .notes(dto.getNotes())
                .build();
        return repository.save(job);
    }

     @Override
    public List<JobApplication> getAll() {
        return repository.findAll();
    }

    @Override
    public JobApplication getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
