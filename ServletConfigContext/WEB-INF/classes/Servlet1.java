import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet{
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{		
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		ServletContext ctx = getServletContext();
		ServletConfig con = getServletConfig();		
		String s1 = con.getInitParameter("Email");
		String s2 = ctx.getInitParameter("Cname");
		out.println("<html><body bgcolor = lightgreen>");
		out.println("<br> Hello Sevlet 1");
		out.println("<br> Company : "+s2);
		out.println("<br> Email : "+s1);
		out.println("</body></html>");

	}
}