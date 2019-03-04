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
			Cookie ck[] = req.getCookies();
			out.println("<html><head><title>Cookie Ex</title></head>");
			out.println("<body bgcolor =lightblue>");
			out.println("<marquee><h1>Implentation of Cookie Ex !!</h1></marquee><br> ");
			out.println("Hello Servlet 2");
			for(Cookie c:ck){
				out.println(c.getValue()+"<br>");
			}
			out.println("<br>Bye Servlet 2");
			out.println("</body></html>");			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}