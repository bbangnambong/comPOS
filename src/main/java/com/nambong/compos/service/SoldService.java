package com.nambong.compos.service;

import com.nambong.compos.model.Sold;
import com.nambong.compos.repository.SoldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoldService {
    @Autowired
    private SoldRepository soldRepository;

    public List<Sold> getSold(){
        return soldRepository.findAll();
    }

    public void save(Sold sold){
        soldRepository.save(sold);
    }

    public Optional<Sold> findById(Integer id){
        return soldRepository.findById(id);
    }

    public void delete(Integer id){
        soldRepository.deleteById(id);
    }
}
