package com.nambong.compos.service;

import com.nambong.compos.model.Power;
import com.nambong.compos.repository.PowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PowerService {
    @Autowired
    private PowerRepository powerRepository;

    public List<Power> getPower(){
        return powerRepository.findAll();
    }

    public void save(Power power){
        powerRepository.save(power);
    }

    public Optional<Power> findById(Integer id){
        return powerRepository.findById(id);
    }

    public void delete(Integer id){
        powerRepository.deleteById(id);
    }
}
