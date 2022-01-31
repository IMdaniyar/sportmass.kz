package com.EE.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sessions")
public class SessionsServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String sessionValue = (String)session.getAttribute("my_session_value");
        System.out.println(sessionValue);

        request.setAttribute("text","U session value: " + sessionValue);

        request.getRequestDispatcher("sessions.jsp").forward(request,response);
    }
}