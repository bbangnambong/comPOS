package com.nambong.compos.service;

import com.nambong.compos.model.Ssdhdd;
import com.nambong.compos.repository.SsdhddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SsdhddService {
    @Autowired
    private SsdhddRepository ssdhddRepository;

    public List<Ssdhdd> getSsdhdd(){
        return ssdhddRepository.findAll();
    }

    public void save(Ssdhdd ssdhdd){
        ssdhddRepository.save(ssdhdd);
    }

    public Optional<Ssdhdd> findById(Integer id){
        return ssdhddRepository.findById(id);
    }

    public void delete(Integer id){
        ssdhddRepository.deleteById(id);
    }
}
