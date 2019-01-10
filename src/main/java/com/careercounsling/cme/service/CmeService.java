package com.careercounsling.cme.service;

import com.careercounsling.cme.Repo.TenthRepository;
import com.careercounsling.cme.tables.Products;
import com.careercounsling.cme.tables.Tenth;

import java.util.List;

public interface CmeService {

    Tenth addCategory(Tenth tenth);


    Tenth updateCategory(Integer id,Tenth tenth);


    void deleteCategory(Integer id);




    List<Tenth> getTenthRecord();
}


