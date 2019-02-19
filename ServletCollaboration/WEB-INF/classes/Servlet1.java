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
			out.println("<html><head><title>Servlet Collaboration</title></head>");
			out.println("<body bgcolor =lightgreen>");
			out.println("<marquee><h1>Implentation of Servlet Collaboration !!</h1></marquee><br> ");
			out.println("Hello Servlet 1");
			out.println("<br>Name :"+n);
			out.println("<br>Roll :"+r);			
			//Using sendRequest()
			res.sendRedirect("s2");
			//res.sendRedirect("home.html");
			//res.sendRedirect("http://www.google.com");
			
			//Using RequestDispatcher Interface
			//RequestDispatcher rd = req.getRequestDispatcher("s2");
			//rd.forward(req,res);
			//rd.include(req,res);
			
			out.println("<br>Bye Servlet 1");
			out.println("</body></html>");
			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}