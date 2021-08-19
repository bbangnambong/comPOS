package com.nambong.compos.service;

import com.nambong.compos.model.Motherboard;
import com.nambong.compos.repository.MotherboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotherboardService {
    @Autowired
    private MotherboardRepository motherboardRepository;

    public List<Motherboard> getMotherboard(){
        return motherboardRepository.findAll();
    }

    public void save(Motherboard motherboard){
        motherboardRepository.save(motherboard);
    }

    public Optional<Motherboard> findById(Integer id){
        return motherboardRepository.findById(id);
    }

    public void delete(Integer id){
        motherboardRepository.deleteById(id);
    }
}
