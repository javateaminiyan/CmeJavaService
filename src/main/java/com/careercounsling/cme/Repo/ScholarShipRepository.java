package com.careercounsling.cme.Repo;

import com.careercounsling.cme.tables.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ScholarShipRepository extends JpaRepository<Scholarship, Long> {


//
//    @Query("SELECT t.title FROM Todo t where t.id = :id")
//    String findTitleById(@Param("id") Long id);
//
//    @Query("SELECT t.title FROM Todo t where t.id = :id")
//    Optional<String> fff(@Param("id") Long id);

    //  Scholarship findById(Long id);
//
//    @Query("SELECT * FROM Scholarship t where t.governmentType = :title")
//    List<Scholarship> findByTitle(String title);


    @Query(value = "select * from scholarship where government_type=:Type", nativeQuery = true)
    List<Scholarship> findByTitle(String Type);


    @Query("select j from Scholarship j where government_type=:governmenttype")
    List<Scholarship> findbyUsername(String governmenttype);


//    @Query("select * from scholarship where government_type=:Type")
//    Optional<Object> findByTitle(String Type);
//


}
