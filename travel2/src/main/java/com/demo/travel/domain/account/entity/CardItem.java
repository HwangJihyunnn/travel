package com.demo.travel.domain.account.entity;

import com.demo.travel.domain.account.enums.CardType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    // 카드 항목 이름 (예: @@ 신용카드, ㅁㅁ체크카드 등)
    @Column(name = "item_name")
    private String itemName;

    // 사용 여부 (신규사용가능여부?)
    @Column(name = "is_used")
    private boolean isUsed;

    // 카드 해택 //TODO
    private String cardHeTec; // 추후 카드해택이라는 추가 테이블로 리스트화 하는게 좋을듯

}
