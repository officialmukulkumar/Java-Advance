
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try {
            String n1 = request.getParameter("name");
            String n2 = request.getParameter("roll");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>URL Rewriting Ex</title>");
            out.println("</head>");
            out.println("<body bgcolor =linen>");
            out.println("Hello ");
            out.println("<b>" + n1 + "</b>");
            out.println("<br><a href='s2?name="+n1+"&roll="+n2+"'>Invoke Servlet2</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            out.println(ex);
        }
    }

}
