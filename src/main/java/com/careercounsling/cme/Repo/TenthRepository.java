package com.careercounsling.cme.Repo;

import com.careercounsling.cme.tables.Tenth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenthRepository extends JpaRepository<Tenth, Integer> {
}
