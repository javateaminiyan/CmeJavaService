package com.careercounsling.cme.service;

import com.careercounsling.cme.Repo.TenthRepository;
import com.careercounsling.cme.tables.Products;
import com.careercounsling.cme.tables.Tenth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class CmeServiceImpl implements CmeService {


    private final TenthRepository tenthRepository;

    @Autowired
    public CmeServiceImpl(TenthRepository tenthRepository) {
        this.tenthRepository = tenthRepository;
    }


    @Override
    public Tenth addCategory(Tenth tenth) {
        return tenthRepository.save(tenth);
    }

    @Override
    public Tenth updateCategory(Integer id, Tenth tenth) {


        //Tenth tenth1 = tenthRepository.findById(id).orElse(null);
        LocalDate localDate = LocalDate.now();
        tenth.setId(id);
        tenth.setCreated(Date.valueOf(localDate));


        return tenthRepository.save(tenth);
    }

    @Override
    public void deleteCategory(Integer id) {

        tenthRepository.deleteById(id);
    }


    @Override
    public List<Tenth> getTenthRecord() {
        return tenthRepository.findAll();
    }



}
