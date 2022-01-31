<%--
  Created by IntelliJ IDEA.
  User: 2020
  Date: 29.01.2022
  Time: 17:48
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
        <div class="col-sm-12">
            <h1>
                <%
                    String text = (String) request.getAttribute("text");
                    out.print(text);
                %>

            </h1>
        </div>
    </div>
    <div class="row mt-5">
        <div class="col-sm-6 offset-3">
            <form action="setsession" method="post">
                <div class="form-group">
                    <label>SESSION VALUE</label>
                    <input type="text" name="session_value" class="form-control">
                </div>
                <br>
                <button class="btn btn-success">SET SESSION</button>
            </form>
        </div>
    </div>
    <div class="row mt-5">
    <div class="col-sm-6 offset-3">
        <form action="setsession" method="post">
            <div class="form-group">
                <label>BASKET VALUE</label>
                <input type="text" name="session_value" class="form-control">
            </div>
            <br>
            <button class="btn btn-success">SET SESSION</button>
        </form>
    </div>
</div>

</div>
</body>
</html>