<%--
  Created by IntelliJ IDEA.
  User: 2020
  Date: 29.01.2022
  Time: 23:36
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
  <div class="row-mt-5">
    <div class="col sm-12">
      <h4 class="mb-4">
        Login to System
      </h4>
      <%
        String success = request.getParameter("passerror");
        if(success!=null)
        {
      %>
      <div class="alert alert-danger d-flex align-items-center" role="alert">
        <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Danger:"><use xlink:href="#exclamation-triangle-fill"/></svg>
        <div>
          Incorrect password
        </div>
      </div>

      <%
        }
      %>
      <%
        String emailerror = request.getParameter("emailerror");
        if(emailerror!=null)
        {
      %>
      <div class="alert alert-danger d-flex align-items-center" role="alert">
        <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Danger:"><use xlink:href="#exclamation-triangle-fill"/></svg>
        <div>
          Incorrect email
        </div>
      </div>

      <%
        }
      %>
      <form action="auth" method="post">
        <div class="form-group">
          <label>Email:</label>
          <input type="email" required class="form-control" name="email">
        </div>
        <div class="form-group">
          <label>Password:</label>
          <input type="password" required class="form-control" name="password">
        </div>
        <div class="form-group">
          <button class="btn btn-success">Login</button>
        </div>
      </form>

    </div>
  </div>
</div>
</body>
</html>

