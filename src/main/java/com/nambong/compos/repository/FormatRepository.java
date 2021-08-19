package com.nambong.compos.repository;

import com.nambong.compos.model.Format;
import com.nambong.compos.model.SsdVol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormatRepository extends JpaRepository<Format, Integer> {
}
