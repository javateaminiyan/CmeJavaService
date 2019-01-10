package com.careercounsling.cme.tables;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Scholarship")
public class Scholarship implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String Name;

    @Column(name = "provider")
    private String Provider;

    @Column(name = "eligiblitytoapply")
    private String Eligiblitytoapply;

    @Column(name = "amount")
    private String Amount;

    @Column(name = "governmentType")
    private String GovernmentType;

    public Scholarship() {
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

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }

    public String getEligiblitytoapply() {
        return Eligiblitytoapply;
    }

    public void setEligiblitytoapply(String eligiblitytoapply) {
        Eligiblitytoapply = eligiblitytoapply;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getGovernmentType() {
        return GovernmentType;
    }

    public void setGovernmentType(String governmentType) {
        GovernmentType = governmentType;
    }

    public Scholarship(String name, String provider, String eligiblitytoapply, String amount, String governmentType) {
        Name = name;
        Provider = provider;
        Eligiblitytoapply = eligiblitytoapply;
        Amount = amount;
        GovernmentType = governmentType;
    }
}
