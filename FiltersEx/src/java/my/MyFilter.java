/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Mukul Samrat
 */
public class MyFilter implements Filter {

    FilterConfig config;

    @Override
    public void init(FilterConfig fc) throws ServletException {
        config = fc;
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse srl, FilterChain fc) throws IOException, ServletException {

        ServletContext ctx = config.getServletContext();
        Integer count = (Integer) ctx.getAttribute("count");
        if (count == null) {
            count = new Integer(0);
        }
        count++;
        ctx.setAttribute("count", count);

        fc.doFilter(sr, srl);

    }

    @Override
    public void destroy() {

    }

}
