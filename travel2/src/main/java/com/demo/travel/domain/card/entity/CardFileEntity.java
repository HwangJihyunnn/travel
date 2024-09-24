package com.demo.travel.domain.card.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * [CardFile] 카드 아이템 파일 관련 엔티티
 */
@Table(name = "card_file")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class CardFileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_file_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "card_item_id", nullable = false)
    private CardItem cardItem; // 카드 아이템 정보

    // 파일 Url1 사진 앞면
    @Column(name = "file_url1", nullable = false)
    private String fileUrl1;

    // 파일 Url2 사진 뒷면
    @Column(name = "file_url2", nullable = false)
    private String fileUrl2;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "is_used", nullable = false)
    private Boolean isUsed;

}
