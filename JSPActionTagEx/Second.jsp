<html>
	<head>
		<title>JSP Action Tag Ex</title>
	</head>	
	<body bgcolor="lightgreen">
		<h1>Using useBean, setProperty, getProperty</h1>
		<b>
			You have Filled Below Details
			<%
				my.MyBean t1 = (my.MyBean)session.getAttribute("t1");
			%>
			<br>
			<%= t1.getUsername() %>
			<br>
			<%= t1.getPassword() %>
			<br>
			<%= t1.getAge() %>
		</b>
	</body>
</html>