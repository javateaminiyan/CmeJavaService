package com.careercounsling.cme.tables;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employees")

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllEmployees",
                                    procedureName = "get_all_employees",
        resultClasses = Employees.class)
})
public class Employees implements Serializable {


    public Employees() {
    }

    @Id
    @Column(name = "employeeID")
    private long employeeID;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "address")
    private String address;
}
