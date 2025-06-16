package com.jobtracker.job_tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobtracker.job_tracker.dto.JobApplicationDTO;
import com.jobtracker.job_tracker.entity.JobApplication;
import com.jobtracker.job_tracker.service.JobApplicationService;

@RestController
@RequestMapping("/api/jobs")
public class JobApplicationController {
     @Autowired
    private JobApplicationService service;

    @PostMapping
    public JobApplication create(@RequestBody JobApplicationDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<JobApplication> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public JobApplication getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
