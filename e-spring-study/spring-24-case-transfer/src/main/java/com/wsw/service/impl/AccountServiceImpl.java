package com.wsw.service.impl;

import com.wsw.dao.AccountDao;
import com.wsw.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author loriyuhv
 * @date 2025/8/28 20:37
 * @description
 */
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    // 步骤1:在需要被事务管理的方法上添加注解
    @Transactional
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        // int i = 2 / 0;
        accountDao.inMoney(in, money);
    }
}
