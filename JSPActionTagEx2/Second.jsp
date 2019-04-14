<html>
	<head>
		<title>JSP Action Tag Ex</title>
	</head>	
	<body bgcolor="lightgreen">
		<h1>Using useBean, setProperty, getProperty</h1>
		<jsp:useBean id="t1" class="my.MyBean" scope ="session" />
		<b>
			You have Filled Below Details :<br>
			<jsp:getProperty name="t1" property="username" /> <br>
			<jsp:getProperty name="t1" property="password" /><br>
			<jsp:getProperty name="t1" property="age" /><br>
		</b>
	</body>
</html>