package com.nambong.compos.service;

import com.nambong.compos.model.Ram;
import com.nambong.compos.repository.RamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RamService {
    @Autowired
    private RamRepository ramRepository;

    public List<Ram> getRam(){
        return ramRepository.findAll();
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
