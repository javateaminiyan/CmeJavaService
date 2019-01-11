package com.careercounsling.cme.Repo;

import com.careercounsling.cme.tables.Tenth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TenthRepository extends JpaRepository<Tenth, Integer> {



    @Query(value = "{call get10Stream}", nativeQuery = true)
    List<String> findStreams();



    @Query("select j from Tenth j where streams=:streams")
    List<Tenth> findByStreamName(String streams);

}
