package com.careercounsling.cme.service;

import com.careercounsling.cme.tables.Scholarship;

import java.util.List;
import java.util.Optional;

public interface CmeScholarship {

    Scholarship addCategory(Scholarship tenth);

    Scholarship updateCategory(Long id, Scholarship tenth);

    void deleteCategory(Long id);

    List<Scholarship> getScholarShipRecords();


    List<Scholarship> getfindGovernmentType(String Type);
    List<Scholarship> getfindGovernmentTypeHibernate(String Type);


}
