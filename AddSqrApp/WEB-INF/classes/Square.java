import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class Square extends HttpServlet{
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		String s1=req.getParameter("dig1");
		int n3= Integer.parseInt(s1);
		int sq = n3*n3;
		
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("<html><body>");
		out.println("<h1>My First Add + Square App</h1>");
		out.println("Square of " + n3  + " = "+ sq);
		out.println("</body></html>");

	}
	
	

}