package com.wsw.service.impl;

import com.wsw.dao.AccountDao;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/28 12:29
 * @description
 */
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
}
