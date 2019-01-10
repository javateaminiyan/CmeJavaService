package com.careercounsling.cme.Repo;

import com.careercounsling.cme.tables.CompetitiveExams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitiveExamRepository  extends JpaRepository<CompetitiveExams, Long> {

}
