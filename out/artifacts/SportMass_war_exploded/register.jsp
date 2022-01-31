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
                Register to System
            </h4>
            <%
                String success = request.getParameter("success");
                if(success!=null)
                {
            %>
            <div class="alert alert-success d-flex align-items-center" role="alert">
                <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Danger:"><use xlink:href="#exclamation-triangle-fill"/></svg>
                <div>
                    USer added successfully
                </div>
            </div>

            <%
                }
            %>
            <%
                String passerror = request.getParameter("passerror");
                if(passerror!=null)
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
            <form action="toregister" method="post">
                <div class="form-group">
                    <label>Email:</label>
                    <input type="email" required class="form-control" name="email">
                </div>
                <div class="form-group">
                    <label>Password:</label>
                    <input type="password" required class="form-control" name="password">
                </div>
                <div class="form-group">
                    <label>re type Password:</label>
                    <input type="password" required class="form-control" name="re_password">
                </div>
                <div class="form-group">
                    <label>Full Name:</label>
                    <input type="text" required class="form-control" name="full_name">
                </div>
                <div class="form-group">
                    <button class="btn btn-success">Register</button>
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>
