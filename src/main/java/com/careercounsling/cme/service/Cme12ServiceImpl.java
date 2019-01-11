package com.careercounsling.cme.service;

import com.careercounsling.cme.Repo.TwelthRepository;
import com.careercounsling.cme.tables.Twelth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cme12ServiceImpl implements Cme12Service {

    private final TwelthRepository twelthRepository;


    @Autowired
    public Cme12ServiceImpl(TwelthRepository twelthRepository) {
        this.twelthRepository = twelthRepository;
    }


    @Override
    public Twelth addCategory(Twelth tenth) {
        return twelthRepository.save(tenth);
    }

    @Override
    public Twelth updateCategory(Long id, Twelth twelth) {


        twelth.setId(id);


        return twelthRepository.save(twelth);
    }

    @Override
    public void deleteCategory(Long id) {
        twelthRepository.deleteById(id);
    }

    @Override
    public List<Twelth> getTwelthRecord() {
        return twelthRepository.findAll();
    }



    @Override
    public List<String> Streams() {
        return twelthRepository.findStreams();
    }
    @Override
    public List<Twelth> findByStreamName(String name) {
        return twelthRepository.findByStreamName(name);
    }
}
