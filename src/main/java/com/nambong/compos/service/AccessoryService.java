package com.nambong.compos.service;

import com.nambong.compos.model.Accessory;
import com.nambong.compos.repository.AccessoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccessoryService {

    @Autowired
    private AccessoryRepository accessoryRepository;

    public List<Accessory> getAccessories(){
        return accessoryRepository.findAll();
    }

    public List<Accessory> getAccessoriesSorted(){
        return accessoryRepository.findAll(Sort.by(Sort.Direction.DESC, "sort","price"));
    }

    public void save(Accessory accessory){
        accessoryRepository.save(accessory);
    }

    public Optional<Accessory> findById(Integer id){
        return accessoryRepository.findById(id);
    }

    public void delete(Integer id){
        accessoryRepository.deleteById(id);
    }
}
