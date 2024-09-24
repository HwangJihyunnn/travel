package com.demo.travel.domain.card.enums;

public enum CardType {
    CREDIT_CARD("신용카드"),   // 신용카드
    DEBIT_CARD("체크카드"),    // 체크카드
    PREPAID_CARD("선불카드"),  // 선불카드
    MILEAGE_CARD("마일리지 카드"), // 마일리지 카드
    GIFT_CARD("기프트 카드");  // 기프트카드

    private final String name;

    private CardType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
