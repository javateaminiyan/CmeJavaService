package com.careercounsling.cme.Repo;


import com.careercounsling.cme.tables.Twelth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwelthRepository extends JpaRepository<Twelth, Long> {
}
