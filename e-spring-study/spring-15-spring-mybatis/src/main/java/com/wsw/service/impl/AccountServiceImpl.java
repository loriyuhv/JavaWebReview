package com.wsw.service.impl;

import com.wsw.dao.AccountDao;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/28 0:12
 * @description
 */
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account select(int id) {
        return accountDao.select(id);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void insert(Account account) {
        accountDao.insert(account);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }
}
