package com.nambong.compos.service;

import com.nambong.compos.model.SsdVol;
import com.nambong.compos.repository.SsdVolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SsdVolService {
    @Autowired
    private SsdVolRepository ssdVolRepository;

    public List<SsdVol> getSsdVol(){
        return ssdVolRepository.findAll();
    }

    public void save(SsdVol ssdVol){
        ssdVolRepository.save(ssdVol);
    }

    public Optional<SsdVol> findById(Integer id){
        return ssdVolRepository.findById(id);
    }

    public void delete(Integer id){
        ssdVolRepository.deleteById(id);
    }
}
