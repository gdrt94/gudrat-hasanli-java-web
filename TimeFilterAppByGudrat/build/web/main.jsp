<%-- 
    Document   : main
    Created on : 19.11.2013, 0:25:07
    Author     : Gudrat
--%>

<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
            <h1>Hello ${sessionScope.username}!</h1>
             
            <%
                out.println("Session id = " + session.getId() + "<br/>");
                out.println("Session create time = " + new Date(session.getCreationTime())  + "<br/>");
                out.println("Session last active time = " + new Date(session.getLastAccessedTime()) + "<br/>");
                out.println("Is new = " + (session.isNew() ? "true" : "false") + "<br/>");
                out.println("Timeout (seconds) period = " + session.getMaxInactiveInterval() + "<br/>");
                
                out.println("<h2>Session attributes </h2>");
                Enumeration<String> attributes = session.getAttributeNames();
                while(attributes.hasMoreElements()) {
                    String name = attributes.nextElement();
                    Object value = session.getAttribute(name);
                    out.println(name + " = " + value + "<br/>");
                }
                
                out.println("<a href='logout'>Logout</a>");
        %>
        
        
        
    </body>
</html>
