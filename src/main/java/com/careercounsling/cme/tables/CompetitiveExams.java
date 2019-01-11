package com.careercounsling.cme.tables;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CompetitiveExams")
public class CompetitiveExams  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name="name")
    private String Name;

    @Column(name="examDate")
    private String ExamDate;

    @Column(name="lastDatetoApply")
    private String LastDatetoApply;

    public CompetitiveExams() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getExamDate() {
        return ExamDate;
    }

    public void setExamDate(String examDate) {
        ExamDate = examDate;
    }

    public String getLastDatetoApply() {
        return LastDatetoApply;
    }

    public void setLastDatetoApply(String lastDatetoApply) {
        LastDatetoApply = lastDatetoApply;
    }

    public CompetitiveExams(String name, String examDate, String lastDatetoApply) {
        Name = name;
        ExamDate = examDate;
        LastDatetoApply = lastDatetoApply;
    }
}
