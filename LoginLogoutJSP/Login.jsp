<%@page import="java.sql.*"%>
<%@page errorPage="Error.jsp"%>
<%
	String e= request.getParameter("email");
	String p= request.getParameter("pass");
	String driver = application.getInitParameter("driver");
	String path = application.getInitParameter("path");
	String id = application.getInitParameter("id");
	String pass = application.getInitParameter("pass");
	Class.forName(driver);
	Connection con = DriverManager.getConnection(path,id,pass);
	Statement st = con.createStatement();
	ResultSet rs=st.executeQuery(
	"select * from user_info where Email = '"+e+"' and Password = '"+p+"'");
	if(rs.next()){
		session.setAttribute("email",rs.getString("Email"));
		session.setAttribute("name",rs.getString("Name"));
		session.setAttribute("phone",rs.getString("Phone"));
		session.setAttribute("age",rs.getInt("Age"));
		response.sendRedirect("Profile.jsp");
	}else{
		response.sendRedirect("loginerror.html");
	}
%>