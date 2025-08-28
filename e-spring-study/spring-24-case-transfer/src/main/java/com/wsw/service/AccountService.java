package com.wsw.service;

/**
 * @author loriyuhv
 * @date 2025/8/28 20:36
 * @description
 */
public interface AccountService {
    /**
     * 转账操作
     * @param out 转出方
     * @param in 转入方
     * @param money 金额
     */
    void transfer(String out, String in, Double money);
}
