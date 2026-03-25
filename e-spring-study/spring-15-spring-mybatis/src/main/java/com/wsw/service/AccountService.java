package com.wsw.service;

import com.wsw.domain.Account;

import java.util.List;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/28 0:11
 */
public interface AccountService {
    Account select(int id);
    void delete(Integer id);
    void insert(Account account);
    void update(Account account);
    List<Account> selectAll();
}
