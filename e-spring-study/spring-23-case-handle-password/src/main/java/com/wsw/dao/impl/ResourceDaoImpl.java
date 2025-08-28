package com.wsw.dao.impl;

import com.wsw.dao.ResourceDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/28 18:32
 * @description
 */
@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean openURL(String url, String password) {
        return password.equals("root");
    }
}
