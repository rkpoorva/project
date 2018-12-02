package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import servlet.loginDAO;
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
public class signup extends HttpServlet 
{

     public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
     {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       String uname=request.getParameter("uname");
       String email=request.getParameter("email");
       String passW=request.getParameter("psw");
       String cp=request.getParameter("cpsw");

        //out.println("hello");
        out.println(uname);
        out.println(email);
        out.println(passW);
        out.println(cp);
        
         loginDAO l = new loginDAO();
        String result;
         try {
             result = l.addData(uname, email, passW, cp);
             response.sendRedirect("signup1.html");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
         }
        
     }
    
}
