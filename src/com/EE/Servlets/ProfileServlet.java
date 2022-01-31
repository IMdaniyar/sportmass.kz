package com.EE.Servlets;

import com.EE.Database.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users currentUsers = (Users) request.getSession().getAttribute("CURRENT_USER");
        if(currentUsers!=null)
        {
            request.getRequestDispatcher("profile.jsp").forward(request,response);
        }
        else
        {
            response.sendRedirect("login");
        }

    }
}