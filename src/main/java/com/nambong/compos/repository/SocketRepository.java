package com.nambong.compos.repository;

import com.nambong.compos.model.Cpu;
import com.nambong.compos.model.Socket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocketRepository extends JpaRepository<Socket, Integer> {
}
