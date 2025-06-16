package com.jobtracker.job_tracker.service;

import java.util.List;

import com.jobtracker.job_tracker.dto.JobApplicationDTO;
import com.jobtracker.job_tracker.entity.JobApplication;

public interface JobApplicationService {
    JobApplication create(JobApplicationDTO dto);
    List<JobApplication> getAll();
    JobApplication getById(Long id);
    void delete(Long id);

}
