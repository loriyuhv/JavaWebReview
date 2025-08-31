package com.wsw.service;

import com.wsw.domain.Book;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/31 15:06
 * @description
 */
public interface BookService {
    /**
     * 保存图书
     * @param book 图书
     * @return 操作数 成功：1 失败：0
     */
    Integer save(Book book);

    /**
     * 更新图书
     * @param book 图书
     * @return 操作数 成功：1 失败：0
     */
    Integer update(Book book);

    /**
     * 删除图书
     * @param id 图书Id
     * @return 操作数 成功：1 失败：0
     */
    Integer delete(Integer id);

    /**
     * 通过图书id查找图书
     * @param id 图书Id
     * @return 图书对象
     */
    Book findById(Integer id);

    /**
     * 查找全部图书
     * @return 图书对象集合
     */
    List<Book> findAll();
}
