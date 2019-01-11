package com.careercounsling.cme.Repo;

import com.careercounsling.cme.tables.EntranceExams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;
@Repository
public interface EnternanceRepository extends JpaRepository<EntranceExams, Long> {



 @Query(value = "{call getEntranceExam}", nativeQuery = true)
 List<String> findStreams();



 @Query("select j from EntranceExams j where streams=:streams")
 List<EntranceExams> findByStreamName(String streams);



 }
