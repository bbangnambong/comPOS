package com.nambong.compos.service;

import com.nambong.compos.model.Format;
import com.nambong.compos.repository.FormatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormatService {
    @Autowired
    private FormatRepository formatRepository;

    public List<Format> getFormat(){
        return formatRepository.findAll();
    }

    public void save(Format format){
        formatRepository.save(format);
    }

    public Optional<Format> findById(Integer id){
        return formatRepository.findById(id);
    }

    public void delete(Integer id){
        formatRepository.deleteById(id);
    }
}
