package com.careercounsling.cme.service;

import com.careercounsling.cme.tables.ITI;
import com.careercounsling.cme.tables.Twelth;

import java.util.List;

public interface CmeITIService {


    ITI addCategory(ITI iti);

    ITI updateCategory(Long id, ITI iti);

    void deleteCategory(Long id);

    List<ITI> getITIRecord();

}
