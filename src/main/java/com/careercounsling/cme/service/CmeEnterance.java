package com.careercounsling.cme.service;

import com.careercounsling.cme.tables.EntranceExams;

import java.util.List;

public interface CmeEnterance {

    EntranceExams addCategory(EntranceExams tenth);

    EntranceExams updateCategory(Long id, EntranceExams tenth);

    void deleteCategory(Long id);

    List<EntranceExams> getEnternaceRecord();

    List<EntranceExams> getAllStreams();
}
