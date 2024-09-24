package com.demo.travel.domain.card.service;

import java.util.List;

import com.demo.travel.domain.card.entity.CardItem;

/*
 * [Card Item] 홈페이지에서 보여줄 카드 종류 및 혜택 정보 관리
 */
public interface CardItemService {

    // 1. 카드 아이템 종류 목록 조회
    List<CardItem> getCardItemList();

    // 2. 카드 아이템 상세 조회
    CardItem getCardItemDetail(Long cardItemId);

    // 3. 카드 아이템 등록 (관리자)
    String createCardItem(CardItem cardItem);

    // 4. 카드 아이템 수정 (관리자)
    String updateCardItem(Long cardItemId, CardItem cardItem);

    // 5. 카드 아이템 삭제 (관리자)
    String deleteCardItem(Long cardItemId);

}
