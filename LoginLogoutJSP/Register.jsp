<%@page import="java.sql.*"%>
<%@page errorPage="Error.jsp"%>

<%
	try{
			String e= request.getParameter("email");
			String n= request.getParameter("name");
			String ph= request.getParameter("phone");
			int a= Integer.parseInt(request.getParameter("age"));
			String p= request.getParameter("pass");
			String driver = application.getInitParameter("driver");
			String path = application.getInitParameter("path");
			String id = application.getInitParameter("id");
			String pass = application.getInitParameter("pass");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(path,id,pass);
			Statement st = con.createStatement();
			st.executeUpdate(
			"insert into user_info values ('"+e+"','"+n+"','"+ph+"',"+a+",'"+p+"')");
			session.setAttribute("name",n);
			session.setAttribute("email",e);
			session.setAttribute("phone",ph);
			session.setAttribute("age",a);
			response.sendRedirect("Profile.jsp");
		}
		catch(SQLIntegrityConstraintViolationException ex){
			response.sendRedirect("registererror2.html");
		}
%>