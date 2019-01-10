package com.careercounsling.cme.service;

import com.careercounsling.cme.Repo.EnternanceRepository;
import com.careercounsling.cme.tables.EntranceExams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmeEnteranceImpl implements CmeEnterance {
    @Autowired
    private EnternanceRepository enternanceRepository;

    @Override
    public EntranceExams addCategory(EntranceExams entranceExams) {
        return enternanceRepository.save(entranceExams);
    }

    @Override
    public EntranceExams updateCategory(Long id, EntranceExams entranceExams) {

        entranceExams.setId(id);
        return enternanceRepository.save(entranceExams);

    }

    @Override
    public void deleteCategory(Long id) {
        enternanceRepository.deleteById(id);
    }

    @Override
    public List<EntranceExams> getEnternaceRecord() {
        return enternanceRepository.findAll();
    }

    @Override
    public List<EntranceExams> getAllStreams() {
//        return enternanceRepository.selectAllStreams();
        return  null;
    }
}
