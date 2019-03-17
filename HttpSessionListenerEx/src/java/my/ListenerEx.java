package my;

import javax.servlet.http.*;
import javax.servlet.*;

public class ListenerEx implements HttpSessionListener {

    ServletContext ctx = null;
    private static int sessionCurrent, sessionTotal;

    @Override
    public void sessionCreated(HttpSessionEvent hse) {
        sessionCurrent++;
        sessionTotal++;
        ctx = hse.getSession().getServletContext();
        ctx.setAttribute("TotalSession",sessionTotal);
        ctx.setAttribute("CurrentSession",sessionCurrent);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent hse) {
        sessionCurrent--;
        ctx.setAttribute("CurrentSession", sessionCurrent);
    }

}
