package com.demo.travel.domain.card.entity;

import java.util.List;

import com.demo.travel.domain.card.enums.CardType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * [CardItem] 카드 아이템 관련 엔티티
 */
@Table(name = "card_item")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_item_id")
    private Long id;

    // 카드 종류 (예: 신용카드, 체크카드 등)
    @Column(name = "card_type")
    @Enumerated(jakarta.persistence.EnumType.STRING)
    private CardType cardType;

    // 카드 항목 이름 (예: 신한 처음 카드, 신한 SOL 카드 등)
    @Column(name = "item_name")
    private String itemName;

    // 카드 항목 설명
    @Column(name = "item_description")
    private String itemDescription;

    // 사용 여부
    @Column(name = "is_used")
    private Boolean isUsed;

    @OneToMany(mappedBy = "cardItem", fetch = FetchType.LAZY)
    List<CardBenefit> cardBenefits; // 카드 혜택 목록

    @OneToMany(mappedBy = "cardItem", fetch = FetchType.LAZY)
    List<CardFileEntity> cardFiles; // 카드 파일 목록

}
