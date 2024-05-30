package com.travel.travel.domain.chosung.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.travel.domain.chosung.entity.ChoSungEntity;

@Repository
public interface ChoSungRepository extends JpaRepository<ChoSungEntity, Long> {
    
}
