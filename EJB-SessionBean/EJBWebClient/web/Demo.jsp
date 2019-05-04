
<%@page import="my.SumInter"%>
<%@page import="javax.naming.InitialContext"%>
<html>
    <head>
        <title>EJB Web Client</title>
    </head>
    <body>
        <%
            int a = Integer.parseInt(request.getParameter("num"));
            InitialContext ctx = new InitialContext();
            SumInter s = (SumInter) ctx.lookup("xyz");
            s.incrementNum();
        %>
        <%= s.getX()%>
        <br>
        <%= s.square(a)%>
        <br>
        <%= s.showNum()%>
    </body>
</html>
