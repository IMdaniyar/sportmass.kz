package com.EE.Servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/setsession")
public class SetSessionServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sessionValue = request.getParameter("session_value");
        HttpSession session = request.getSession();
        session.setAttribute("my_session_value", sessionValue);

        response.sendRedirect("sessions");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

