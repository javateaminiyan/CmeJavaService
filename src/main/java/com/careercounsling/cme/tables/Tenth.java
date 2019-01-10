package com.careercounsling.cme.tables;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "tenth")
public class Tenth implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "streams")
    private String Streams;
    @Column(name = "syllabus")

    private String Syllabus;
    @Column(name = "eligiblity")

    private String Eligiblity;
    @Column(name = "higher_studies")

    private String HigherStudies;
    @Column(name = "skills_required")

    private String SkillsRequired;


    @Column(name = "created")
    @CreationTimestamp
    private Date created;

    @Column(name = "updated")
    @UpdateTimestamp
    private Date updated;

    public Integer getId() {
        return id;
    }

    public Tenth() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreams() {
        return Streams;
    }

    public void setStreams(String streams) {
        Streams = streams;
    }

    public String getSyllabus() {
        return Syllabus;
    }

    public void setSyllabus(String syllabus) {
        Syllabus = syllabus;
    }

    public String getEligiblity() {
        return Eligiblity;
    }

    public void setEligiblity(String eligiblity) {
        Eligiblity = eligiblity;
    }

    public String getHigherStudies() {
        return HigherStudies;
    }

    public void setHigherStudies(String higherStudies) {
        HigherStudies = higherStudies;
    }

    public String getSkillsRequired() {
        return SkillsRequired;
    }

    public void setSkillsRequired(String skillsRequired) {
        SkillsRequired = skillsRequired;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Tenth(String streams, String syllabus, String eligiblity, String higherStudies, String skillsRequired) {
        Streams = streams;
        Syllabus = syllabus;
        Eligiblity = eligiblity;
        HigherStudies = higherStudies;
        SkillsRequired = skillsRequired;
    }
}
