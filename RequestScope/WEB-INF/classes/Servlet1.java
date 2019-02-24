import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Servlet1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String n= req.getParameter("name");
			String r= req.getParameter("roll");			
			out.println("<html><head><title>Request Scope</title></head>");
			out.println("<body bgcolor ='#ff8080'>");
			out.println("<marquee><h1>Implentation of Request Scope !!</h1></marquee><br> ");
			out.println("<br>Name :"+n);
			out.println("<br>Roll :"+r);
			req.setAttribute("company","Incapp");
			
			//Using RequestDispatcher Interface
			RequestDispatcher rd = req.getRequestDispatcher("s2");
			rd.forward(req,res);
			out.println("</body></html>");
			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}