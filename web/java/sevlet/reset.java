package sevlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import sevlet.loginDAO;
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
public class reset extends HttpServlet 
{

     public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
     {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       String email=request.getParameter("email");
       String pass=request.getParameter("psw");
       String cp=request.getParameter("cpsw");

        out.println(email);
        out.println(pass);
        out.println(cp);
        
         loginDAO l = new loginDAO();
        String result;
         try {
             result = l.add1(email, pass, cp);
             response.sendRedirect("signup.html");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
         }
        
     }
    
}
