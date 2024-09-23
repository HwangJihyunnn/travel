package com.demo.travel.domain.card.dto.response;

import java.util.Map;

import com.demo.travel.domain.account.enums.CardType;

import lombok.Data;

@Data
public class CardItemResponse {

    private Long id;

    private CardType cardType;

    private String cardName;

    private Map<String, Object> cardHeTec;

}
