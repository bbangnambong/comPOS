package com.nambong.compos.service;

import com.nambong.compos.model.Cpu;
import com.nambong.compos.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CpuService {
    @Autowired
    private CpuRepository cpuRepository;

    public List<Cpu> getCpu(){
        return cpuRepository.findAll();
    }

    public void save(Cpu cpu){
        cpuRepository.save(cpu);
    }

    public Optional<Cpu> findById(Integer id){
        return cpuRepository.findById(id);
    }

    public void delete(Integer id){
        cpuRepository.deleteById(id);
    }
}
