package com.careercounsling.cme.service;

import com.careercounsling.cme.tables.CompetitiveExams;

import java.util.List;

public interface CmeCompetitiveExam {


    CompetitiveExams addCategory(CompetitiveExams tenth);

    CompetitiveExams updateCategory(Long id, CompetitiveExams tenth);

    void deleteCategory(Long id);

    List<CompetitiveExams> getCompetitiveExam();

}
