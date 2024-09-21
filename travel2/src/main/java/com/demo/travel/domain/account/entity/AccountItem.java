package com.demo.travel.domain.account.entity;

import java.time.LocalDateTime;

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

@Table(name = "account_item")
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

    @Column(name = "item_code")
    private String itemCode; // 계좌 항목 코드 (예: 01 : 예금, 02: 적금, 03: 대출 등)

    @Column(name = "item_name")
    private String itemName; // 계좌 항목 이름 (예: ㅁㅁ 예금, ㅁㅁ 적금, ㅁㅁ 대출 등)

    @Column(name = "interest_rate")
    private Long interestRate; // 이자율 (예금, 적금 계좌에 적용)

    @Column(name = "commission_rate")
    private Long commissionRate; // 수수료율 (대출 계좌에 적용)

    @Column(name = "loan_rate")
    private Long loanRate; // 대출 이자율 (대출 계좌에 적용)
    @Column(name = "loan_commission_rate")
    private Long loanCommissionRate; // 대출 수수료율 (대출 계좌에 적용)
    @Column(name = "loan_limit")
    private Long loanLimit; // 대출 한도 (대출 계좌에 적용)

    @Column(name = "deposit_limit")
    private Long depositLimit; // 예금 한도 (예금 계좌에 적용)
    @Column(name = "deposit_rate")
    private Long depositRate; // 예금 이자율 (예금 계좌에 적용)
    @Column(name = "deposit_commission_rate")
    private Long depositCommissionRate; // 예금 수수료율 (예금 계좌에 적용)

    @Column(name = "saving_rate")
    private Long savingRate; // 적금 이자율 (적금 계좌에 적용)
    @Column(name = "saving_commission_rate")
    private Long savingCommissionRate; // 적금 수수료율 (적금 계좌에 적용)
    @Column(name = "saving_limit")
    private Long savingLimit; // 적금 한도 (적금 계좌에 적용)
    @Column(name = "saving_period")
    private Long savingPeriod; // 적금 기간 (적금 계좌에 적용)
    @Column(name = "saving_goal")
    private Long savingGoal; // 적금 목표 금액 (적금 계좌에 적용)

    @Column(name = "is_used")
    private boolean isUsed; // 계좌 항목 사용 여부

    @Column(name = "created_date")
    private LocalDateTime createdDate; // 계좌 항목 생성일

    @Column(name = "updated_date")
    private LocalDateTime updatedDate; // 계좌 항목 수정일

    @Column(name = "update_user")
    private String user; // 계좌 항목 수정자

}
