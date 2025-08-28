package com.wsw.service;

import com.wsw.domain.Account;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/28 0:11
 * @description
 */
public interface AccountService {
    Account select(int id);
    void delete(Integer id);
    void insert(Account account);
    void update(Account account);
    List<Account> selectAll();
}
