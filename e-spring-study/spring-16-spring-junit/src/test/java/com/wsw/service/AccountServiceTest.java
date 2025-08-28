package com.wsw.service;

import com.wsw.config.SpringConfig;
import com.wsw.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

// Junit Jupiter 5已经废弃
// @RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(classes = {SpringConfig.class})
class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    void findById() {
        Account account = accountService.findById(2);
        System.out.println(account);
        assertNotNull(account);
    }
}