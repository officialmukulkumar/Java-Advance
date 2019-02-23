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
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/loginlogout","root","incapp");
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(
			"select * from user_info where Email = '"+e+"' and Password = '"+p+"'");
			if(rs.next()){
				RequestDispatcher rd=req.getRequestDispatcher("Profile");
				rd.forward(req,res);
			}else{
				res.sendRedirect("loginerror.html");
			}			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}	
}