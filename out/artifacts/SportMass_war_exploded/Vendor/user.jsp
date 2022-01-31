<%@ page import="com.EE.Database.Users"%>
<%
    Users CurrentUser = (Users) request.getSession().getAttribute("CURRENT_USER");
    boolean Online= false;
    if(CurrentUser!=null)
    {
        Online = true;
    }
%>
