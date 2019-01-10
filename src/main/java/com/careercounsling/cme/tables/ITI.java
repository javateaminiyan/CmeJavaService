package com.careercounsling.cme.tables;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ITI")
public class ITI implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "streams")
    private String Streams;

    @Column(name = "description")
    private String Description;

    @Column(name = "scheme")
    private String Scheme;

    @Column(name = "duration")
    private String Duration;

    @Column(name = "eligibility")
    private String Eligibility;

    @Column(name = "jobProfile")
    private String JobProfile;

    @Column(name = "salary")
    private String Salary;


    public ITI() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreams() {
        return Streams;
    }

    public void setStreams(String streams) {
        Streams = streams;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getScheme() {
        return Scheme;
    }

    public void setScheme(String scheme) {
        Scheme = scheme;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getEligibility() {
        return Eligibility;
    }

    public void setEligibility(String eligibility) {
        Eligibility = eligibility;
    }

    public String getJobProfile() {
        return JobProfile;
    }

    public void setJobProfile(String jobProfile) {
        JobProfile = jobProfile;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public ITI(String streams, String description, String scheme, String duration, String eligibility, String jobProfile, String salary) {
        Streams = streams;
        Description = description;
        Scheme = scheme;
        Duration = duration;
        Eligibility = eligibility;
        JobProfile = jobProfile;
        Salary = salary;
    }
}


