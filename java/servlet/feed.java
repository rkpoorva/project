package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author !$#aAn pA$r!Ja
 */
public class feed extends HttpServlet {
     
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String msg=request.getParameter("msg");
        
        out.println(name);
        out.println(email);
        out.println(msg);
       
         loginDAO l = new loginDAO();
        String result1 = null;
         try {
             result1 = l.feed(name, email, msg);
             //response.sendRedirect("bc.html");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
}

    

  