package my;

import java.sql.*;
import javax.servlet.*;

public class ListenerEx implements ServletContextListener {

    Connection con;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/myjdbcex", "root", "incapp");
            ServletContext ctx =sce.getServletContext();
            ctx.setAttribute("dbCon",con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        try {
            con.close();
            ServletContext ctx =sce.getServletContext();
            ctx.setAttribute("dbCon",null);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
