/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
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
            ServletContext ctx = getServletContext();
            Connection con = (Connection) ctx.getAttribute("dbCon");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                    "select * from user_info");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Context Listener Ex</title>");
            out.println("</head>");
            out.println("<body bgcolor =lightblue >");
            while (rs.next()) {
                out.println("<b>");
                out.println(rs.getString(2) + " : " + rs.getString(5));
                out.println("</b>");
                out.println("<br>");
            }
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            out = response.getWriter();
            out.println(ex);
        }
    }

}
