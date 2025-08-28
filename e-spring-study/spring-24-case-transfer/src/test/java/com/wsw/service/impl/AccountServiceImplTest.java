package com.wsw.service.impl;

import com.wsw.config.SpringConfig;
import com.wsw.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = SpringConfig.class)
class AccountServiceImplTest {
    @Autowired
    private AccountService accountService;

    @Test
    void transfer() {
        accountService.transfer("Jerry", "Tom", 2000D);
    }
}