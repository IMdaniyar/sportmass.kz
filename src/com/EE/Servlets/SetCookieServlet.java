package com.EE.Servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setcookie")
public class SetCookieServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cookie_value = request.getParameter("cookie_value");

        Cookie cookie = new Cookie("my_cookie", cookie_value);
        cookie.setMaxAge(3600);
        response.addCookie(cookie);

        response.sendRedirect("cookies");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}