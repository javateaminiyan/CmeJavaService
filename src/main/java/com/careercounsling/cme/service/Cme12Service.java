package com.careercounsling.cme.service;

import com.careercounsling.cme.tables.Tenth;
import com.careercounsling.cme.tables.Twelth;

import java.util.List;

public interface Cme12Service {


    Twelth addCategory(Twelth tenth);

    Twelth updateCategory(Long id, Twelth tenth);

    void deleteCategory(Long id);

    List<Twelth> getTwelthRecord();


    List<String> Streams();


    List<Twelth>  findByStreamName(String name);
}
