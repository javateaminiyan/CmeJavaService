package com.careercounsling.cme.service;

import com.careercounsling.cme.Repo.ITIRepository;
import com.careercounsling.cme.tables.ITI;
import com.careercounsling.cme.tables.Tenth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CmeITIServiceImpl implements CmeITIService {


    private ITIRepository itiRepository;

    @Autowired
    public CmeITIServiceImpl(ITIRepository itiRepository) {
        this.itiRepository = itiRepository;
    }


    @Override
    public ITI addCategory(ITI iti) {
        return itiRepository.save(iti);
    }

    @Override
    public ITI updateCategory(Long id, ITI iti) {
        iti.setId(id);
        return itiRepository.save(iti);
    }

    @Override
    public void deleteCategory(Long id) {


        itiRepository.deleteById(id);
    }

    @Override
    public List<ITI> getITIRecord() {
        return itiRepository.findAll();
    }

    @Override
    public List<String> Streams() {
        return itiRepository.findStreams();
    }
    @Override
    public List<ITI> findByStreamName(String name) {
        return itiRepository.findByStreamName(name);
    }



}
