<%-- 
    Document   : accessDenied
    Created on : 19.11.2013, 0:33:01
    Author     : Gudrat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access Denied!!!</title>
    </head>
    <body>
        <h3>
            Dear ${sessionScope.username}, sorry, you don't have access to admin page.
            Please, contact administrator for additional information.
        </h3>
    </body>
</html>

