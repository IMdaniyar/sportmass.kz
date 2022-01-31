<%@ page import="com.EE.Database.Product" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 2020
  Date: 25.01.2022
  Time: 0:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="Vendor/header.jsp"%>
</head>
<body>
<% ArrayList<Product> products = (ArrayList<Product>) request.getAttribute("products");%>
<%@include file="Vendor/navbar.jsp"%>
    <div class="container">
        <div class="row mt-5">
            <div class="col">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>CATEGORY</th>
                        <th>AMOUNT</th>
                        <th>PRICE</th>
                        <th>Details</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%
                        if (products!=null) {
                            for(Product u:products){
                    %>
                    <tr>
                        <td><%=u.getId()%></td>
                        <td><%=u.getName()%></td>
                        <td><%=u.getCategory()%></td>
                        <td><%=u.getAmount()%></td>
                        <td><%=u.getPrice()%></td>
                        <td><a href="details?id=<%=u.getId()%>" class="btn btn-sm btn-info">Info</a></td>
                    </tr>
                    <%
                            }
                        }
                    %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
