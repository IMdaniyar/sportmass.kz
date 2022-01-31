<%@include file="user.jsp"%>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
<div class="container-fluid">
    <a class="navbar-brand" href="#">Sportmass.kz</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <%
                if(Online)
                {
            %>
            <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="profile"><%=CurrentUser.getFull_name()%></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="logout">Logout</a>
            </li>
            <%
            }
            else
            {
            %>
            <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="index">Products</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="login">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="register">Registration</a>
            </li>
            <%
                }
            %>
        </ul>
    </div>
</div>
</nav>

<%--<%--%>
<%--    if(false)--%>
<%--    {--%>

<%--%>--%>
<%--<li class="nav-item">--%>
<%--    <a class="nav-link" href="addProduct.jsp">Add Product</a>--%>
<%--</li>--%>

<%--<li class="nav-item">--%>
<%--    <a class="nav-link" href="cookies">Cookie Home</a>--%>
<%--</li>--%>
<%--<li class="nav-item">--%>
<%--    <a class="nav-link" href="sessions">Sessions Home</a>--%>
<%--</li>--%>
<%--<%--%>
<%--    }--%>
<%--%>--%>