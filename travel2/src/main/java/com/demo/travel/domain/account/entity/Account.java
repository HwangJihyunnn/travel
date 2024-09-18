package com.demo.travel.domain.account.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.demo.travel.domain.account.enums.AccountStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * 계좌 정보를 저장할 테이블
 */
@Table
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    // 계좌 고유 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long id;

    // 계좌번호
    @Column(name = "account_number", unique = true)
    private String accountNumber; // 랜덤랜덤

    // 계좌 종류 (예: 예금, 적금, 대출 등)
    @JoinColumn(name = "account_item_id")
    private AccountItem accountItem;

    // 계좌 잔액
    private Long balance;

    // 계좌 상태 (예: 활성, 비활성, 정지)
    @Enumerated(EnumType.STRING)
    @Column(name = "account_status")
    private AccountStatus status;

    // 계좌 생성일
    private LocalDateTime createdDate;

    // 마지막 거래일
    private LocalDateTime lastTransactionDate;

    // 금액 출입 가능 여부 (입금, 출금 등)
    private boolean isTransactable;

    // 계좌 닉네임 (사용자가 설정한 별칭)
    @Column(name = "account_comment")
    private String accountComment;

    // 연체 금액 (대출 계좌에 적용)
    private BigDecimal overdueAmount;

    // 마지막 이자 계산일 ??

}
