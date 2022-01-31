package com.EE.Servlets;

import com.EE.Database.DBManager;
import com.EE.Database.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/toregister")
public class toRegisterServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String re_password = request.getParameter("re_password");
        String full_name = request.getParameter("full_name");

        String redirect = "register?passerror";

        if(password.equals(re_password))
        {
            redirect = "register?emailerror";

            Users users = DBManager.getUsers(email);

            if(users == null)
            {
                Users newUser = new Users(null, email, password, full_name);
                if (DBManager.addUser(newUser))
                {
                    redirect = "register?success";
                }
            }

        }
        response.sendRedirect(redirect);



    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}