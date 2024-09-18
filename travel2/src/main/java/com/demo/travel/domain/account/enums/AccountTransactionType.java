package com.demo.travel.domain.account.enums;

public enum AccountTransactionType {
    DEPOSIT("입금"),       // 입금
    WITHDRAWAL("출금"),    // 출금
    TRANSFER("이체"),      // 이체
    INTEREST("이자"),      // 이자
    FEE("수수료"),           // 수수료
    REFUND("환불");         // 환불

    // 추가 등등

    private final String name;

    private AccountTransactionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}