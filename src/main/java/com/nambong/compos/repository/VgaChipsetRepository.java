package com.nambong.compos.repository;

import com.nambong.compos.model.Vga;
import com.nambong.compos.model.VgaChipset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VgaChipsetRepository extends JpaRepository<VgaChipset, Integer> {
}
