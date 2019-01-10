package com.careercounsling.cme.Repo;

import com.careercounsling.cme.tables.ITI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITIRepository extends JpaRepository<ITI, Long> {




}
