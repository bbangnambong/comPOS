package com.nambong.compos.service;

import com.nambong.compos.model.Profile;
import com.nambong.compos.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public List<Profile> getProfile(){
        return profileRepository.findAll();
    }

    public void save(Profile profile){
        profileRepository.save(profile);
    }

    public Optional<Profile> findById(Integer id){
        return profileRepository.findById(id);
    }

    public void delete(Integer id){
        profileRepository.deleteById(id);
    }
}
