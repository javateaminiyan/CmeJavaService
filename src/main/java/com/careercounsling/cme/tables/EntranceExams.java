package com.careercounsling.cme.tables;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "entrance_exams")
public class EntranceExams  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "stream_type")
    private String StreamType;
    @Column(name = "entrance_exam_name")
    private String EntranceExamName;
    @Column(name = "description")
    private String Description;
    @Column(name = "conductedby")
    private String Conductedby;
    @Column(name = "eligiblity")
    private String Eligiblity;
    @Column(name = "course")
    private String Course;
    @Column(name = "mode_of_online_offline")
    private String ModeOfOnlineOffline;

    public Long getId() {
        return id;
    }

    public String getStreamType() {
        return StreamType;
    }

    public void setStreamType(String streamType) {
        StreamType = streamType;
    }

    public String getEntranceExamName() {
        return EntranceExamName;
    }

    public void setEntranceExamName(String entranceExamName) {
        EntranceExamName = entranceExamName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getConductedby() {
        return Conductedby;
    }

    public void setConductedby(String conductedby) {
        Conductedby = conductedby;
    }

    public String getEligiblity() {
        return Eligiblity;
    }

    public void setEligiblity(String eligiblity) {
        Eligiblity = eligiblity;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getModeOfOnlineOffline() {
        return ModeOfOnlineOffline;
    }

    public void setModeOfOnlineOffline(String modeOfOnlineOffline) {
        ModeOfOnlineOffline = modeOfOnlineOffline;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public EntranceExams() {
    }
}
