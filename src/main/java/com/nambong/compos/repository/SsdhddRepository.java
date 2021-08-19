package com.nambong.compos.repository;

import com.nambong.compos.model.Ssdhdd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SsdhddRepository extends JpaRepository<Ssdhdd, Integer> {
}
