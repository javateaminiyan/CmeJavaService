package com.careercounsling.cme.tables;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EntranceExams")


@NamedStoredProcedureQuery(name = "getAllStream",
        procedureName = "getAllStreamType",
        resultClasses = EntranceExams.class)
public class EntranceExams  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "streamType")
    private String StreamType;
    @Column(name = "entranceExamName")
    private String EntranceExamName;
    @Column(name = "description")
    private String Description;
    @Column(name = "conductedby")
    private String Conductedby;
    @Column(name = "eligiblity")
    private String Eligiblity;
    @Column(name = "course")
    private String Course;
    @Column(name = "modeOfOnlineOffline")
    private String ModeOfOnlineOffline;


    public void setId(Long id) {
        this.id=id;
    }

    public EntranceExams() {
    }
}
