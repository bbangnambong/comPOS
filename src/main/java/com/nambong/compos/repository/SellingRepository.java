package com.nambong.compos.repository;

import com.nambong.compos.model.Selling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellingRepository extends JpaRepository<Selling, Integer> {
}
