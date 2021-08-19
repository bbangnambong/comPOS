package com.nambong.compos.service;

import com.nambong.compos.model.Vga;
import com.nambong.compos.repository.VgaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VgaService {
    @Autowired
    private VgaRepository vgaRepository;

    public List<Vga> getVga(){
        return vgaRepository.findAll();
    }

    public void save(Vga vga){
        vgaRepository.save(vga);
    }

    public Optional<Vga> findById(Integer id){
        return vgaRepository.findById(id);
    }

    public void delete(Integer id){
        vgaRepository.deleteById(id);
    }
}
