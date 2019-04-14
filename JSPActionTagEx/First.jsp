<html>
	<head>
		<title>JSP Action Tag Ex</title>
	</head>	
	<body bgcolor="lightgreen">
		<h1>Using useBean, setProperty, getProperty</h1>
		<%
		String n = request.getParameter("uname");
		String p = request.getParameter("pass");
		String a = request.getParameter("age");
		%>
		<%
		my.MyBean t1 = new my.MyBean();
		t1.setUsername(n);
		t1.setPassword(p);
		t1.setAge(Integer.parseInt(a));
		session.setAttribute("t1",t1);
		%>
		<a href = "Second.jsp"> Call Second JSP Page </a>
	</body>
</html>