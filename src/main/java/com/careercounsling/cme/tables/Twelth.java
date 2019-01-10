package com.careercounsling.cme.tables;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "twelth")
public class Twelth implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "stream")
    private String Stream;

    @Column(name = "course")
    private String Course;

    @Column(name = "descriptions")
    private String Descriptions;

    @Column(name = "eligiblity")
    private String Eligiblity;

    @Column(name = "jobProfile")
    private String JobProfile;

    @Column(name = "careerInterest")
    private String CareerInterest;

    @Column(name = "entranceExams")
    private String EntranceExams;

    @Column(name = "salaryasaFresher")
    private String SalaryasaFresher;

    public Twelth() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getDescriptions() {
        return Descriptions;
    }

    public void setDescriptions(String descriptions) {
        Descriptions = descriptions;
    }

    public String getEligiblity() {
        return Eligiblity;
    }

    public void setEligiblity(String eligiblity) {
        Eligiblity = eligiblity;
    }

    public String getJobProfile() {
        return JobProfile;
    }

    public void setJobProfile(String jobProfile) {
        JobProfile = jobProfile;
    }

    public String getCareerInterest() {
        return CareerInterest;
    }

    public void setCareerInterest(String careerInterest) {
        CareerInterest = careerInterest;
    }

    public String getEntranceExams() {
        return EntranceExams;
    }

    public void setEntranceExams(String entranceExams) {
        EntranceExams = entranceExams;
    }

    public String getSalaryasaFresher() {
        return SalaryasaFresher;
    }

    public void setSalaryasaFresher(String salaryasaFresher) {
        SalaryasaFresher = salaryasaFresher;
    }
}
