package com.nambong.compos.service;

import com.nambong.compos.model.Ram;
import com.nambong.compos.model.Vga;
import com.nambong.compos.repository.VgaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VgaService {
    @Autowired
    private VgaRepository vgaRepository;

    public List<Vga> getVga(){
        return vgaRepository.findAll();
    }

    public List<Vga> getVgaSorted(){
        return vgaRepository.findAll(Sort.by(Sort.Direction.DESC, "price"));
    }

    public List<Vga> getVgaMost(){
        List<Vga> vgaList = vgaRepository.findAll(Sort.by(Sort.Direction.DESC, "price"));
        List<Vga> vgaMost = new ArrayList<>();
        String temp = "";
        for(int i = 0; i < vgaList.size(); i++){
            if(vgaList.get(i).getVgaChipset().getName().equals(temp)) continue;
            temp = vgaList.get(i).getVgaChipset().getName();
            vgaMost.add(vgaList.get(i));
        }
        return vgaMost;
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
