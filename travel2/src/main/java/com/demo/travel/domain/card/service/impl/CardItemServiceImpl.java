package com.demo.travel.domain.card.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.travel.domain.card.entity.CardItem;
import com.demo.travel.domain.card.repository.CardItemRepository;
import com.demo.travel.domain.card.service.CardItemService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("cardItemService")
@RequiredArgsConstructor
public class CardItemServiceImpl implements CardItemService {

    private final CardItemRepository cardItemRepository;

    @Override
    public List<CardItem> getCardItemList() {
        /*
            TODO 카드 항목을 조회할 비지니스 로직을 구현합니다.
            1. 필터
            2. 카테고리
            3. 정렬
            4. 검색
            5. 페이징
            6. 추천
            7. 이미지
            8. 등등
        */
        return cardItemRepository.findAll();
    }

    @Override
    public CardItem getCardItemDetail(Long cardItemId) {
        throw new UnsupportedOperationException("Unimplemented method 'getCardItemDetail'");
    }

    @Override
    public String createCardItem(CardItem cardItem) {
        throw new UnsupportedOperationException("Unimplemented method 'createCardItem'");
    }

    @Override
    public String updateCardItem(Long cardItemId, CardItem cardItem) {
        throw new UnsupportedOperationException("Unimplemented method 'updateCardItem'");
    }

    @Override
    public String deleteCardItem(Long cardItemId) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteCardItem'");
    }

}
