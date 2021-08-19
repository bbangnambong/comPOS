package com.nambong.compos.service;

import com.nambong.compos.model.Cpu;
import com.nambong.compos.model.Socket;
import com.nambong.compos.repository.CpuRepository;
import com.nambong.compos.repository.SocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocketService {
    @Autowired
    private SocketRepository socketRepository;

    public List<Socket> getSocket(){
        return socketRepository.findAll();
    }

    public void save(Socket socket){
        socketRepository.save(socket);
    }

    public Optional<Socket> findById(Integer id){
        return socketRepository.findById(id);
    }

    public void delete(Integer id){
        socketRepository.deleteById(id);
    }
}
