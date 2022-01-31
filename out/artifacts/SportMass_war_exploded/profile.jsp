<%--
  Created by IntelliJ IDEA.
  User: 2020
  Date: 30.01.2022
  Time: 20:10
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
        <div class="col sm-12">
            <h2>
                THIS IS PROFILE OF <%=(Online?CurrentUser.getFull_name():"No user")%>
            </h2>
        </div>
    </div>
</div>

</body>
</html>
