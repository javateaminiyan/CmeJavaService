package com.careercounsling.cme.Repo;


import com.careercounsling.cme.tables.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface ProductRepository extends JpaRepository<Products, Integer> {



    @Query(value = "{call sp_products}", nativeQuery = true)
    List<Products> findAllApi();


}
