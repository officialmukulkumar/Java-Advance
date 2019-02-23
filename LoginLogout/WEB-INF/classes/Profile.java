import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Profile extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String e= req.getParameter("email");
			out.println("<html><head><title>Login-Logut App</title></head>");
			out.println("<body bgcolor ='#ff8080'>");
			out.println("<h1><center>Login-Logut App</center></h1>");
			out.println("<h1 align='right'><a href='index.html'>Logout</a></h1>");
			out.println("<hr><br>");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/loginlogout","root","incapp");
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(
			"select * from user_info where Email = '"+e+"'");
			if(rs.next()){
				out.println("<br> Welcome :" +rs.getString("Name"));
				out.println("<br> Email :" +rs.getString("Email"));	
				out.println("<br> Phone :" +rs.getString("Phone"));
				out.println("<br> Age :" +rs.getString("Age"));
							
			}
			out.println("</body></html>");			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}