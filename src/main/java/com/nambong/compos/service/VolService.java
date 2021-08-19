package com.nambong.compos.service;

import com.nambong.compos.model.Ram;
import com.nambong.compos.model.Vol;
import com.nambong.compos.repository.RamRepository;
import com.nambong.compos.repository.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VolService {
    @Autowired
    private VolRepository volRepository;

    public List<Vol> getVol(){
        return volRepository.findAll();
    }

    public void save(Vol vol){
        volRepository.save(vol);
    }

    public Optional<Vol> findById(Integer id){
        return volRepository.findById(id);
    }

    public void delete(Integer id){
        volRepository.deleteById(id);
    }
}
