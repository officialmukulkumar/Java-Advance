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
			Cookie c1 = new Cookie("name",n);
			Cookie c2 = new Cookie("roll",r);
			res.addCookie(c1);
			res.addCookie(c2);
			out.println("<html><head><title>Cookie Ex</title></head>");
			out.println("<body bgcolor =lightgreen>");
			out.println("<marquee><h1>Implentation of Cookie Ex !!</h1></marquee><br> ");
			out.println("Hello Servlet 1");
			out.println("<br>Name :"+n);
			out.println("<br>Roll :"+r);	
			out.println("<br>Bye Servlet 1");
			out.println("<br><br>");
			out.println("<a href ='s2'>Call Servlet 2</a>");
			out.println("</body></html>");
			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}