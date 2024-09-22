package com.demo.travel.domain.account.service;

import java.util.List;

import com.demo.travel.domain.account.entity.AccountItem;

public interface AccountItemService {

    // 카드 목록 생성하기
    void insertAccountItem(Object accountItem);

    // 카드 목록 생성하기 (여러개)
    void insetAccountItemList(List<Object> accountItemList);

    // 카드 아이템 목록 조회하기
    List<Object> selectAccountItemList();

    // 카드 아이템 상세 조회하기
    Object selectAccountItem(Long accountItemId);

    // 카드 아이템 수정하기
    void updateAccountItem(AccountItem accountItem);

    // 카드 아이템 비활성화하기
    void deleteAccountItem(Long accountItemId);

}