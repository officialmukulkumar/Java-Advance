import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class JdbcEx extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String u= req.getParameter("user");
			out.println("<html><head><title>My Jdbc App</title></head>");
			out.println("<body bgcolor =lightgreen>");
			out.println("<marquee><h1>My Jdbc App</h1></marquee><br> ");
			out.println("<center><h1>Find the User  !</h1></center><br>");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/myjdbcex","root","incapp");
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(
			"select * from user_info where UserId = '"+u+"'");
			if(rs.next()){
				out.println("<br> Name :" +rs.getString(2));
				out.println("<br> Phone :" +rs.getString(3));
				out.println("<br> Age :" +rs.getString(4));
				out.println("<br> Email :" +rs.getString(5));				
			}else{
				out.println("<b>No Data Found !!</b>");
			}
			out.println("</body></html>");
			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}