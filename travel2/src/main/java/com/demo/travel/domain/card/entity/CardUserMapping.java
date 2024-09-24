package com.demo.travel.domain.card.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.demo.travel.domain.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * [CardUserMapping] 카드 사용자 매핑 관련 엔티티
 */
@Table(
    name = "card_user_mapping",
    indexes = {
            @Index(name = "card_id_idx", columnList = "card_id"),
            @Index(name = "user_id_idx", columnList = "user_id"),})
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardUserMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_user_mapping_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "card_id", nullable = false)
    private Card card; // 카드 정보

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // 사용자 정보

    @Column(name = "is_default", nullable = false)
    private Boolean isDefault; // 기본 카드 여부

    @Column(name = "is_used", nullable = false)
    private Boolean isUsed; // 사용 여부

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt; // 등록일

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt; // 수정일

    @PrePersist
    public void prePersist() {
        if(isUsed == null) {
            isUsed = true;
        }
        if(isDefault == null) {
            isDefault = false;
        }
    }
}
