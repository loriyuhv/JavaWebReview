package com.wsw.dao;

import com.wsw.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/27 22:19
 * @description
 */
public interface AccountDao {
    @Insert("INSERT INTO tb_account (name, money) VALUES (#{name}, #{money})")
    void insert(Account account);

    @Delete(("DELETE FROM tb_account WHERE id = #{id}"))
    void delete(Integer id);

    @Delete("UPDATE tb_account SET name = #{name}, money = #{money} WHERE id = #{id}")
    void update(Account account);

    @Select("SELECT * FROM tb_account WHERE id = #{id}")
    Account select(Integer id);

    List<Account> selectAll();
}
