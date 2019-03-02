import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Login extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String e= req.getParameter("email");
			String p= req.getParameter("pass");
			ServletContext ctx = getServletContext();
			String driver = ctx.getInitParameter("driver");
			String path = ctx.getInitParameter("path");
			String id = ctx.getInitParameter("id");
			String pass = ctx.getInitParameter("pass");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(path,id,pass);
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(
			"select * from user_info where Email = '"+e+"' and Password = '"+p+"'");
			if(rs.next()){
				HttpSession hs = req.getSession();
				hs.setAttribute("email",rs.getString("Email"));
				hs.setAttribute("name",rs.getString("Name"));
				hs.setAttribute("phone",rs.getString("Phone"));
				hs.setAttribute("age",rs.getInt("Age"));
				res.sendRedirect("Profile");
			}else{
				res.sendRedirect("loginerror.html");
			}			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}	
}