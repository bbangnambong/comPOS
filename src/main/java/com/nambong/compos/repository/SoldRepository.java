package com.nambong.compos.repository;

import com.nambong.compos.model.Sold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldRepository extends JpaRepository<Sold, Integer> {
}
