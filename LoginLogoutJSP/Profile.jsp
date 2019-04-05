<%@page errorPage="Error.jsp"%>

<%
	String e =(String)session.getAttribute("email");
	if(e !=null){
		String n =(String)session.getAttribute("name");
		String p =(String)session.getAttribute("phone");
		Integer a =(Integer)session.getAttribute("age");
%>
<html>
	<head>
		<title>Login-Logut App</title>
	</head>
	<body bgcolor ='#ff8080'>
	<h1><center>Login-Logut App</center></h1>
	<h1 align='right'><a href='Logout.jsp'>Logout</a></h1>
	<hr><br>
	Welcome : <%=n%>
	<br> Email :<%=e%>
	<br> Phone : <%=p%>
	<br> Age : <%=a%>
	<br><br><hr>
	<%
		Integer c =(Integer)application.getAttribute("count");
		if(c==null)
			c=0;
		application.setAttribute("count",++c);
	%>
	<h1>Total No of Visitors:<b><%=c%> </b></h1>
	</body>
</html>	
<%
	}else{
		response.sendRedirect("loginerror2.html");
	}
%>