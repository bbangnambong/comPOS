package com.nambong.compos.service;

import com.nambong.compos.model.Brand;
import com.nambong.compos.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> getBrand(){
        return brandRepository.findAll();
    }

    public void save(Brand brand){
        brandRepository.save(brand);
    }

    public Optional<Brand> findById(Integer id){
        return brandRepository.findById(id);
    }

    public void delete(Integer id){
        brandRepository.deleteById(id);
    }
}
