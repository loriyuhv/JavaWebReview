package com.wsw.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wsw.common.ApiResult;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 8:42
 */
@WebServlet("/user/delete")
public class UserDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 1. 接收请求参数
        String name = req.getParameter("name");
        System.out.println("servlet delete name ===> " + name);

        // 2. 设置返回 JSON
        resp.setContentType("application/json;charset=utf-8");

        // 3. 返回数据 writeValue(输出流, 对象) 自动转 JSON + 输出 + 刷新
        new ObjectMapper().writeValue(
                resp.getWriter(),
                ApiResult.ok("servlet delete")
        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.doGet(req, resp);
    }
}
