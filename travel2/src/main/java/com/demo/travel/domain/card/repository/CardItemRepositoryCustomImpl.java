package com.demo.travel.domain.card.repository;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CardItemRepositoryCustomImpl implements CardItemRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    
}
