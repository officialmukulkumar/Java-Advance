import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Register extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		try{
			res.setContentType("text/html");
			String e= req.getParameter("email");
			String n= req.getParameter("name");
			String ph= req.getParameter("phone");
			int a= Integer.parseInt(req.getParameter("age"));
			String p= req.getParameter("pass");
			ServletContext ctx = getServletContext();
			String driver = ctx.getInitParameter("driver");
			String path = ctx.getInitParameter("path");
			String id = ctx.getInitParameter("id");
			String pass = ctx.getInitParameter("pass");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(path,id,pass);
			Statement st = con.createStatement();
			st.executeUpdate(
			"insert into user_info values ('"+e+"','"+n+"','"+ph+"',"+a+",'"+p+"')");
			HttpSession hs=req.getSession();
			hs.setAttribute("name",n);
			hs.setAttribute("email",e);
			hs.setAttribute("phone",ph);
			hs.setAttribute("age",a);
			res.sendRedirect("Profile");
		}
		catch(SQLIntegrityConstraintViolationException ex){
			res.sendRedirect("registererror2.html");
		}
		catch(Exception ex){
			res.sendRedirect("registererror.html");
		}
	}
	
}