package com.demo.travel.domain.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.travel.domain.account.entity.AccountItem;

@Repository
public interface AccountItemRepository extends JpaRepository<AccountItem, Long> {

}
