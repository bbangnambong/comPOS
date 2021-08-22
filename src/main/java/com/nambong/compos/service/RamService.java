package com.nambong.compos.service;

import com.nambong.compos.model.Ram;
import com.nambong.compos.repository.RamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RamService {
    @Autowired
    private RamRepository ramRepository;

    public List<Ram> getRam(){
        return ramRepository.findAll();
    }

    public List<Ram> getRamSorted(){
        return ramRepository.findAll(Sort.by(Sort.Direction.DESC,"price"));
    }

    public List<Ram> getRamMost(){
        List<Ram> ramList = ramRepository.findAll(Sort.by(Sort.Direction.DESC,"price"));
        List<Ram> ramMost = new ArrayList<>();
        String temp = "";
        for(int i = 0; i < ramList.size(); i++){
            if(ramList.get(i).getDdr().getName().equals(temp)) continue;
            temp = ramList.get(i).getDdr().getName();
            ramMost.add(ramList.get(i));
        }
        return ramMost;
    }

    public void save(Ram ram){
        ramRepository.save(ram);
    }

    public Optional<Ram> findById(Integer id){
        return ramRepository.findById(id);
    }

    public void delete(Integer id){
        ramRepository.deleteById(id);
    }
}
