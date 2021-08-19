package com.nambong.compos.service;

import com.nambong.compos.model.Brand;
import com.nambong.compos.model.Chipset;
import com.nambong.compos.repository.BrandRepository;
import com.nambong.compos.repository.ChipsetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChipsetService {
    @Autowired
    private ChipsetRepository chipsetRepository;

    public List<Chipset> getChipset(){
        return chipsetRepository.findAll();
    }

    public void save(Chipset chipset){
        chipsetRepository.save(chipset);
    }

    public Optional<Chipset> findById(Integer id){
        return chipsetRepository.findById(id);
    }

    public void delete(Integer id){
        chipsetRepository.deleteById(id);
    }
}
