package com.nambong.compos.service;

import com.nambong.compos.model.VgaChipset;
import com.nambong.compos.repository.VgaChipsetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VgaChipsetService {
    @Autowired
    private VgaChipsetRepository vgaChipsetRepository;

    public List<VgaChipset> getVgaChipset(){
        return vgaChipsetRepository.findAll();
    }

    public void save(VgaChipset vgaChipset){
        vgaChipsetRepository.save(vgaChipset);
    }

    public Optional<VgaChipset> findById(Integer id){
        return vgaChipsetRepository.findById(id);
    }

    public void delete(Integer id){
        vgaChipsetRepository.deleteById(id);
    }
}
