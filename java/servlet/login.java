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
public class login extends HttpServlet {

    
   
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {

        response.setContentType("text/html");

        PrintWriter out=response.getWriter();

        String userName=request.getParameter("uname");

        String passW=request.getParameter("psw");

        
        loginDAO l = new loginDAO();

        try 
        {

           String result = l.checkInfo(userName, passW);
           response.sendRedirect("login1.html");

        } 
        catch(ClassNotFoundException ex) 
        {
     
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);

        } 
        catch (SQLException ex) {

            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);

        }


        

    }


}
