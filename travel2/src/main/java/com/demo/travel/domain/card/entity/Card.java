package com.demo.travel.domain.card.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.demo.travel.domain.account.entity.Account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * 계좌와 연결되는 카드 정보 테이블
 */
@Table(
    name = "card",
    indexes = {
            @Index(name = "card_seq_idx", columnList = "card_seq"),
            @Index(name = "card_number_idx", columnList = "card_number"),
            @Index(name = "user_id_idx", columnList = "user_id"),
    })
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long id;

    @Column(name = "card_seq", nullable = false, unique = true, updatable = false)
    private String cardSeq; // 카드 일련번호

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account; // 계좌와 연결된 카드

    @ManyToOne
    @JoinColumn(name = "card_item_id", nullable = false, updatable = false)
    private CardItem cardItem; // 카드 종류 (예: 신용카드, 체크카드 등)

    @Column(name = "card_number", unique = true, nullable = false, updatable = false)
    private String cardNumber; // 카드 번호

    @Column(name = "cvc", nullable = false, updatable = false)
    private String cvc; // 카드 CVC

    @Column(name = "expiry_date", nullable = false, updatable = false)
    private LocalDate expiryDate; // 카드 만료일

    @Column(name = "limit_amount")
    private Long limitAmount; // 카드 한도

    @Column(name = "is_used", nullable = false)
    private Boolean isUsed; // 카드 활성화 상태

    @CreatedDate
    @Column(name = "creation_date", nullable = false, updatable = false)
    private LocalDateTime creationDate; // 카드 발급일

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt; // 수정일

    @Column(name = "deleted", nullable = false)
    private Boolean deleted; // 삭제 여부

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt; // 삭제일

}
