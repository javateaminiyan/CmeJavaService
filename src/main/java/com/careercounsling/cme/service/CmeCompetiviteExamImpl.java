package com.careercounsling.cme.service;

import com.careercounsling.cme.Repo.CompetitiveExamRepository;
import com.careercounsling.cme.tables.CompetitiveExams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
@Service
public class CmeCompetiviteExamImpl implements CmeCompetitiveExam {

    @Autowired
    private CompetitiveExamRepository competitiveExamRepository;


    @Override
    public CompetitiveExams addCategory(CompetitiveExams tenth) {
        return competitiveExamRepository.save(tenth);
    }

    @Override
    public CompetitiveExams updateCategory(Long id, CompetitiveExams tenth) {

        tenth.setId(id);
        return competitiveExamRepository.save(tenth);


    }

    @Override
    public void deleteCategory(Long id) {
        competitiveExamRepository.deleteById(id);
    }

    @Override
    public List<CompetitiveExams> getCompetitiveExam() {
        return competitiveExamRepository.findAll();
    }
}
