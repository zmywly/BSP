package com.BSP.Servlet;

import com.BSP.Service.BookService;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DeleteBookByAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受json并转化为 Collection 对象，将前端传来的收藏id放入对象中
        BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream) req.getInputStream(), "utf-8"));
        StringBuffer sb = new StringBuffer("");
        String temp;
        while ((temp = br.readLine()) != null) {
            sb.append(temp);
        }
        br.close();
        String jsonStr = sb.toString();
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        int id = Integer.valueOf(jsonObject.getString("id"));

        BookService bookService = new BookService();
        Map<String, String> map = new HashMap<String, String>();

        bookService.deleteBook(id);
        map.put("status", "true");
        String jsonMap = JSONObject.fromObject(map).toString();
        resp.getWriter().print(jsonMap);
    }

}
