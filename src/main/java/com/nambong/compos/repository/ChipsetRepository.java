package com.nambong.compos.repository;

import com.nambong.compos.model.Chipset;
import com.nambong.compos.model.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChipsetRepository extends JpaRepository<Chipset, Integer> {
}
