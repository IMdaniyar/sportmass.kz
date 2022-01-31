package com.EE.Servlets;

import com.EE.Database.DBManager;
import com.EE.Database.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/edit")
public class EditProductServlet extends HttpServlet
{
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Long id = Long.parseLong(request.getParameter("id"));
            String name = request.getParameter("name");
            String category = request.getParameter("category");
            int amount = Integer.parseInt(request.getParameter("amount"));
            int price = Integer.parseInt(request.getParameter("price"));


        }
    }

