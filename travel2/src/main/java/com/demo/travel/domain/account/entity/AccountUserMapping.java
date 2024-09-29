package com.demo.travel.domain.account.entity;

import java.time.LocalDateTime;

import com.demo.travel.domain.user.User;

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

@Table(
    name = "account_user_mapping",
    indexes = {
            @Index(name = "idx_account_user_mapping_user_id", columnList = "user_id"),
            @Index(name = "idx_account_user_mapping_account_id", columnList = "account_id")})
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountUserMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_user_map_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "created_date")
    private LocalDateTime createdAt;

    @Column(name = "is_used")
    private boolean isUsed; // 사용 여부

}
