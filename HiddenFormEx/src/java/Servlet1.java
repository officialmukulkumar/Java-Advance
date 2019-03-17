
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
            out.println("<title>Hidden Form Ex</title>");
            out.println("</head>");
            out.println("<body bgcolor =linen>");
            out.println("Hello ");
            out.println("<b>" + n1 + "</b>");
            out.println("<form action= 's2' method='post'>");
            out.println("<input type='hidden' name ='name' value='" + n1 + "'> ");
            out.println("<input type='hidden' name ='roll' value='" + n2 + "'>  ");
            out.println("<input type='submit' value='GO'> ");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            out.println(ex);
        }
    }

}
