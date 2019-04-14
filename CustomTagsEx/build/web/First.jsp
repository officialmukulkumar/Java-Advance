<%-- 
    Document   : First
    Created on : 13 Apr, 2019, 4:02:45 PM
    Author     : Mukul Samrat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="WEB-INF/tlds/MyTag.tld" prefix="ct" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Custom Tag Ex</title>
    </head>
    <body bgcolor="lightgreen">
        <h1>First Custom Tag</h1>
        <% out.println("Hello JSP");%>
        <ct:MyCustom/>
    </body>
</html>
