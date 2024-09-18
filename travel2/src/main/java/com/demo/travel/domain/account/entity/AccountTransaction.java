package com.demo.travel.domain.account.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import com.demo.travel.domain.account.enums.AccountTransactionType;

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
 * 입금 출금 내역을 저장할 테이블
 */
@Entity
@Table
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_transaction_id")
    private Long id;

    @JoinColumn(name = "account_id")
    private Account account; // 계좌 정보

    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_type")
    private AccountTransactionType type; // 이체, 입금, 출금, 이자 등등

    private Long amount; // 금액

    private String description; // 거래 내용

    private Long balance; // ?? 이때의 잔액?? 흠..

    @CreatedDate
    @Column(name = "transaction_date")
    private LocalDateTime transactionDate; // 거래 일시

    private String comment; // 거래 코멘트

}
