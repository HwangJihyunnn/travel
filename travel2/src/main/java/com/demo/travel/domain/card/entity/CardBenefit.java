package com.demo.travel.domain.card.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(
    name = "card_benefit",
    indexes = {
            @Index(name = "card_benefit_id_idx", columnList = "card_benefit_id")})
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardBenefit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_benefit_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "card_item_id")
    private CardItem cardItem;

    @Column(name = "benefit_type")
    private String benefitType;             // 할인, 케시백, 포인트 등

    @Column(name = "benefit_name")
    private String benefitName;             // 혜택 이름

    @Column(name = "benefit_content")
    private String benefitContent;          // 혜택 내용

    @Column(name = "benefit_condition")
    private String benefitCondition;        // 적용조건 및 적용 범위

}
