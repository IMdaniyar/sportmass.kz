<%--
  Created by IntelliJ IDEA.
  User: 2020
  Date: 25.01.2022
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="Vendor/header.jsp"%>
</head>
<body>
<%@include file="Vendor/navbar.jsp"%>
<div class="container">
    <div class="row mt-5">
        <div class="col text-center">
            <form method="post" action="/addProduct">
                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" class="form-control" name="name">
                </div>
                <div class="mb-3">
                    <label class="form-label" >Category</label>
                    <input type="text" name="category" class="form-control" >
                </div>
                <div class="mb-3">
                    <label class="form-label">Amount</label>
                    <input type="number" name="amount" class="form-control">
                </div>
                <div class="mb-3">
                    <label class="form-label">Price</label>
                    <input type="number" name="price" class="form-control">
                </div>
                <button class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
