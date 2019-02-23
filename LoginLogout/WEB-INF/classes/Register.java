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
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/loginlogout","root","incapp");
			Statement st = con.createStatement();
			st.executeUpdate(
			"insert into user_info values ('"+e+"','"+n+"','"+ph+"',"+a+",'"+p+"')");
			RequestDispatcher rd=req.getRequestDispatcher("Profile");
				rd.forward(req,res);

		}
		catch(SQLIntegrityConstraintViolationException ex){
			res.sendRedirect("registererror2.html");
		}
		catch(Exception ex){
			res.sendRedirect("registererror.html");
		}
	}
	
}