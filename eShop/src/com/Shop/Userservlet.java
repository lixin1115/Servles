package com.Shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Userservlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setCharacterEncoding("UTF-8");//����������ݵı����ʽ
	        response.setContentType("text/plain");//����������ļ�����
	        PrintWriter out=response.getWriter();
	        Cookie cookie=new Cookie("userName", "zhangsan");
	        response.addCookie(cookie);
	        System.out.println("����Cookie��ɣ�");
	}
}
