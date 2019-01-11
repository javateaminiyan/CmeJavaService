package com.careercounsling.cme.Repo;

import com.careercounsling.cme.tables.ITI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITIRepository extends JpaRepository<ITI, Long> {



    @Query(value = "{call getITIStream}", nativeQuery = true)
    List<String> findStreams();



    @Query("select j from ITI j where streams=:streams")
    List<ITI> findByStreamName(String streams);

}
