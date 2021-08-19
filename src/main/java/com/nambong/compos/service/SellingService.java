package com.nambong.compos.service;

import com.nambong.compos.model.Selling;
import com.nambong.compos.repository.SellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellingService {
    @Autowired
    private SellingRepository sellingRepository;

    public List<Selling> getSelling(){
        return sellingRepository.findAll();
    }

    public void save(Selling selling){
        sellingRepository.save(selling);
    }

    public Optional<Selling> findById(Integer id){
        return sellingRepository.findById(id);
    }

    public void delete(Integer id){
        sellingRepository.deleteById(id);
    }
}
