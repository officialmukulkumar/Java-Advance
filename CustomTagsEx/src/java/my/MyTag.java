/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.Scanner;
import javax.servlet.jsp.*;

/**
 *
 * @author Mukul Samrat
 */
public class MyTag extends TagSupport {

    JspWriter out;
    public int doStartTag() throws JspException {
    
        out = pageContext.getOut();
        try {
            out.print("<br>Hello Mukul");
        } catch (Exception ex) {

            //out.print(ex);
        }

        return SKIP_BODY;
    }

    public int doEndTag() throws JspException {
        try {
            int a = 10, b = 20;
            int c = a + b;

            out.print("<br>Sum --> " + c);
        } catch (Exception ex) {

            //out.print(ex);
        }
        return SKIP_PAGE;
    }

}
