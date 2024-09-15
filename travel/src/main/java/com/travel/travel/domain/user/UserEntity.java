package com.travel.travel.domain.user;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "user")
@Entity
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowid;

    private String username;
    private String password;
    private String role;

    private String name;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "nick_name_seq")
    private Long nickNameSeq;

    @Column(name = "unique_nick_name")
    private String uniqueNickName; // nickname + '|'' + seq

    private String email;

    @Column(name = "last_login_ip")
    private String lastLoginIp;

    @Column(name = "reg_date")
    @CreatedDate
    private LocalDateTime regDate;

    @Column(name = "update_date")
    @LastModifiedDate
    private LocalDateTime updateDate;
    private LocalDateTime lastLoginDate;
    private String status;

}
