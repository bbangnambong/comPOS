package com.nambong.compos.service;

import com.nambong.compos.model.Ddr;
import com.nambong.compos.repository.DdrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DdrService {
    @Autowired
    private DdrRepository ddrRepository;

    public List<Ddr> getDdr(){
        return ddrRepository.findAll();
    }

    public void save(Ddr ddr){
        ddrRepository.save(ddr);
    }

    public Optional<Ddr> findById(Integer id){
        return ddrRepository.findById(id);
    }

    public void delete(Integer id){
        ddrRepository.deleteById(id);
    }
}
