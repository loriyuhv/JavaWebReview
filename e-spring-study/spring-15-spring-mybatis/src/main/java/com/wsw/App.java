package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.domain.Account;
import com.wsw.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/28 0:22
 * @description
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        // 增
        Account account1 = new Account();
        account1.setName("Thomas");
        account1.setMoney(30000.00);
        accountService.insert(account1);

        // 删
        accountService.delete(9);

        //改
        Account account2 = new Account();
        account2.setId(1);
        account2.setName("Jerry");
        account2.setMoney(20000.00);
        accountService.update(account2);

        //查
        Account account = accountService.select(1);
        System.out.println("id:1==>" + account);

        // 查询全部账户信息
        List<Account> accounts = accountService.selectAll();
        for (Account ac : accounts) {
            System.out.println(ac);
        }
    }
}
