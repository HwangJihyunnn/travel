package com.demo.travel.domain.card.service;

/*
 * [Card] 유저의 카드 발급, 재발급, 해지 등 카드 관련 서비스
 */
public interface CardService {

    // 1. 카드 발급 받기
    String createCard();

    // 2. 카드 재발급 받기
    String reissueCard();

    // 3. 카드 해지하기
    String deleteCard();

    /*
     * 카드 사용 내역 관련
     */
    // 1. 카드 사용 내역 조회

    // 2. 카드 사용 내역 상세 조회

    // 3. 카드 사용 내역 등록 (이벤트리스너 처리)

    // 4. 카드 사용 내역 수정

    // 5. 카드 사용 내역 삭제

}
