package com.careercounsling.cme.service;

import com.careercounsling.cme.Repo.ScholarShipRepository;
import com.careercounsling.cme.tables.Scholarship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CmeScholarShipImpl implements CmeScholarship {


    @Autowired
    private ScholarShipRepository scholarShipRepository;

    @Override
    public Scholarship addCategory(Scholarship tenth) {
        return scholarShipRepository.save(tenth);
    }

    @Override
    public Scholarship updateCategory(Long id, Scholarship tenth) {
        tenth.setId(id);
        return scholarShipRepository.save(tenth);



    }




    @Override
    public void deleteCategory(Long id) {

        scholarShipRepository.deleteById(id);
    }

    @Override
    public List<Scholarship> getScholarShipRecords() {



        return scholarShipRepository.findAll();
    }

    @Override
    public List<Scholarship> getfindGovernmentType(String Type) {

       // return null;

       return scholarShipRepository.findByTitle(Type);


    }


    @Override
    public List<Scholarship> getfindGovernmentTypeHibernate(String Type) {

        // return null;

        return scholarShipRepository.findbyUsername(Type);


    }










}
