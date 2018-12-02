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
public class booking extends HttpServlet {
     
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String pickup=request.getParameter("pickup");
        String dropin=request.getParameter("dropin");
        String when=request.getParameter("when");
        
        out.println(pickup);
        out.println(dropin);
        out.println(when);
       
         loginDAO l = new loginDAO();
        String result1 = null;
         try {
             result1 = l.bc(pickup, dropin, when);
             response.sendRedirect("driver.html");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
}

    

  