import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class Add extends HttpServlet{
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		String s1=req.getParameter("num1");
		String s2=req.getParameter("num2");
		int n1= Integer.parseInt(s1);
		int n2= Integer.parseInt(s2);
		int n = n1+n2;
		
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("<html><body>");
		out.println("<h1>My First Add + Square App</h1>");
		out.println("Sum of " + n1 + " and "+ n2 + " = "+ n);
		out.println("</body></html>");

	}
	
	

}