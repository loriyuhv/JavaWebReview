package com.wsw.dao;

import com.wsw.domain.Account;
import org.apache.ibatis.annotations.Select;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/28 12:18
 */
public interface AccountDao {
    @Select("SELECT * FROM tb_account WHERE id = #{id}")
    Account findById(Integer id);
}
