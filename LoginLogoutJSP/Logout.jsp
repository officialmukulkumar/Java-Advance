<%@page errorPage="Error.jsp"%>

<%
	String e =(String)session.getAttribute("email");
	if(e !=null){
		session.invalidate();
		response.sendRedirect("index.html");
	}else{
		response.sendRedirect("loginerror2.html");
	}
%>