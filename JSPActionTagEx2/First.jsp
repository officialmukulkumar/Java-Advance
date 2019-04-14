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
		<jsp:useBean id="t1" class="my.MyBean" scope ="session">
		<jsp:setProperty name="t1" property="username" value="<%=n%>" />
		<jsp:setProperty name="t1" property="password" value="<%=p%>" />
		<jsp:setProperty name="t1" property="age" value="<%= Integer.parseInt(a)%>" />
		</jsp:useBean>
		
		<a href = "Second.jsp"> Call Second JSP Page </a>
	</body>
</html>