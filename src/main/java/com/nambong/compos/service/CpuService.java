package com.nambong.compos.service;

import com.nambong.compos.model.Cpu;
import com.nambong.compos.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CpuService {

    @Autowired
    private CpuRepository cpuRepository;

    public List<Cpu> getCpu(){
        return cpuRepository.findAll();
    }

    public List<Cpu> getCpuSorted(){
        return cpuRepository.findAll(Sort.by(Sort.Direction.DESC,"name","price"));
    }

    public List<Cpu> getCpuMost(){
        List<Cpu> cpuList = cpuRepository.findAll(Sort.by(Sort.Direction.DESC,"name","price"));
        List<Cpu> cpuListMost = new ArrayList<Cpu>();
        String temp = "";
        for(int i = 0 ;i < cpuList.size(); i++){
            if(cpuList.get(i).getName().equals(temp)) continue;
            temp = cpuList.get(i).getName();
            cpuListMost.add(cpuList.get(i));
        }
        return cpuListMost;
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
