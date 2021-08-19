package com.nambong.compos.repository;

import com.nambong.compos.model.Vga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VgaRepository extends JpaRepository<Vga, Integer> {
}
