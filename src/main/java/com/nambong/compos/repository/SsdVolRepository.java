package com.nambong.compos.repository;

import com.nambong.compos.model.SsdVol;
import com.nambong.compos.model.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SsdVolRepository extends JpaRepository<SsdVol, Integer> {
}
