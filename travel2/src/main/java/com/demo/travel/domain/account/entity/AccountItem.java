package com.demo.travel.domain.account.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_item_id")
    private Long id;

    private String itemName; // 계좌 항목 이름 (예: ㅁㅁ 예금, ㅁㅁ 적금, ㅁㅁ 대출 등)

    private BigDecimal interestRate; // 이자율 (예금, 적금 계좌에 적용)

    private BigDecimal commissionRate; // 수수료율 (대출 계좌에 적용)

    private BigDecimal loanRate; // 대출 이자율 (대출 계좌에 적용)

    private BigDecimal loanLimit; // 대출 한도 (대출 계좌에 적용)

    private BigDecimal depositLimit; // 예금 한도 (예금 계좌에 적용)

    private BigDecimal depositRate; // 예금 이자율 (예금 계좌에 적용)

    private BigDecimal depositCommissionRate; // 예금 수수료율 (예금 계좌에 적용)

    private BigDecimal savingRate; // 적금 이자율 (적금 계좌에 적용)

    private BigDecimal savingCommissionRate; // 적금 수수료율 (적금 계좌에 적용)

    private BigDecimal savingLimit; // 적금 한도 (적금 계좌에 적용)

    private BigDecimal savingPeriod; // 적금 기간 (적금 계좌에 적용)

    private BigDecimal savingGoal; // 적금 목표 금액 (적금 계좌에 적용)

}
