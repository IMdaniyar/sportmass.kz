package com.EE.Servlets;

import com.EE.Database.DBManager;
import com.EE.Database.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class AutorizServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email =  request.getParameter("email");
        String password =  request.getParameter("password");

        String redirect = "login?emailerror";

        Users users = DBManager.getUsers(email);
        if(users!=null)
        {
            redirect = "login?passerror";
            if(users.getPassword().equals(password))
            {
                request.getSession().setAttribute("CURRENT_USER", users);
                redirect = "Products.jsp";
            }
        }
        response.sendRedirect(redirect);

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
