<%@ page import="com.EE.Database.Product" %><%--
  Created by IntelliJ IDEA.
  User: 2020
  Date: 26.01.2022
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="Vendor/header.jsp"%>
</head>
<body>
<%Product product = (Product) request.getAttribute("products");%>
<%@include file="Vendor/navbar.jsp"%>
<%
    if (product == null)
    {
%>
<h1>PAGE NOT FOUND</h1>
<%
    }
    else
    {
    %>
<div class="container">
    <div class="row mt-5">
        <div class="col">
            <div class="card">
                <div class="card-header">
                    product ID: <%=product.getId() %>
                </div>
                <div class="card-body">
                    <h5 class="card-title"><%=product.getName()%> <%=product.getCategory()%>
                    </h5>
                    <p class="card-text">PRICE: <%=product.getPrice()%> tg</p>
                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                        EDIT PRODUCT
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">EDITING PRODUCT</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form method="post" action="/edit">
                    <input type="hidden" value="<%=product.getId()%>" name="id">
                    <div class="mb-3">
                        <label class="form-label">Name</label>
                        <input type="text" class="form-control" name="name" value="<%=product.getName()%>">
                    </div>
                    <div class="mb-3">
                        <label class="form-label" >Category</label>
                        <input type="text" name="category" class="form-control" value = "<%=product.getCategory()%>" >
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Amount</label>
                        <input type="number" name="amount" class="form-control" value = "<%=product.getPrice()%>">
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Price</label>
                        <input type="number" name="price" class="form-control" value = "<%=product.getAmount()%>">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button class="btn btn-primary">Save changes</button>
                    </div>
                </form>
            </div>

        </div>
    </div>
</div>

<%
    }
%>
</body>
</html>
