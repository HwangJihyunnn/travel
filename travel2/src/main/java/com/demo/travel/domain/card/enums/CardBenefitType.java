package com.demo.travel.domain.card.enums;

public enum CardBenefitType {
    DISCOUNT("할인"),
    CASHBACK("캐시백"),
    POINT("포인트");

    private final String benefitType;

    CardBenefitType(String benefitType) {
        this.benefitType = benefitType;
    }

    public String getBenefitTypeName() {
        return benefitType;
    }

}
