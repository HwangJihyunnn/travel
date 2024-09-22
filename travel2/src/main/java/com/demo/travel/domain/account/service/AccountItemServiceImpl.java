package com.demo.travel.domain.account.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.travel.domain.account.entity.AccountItem;
import com.demo.travel.domain.account.repo.AccountItemRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountItemServiceImpl implements AccountItemService {

    private final AccountItemRepository accountItemRepository;

    @Override
    public List<Object> selectAccountItemList() {
        List<AccountItem> accountItemList = accountItemRepository.findAll();

        List<Object> accountItemResponseList = null;

        return accountItemResponseList;
    }

    @Override
    public Object selectAccountItem(Long accountItemId) {
        try {
            AccountItem accountItem = accountItemRepository.findById(accountItemId)
                    .orElseThrow(() -> new IllegalArgumentException("해당 카드 아이템이 존재하지 않습니다. id=" + accountItemId));
            
            Object accountItemResponse = new Object();
            return accountItemResponse;
        } catch (Exception e) {
            log.error("selectAccountItem error", e);
            throw e;
        }
    }

    @Override
    public void insertAccountItem(Object accountItem) {
        throw new UnsupportedOperationException("Unimplemented method 'insertAccountItem'");
    }

    @Override
    public void insetAccountItemList(List<Object> accountItemList) {
        throw new UnsupportedOperationException("Unimplemented method 'insetAccountItemList'");
    }


    @Override
    public void updateAccountItem(AccountItem accountItem) {
        throw new UnsupportedOperationException("Unimplemented method 'updateAccountItem'");
    }

    @Override
    public void deleteAccountItem(Long accountItemId) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccountItem'");
    }

    
}