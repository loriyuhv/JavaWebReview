package com.wsw.dao;

import com.wsw.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/31 14:59
 * @description
 */
public interface BookDao {
    /**
     * 保存图书
     * @param book 图书
     * @return 操作数 成功：1 失败：0
     */
    @Insert("INSERT INTO tb_book (type, name, description) VALUES (#{type}, #{name}, #{description});")
    Integer save(Book book);

    /**
     * 更新图书
     * @param book 图书
     * @return 操作数 成功：1 失败：0
     */
    @Update("UPDATE tb_book SET type = #{type}, name = #{name}, description = #{description} WHERE id = #{id};")
    Integer update(Book book);

    /**
     * 删除图书
     * @param id 图书Id
     * @return 操作数 成功：1 失败：0
     */
    @Delete(("DELETE FROM tb_book WHERE id = #{id};"))
    Integer delete(Integer id);

    /**
     * 通过图书id查找图书
     * @param id 图书Id
     * @return 图书对象
     */
    @Select("SELECT * FROM tb_book WHERE id = #{id};")
    Book findById(Integer id);

    /**
     * 查找全部图书
     * @return 图书对象集合
     */
    @Select("SELECT * FROM tb_book;")
    List<Book> findAll();
}
