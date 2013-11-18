<%-- 
    Document   : accessDeniedForAdmin
    Created on : 19.11.2013, 1:46:47
    Author     : Gudrat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access at restricted time</title>
    </head>
    <body>
        <h1>
            Dear Admin ${sessionScope.username}, sorry, you want to access the admin page at restricted time.<br/>
            You now that allowed time is between 9am and 9pm.
        </h1>
    </body>
</html>
