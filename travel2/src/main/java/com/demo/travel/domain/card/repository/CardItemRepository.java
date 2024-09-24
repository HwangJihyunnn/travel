package com.demo.travel.domain.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.travel.domain.card.entity.CardItem;

@Repository
public interface CardItemRepository extends JpaRepository<CardItem, Long>, CardItemRepositoryCustom {

}
