package com.wsw.dao;

import com.wsw.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author loriyuhv
 * @date 2025/9/2 13:43
 * @description
 */
@Mapper
public interface BookDao {
    @Select("SELECT * FROM tb_book WHERE id = #{id};")
    Book findById(Integer id);
}
