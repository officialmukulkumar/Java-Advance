import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Logout extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			HttpSession hs = req.getSession(false);
			if(hs !=null){
				hs.invalidate();
				res.sendRedirect("index.html");
			}else{
				res.sendRedirect("loginerror2.html");
			}
			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}