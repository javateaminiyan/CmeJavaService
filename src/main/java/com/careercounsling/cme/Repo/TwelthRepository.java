package com.careercounsling.cme.Repo;


import com.careercounsling.cme.tables.Twelth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TwelthRepository extends JpaRepository<Twelth, Long> {



    @Query(value = "{call get12Stream}", nativeQuery = true)
    List<String> findStreams();



    @Query("select j from Twelth j where stream=:streams")
    List<Twelth> findByStreamName(String streams);


}
