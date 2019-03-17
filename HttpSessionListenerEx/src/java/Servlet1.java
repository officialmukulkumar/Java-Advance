/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Mukul Samrat
 */
public class Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            HttpSession hs = request.getSession();
            ServletContext ctx = getServletContext();
            int ts = (Integer)ctx.getAttribute("TotalSession");
            int cs = (Integer)ctx.getAttribute("CurrentSession");
            String n = request.getParameter("name");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Http Sssion Listener Ex</title>");
            out.println("</head>");
            out.println("<body bgcolor =lightblue >");
            out.println("Hello:<b>" + n + "<b>");
            out.println("<br><hr>");
            out.println("<b>Total Session : " + ts + "</b>");
            out.println("<br><b>Current Session : " + cs + "</b>");
            out.println("<br><hr>");
            System.out.println("1");
            out.println("<a href='logout'>Logout</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            out.println(ex);
            ex.printStackTrace();
        }
    }

}
