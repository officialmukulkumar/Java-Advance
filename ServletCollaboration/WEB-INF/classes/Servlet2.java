import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Servlet2 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String n= req.getParameter("name");
			String r= req.getParameter("roll");			
			out.println("<html><head><title>Servlet Collaboration</title></head>");
			out.println("<body bgcolor =lightblue>");
			out.println("<marquee><h1>Implentation of Servlet Collaboration !!</h1></marquee><br> ");
			out.println("Hello Servlet 2");
			out.println("<br>Name :"+n);
			out.println(" <br>Roll :"+r);
			out.println("<br>Bye Servlet 2");
			out.println("</body></html>");			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}