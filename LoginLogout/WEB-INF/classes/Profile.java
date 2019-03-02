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
			HttpSession hs = req.getSession(false);
			if(hs !=null){
				ServletContext ctx = getServletContext();
				Integer c =(Integer)ctx.getAttribute("count");
				if(c==null)
					c=0;
				ctx.setAttribute("count",++c);
			out.println("<html><head><title>Login-Logut App</title></head>");
			out.println("<body bgcolor ='#ff8080'>");
			out.println("<h1><center>Login-Logut App</center></h1>");
			out.println("<h1 align='right'><a href='Logout'>Logout</a></h1>");
			out.println("<hr><br>");
			out.println("<br> Welcome :" +(String)hs.getAttribute("name"));
			out.println("<br> Email :" +(String)hs.getAttribute("email"));	
			out.println("<br> Phone :" +(String)hs.getAttribute("phone"));
			out.println("<br> Age :" +(Integer)hs.getAttribute("age"));
			out.println("<br><br><hr>");
			out.println("<h1>Total No of Visitors: <b>"+c+"</b></h1>");
			out.println("</body></html>");	
			}else{
				res.sendRedirect("loginerror2.html");
			}		
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}