<html>
	<head>
		<title>My Add  App via JSP</title>
	</head>
	<body bgcolor ="linen">
		<marquee>
			<h1>My Add  App via JSP</h1>
		</marquee><br>
		<%
			String s1=request.getParameter("num1");
			String s2=request.getParameter("num2");
			int n1= Integer.parseInt(s1);
			int n2= Integer.parseInt(s2);
			int n = n1+n2;
		%>
		<h1> Sum of <%=n1%> and <%=n2%> = <%=n%></h1>
	</body>
</html>