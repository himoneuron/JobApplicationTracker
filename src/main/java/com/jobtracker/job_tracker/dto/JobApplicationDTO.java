package com.jobtracker.job_tracker.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class JobApplicationDTO {
    private String company;
    private String position;
    private String status;
    private LocalDate appliedDate;
    private String notes;
}



    