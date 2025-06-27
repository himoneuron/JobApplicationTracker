package com.jobtracker.job_tracker.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JobAplications")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobApplication {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;

    private String position;

    private String status; // e.g. Applied, Interviewing, Offered, Rejected

    private LocalDate appliedDate;

    private String notes;

    private String cvReference;

    private String userRequirements;


}
