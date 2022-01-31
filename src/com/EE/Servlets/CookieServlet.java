package com.EE.Servlets;

import com.EE.Database.Countries;
import com.EE.Database.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/cookies")
public class CookieServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie[] = request.getCookies();
        String myCookieValue = "no Cookie Data";

        if(cookie!=null)
        {
            for(Cookie c:cookie)
            {
                if(c.getName().equals("my_cookie"))
                {
                    myCookieValue = c.getValue();
                    break;
                }
            }
        }
        request.setAttribute("cookieValue",myCookieValue);
        request.getRequestDispatcher("/cookies.jsp").forward(request,response);
    }
}
