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
public class signup extends HttpServlet 
{

     public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
     {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       String userName=request.getParameter("username");
       String email=request.getParameter("email");
       String passW=request.getParameter("psw");

        //out.println("hello");

        loginDAO l = new loginDAO();
        try 
        {

           String result = l.addData(userName, email, passW);

           out.println(result);



        } 
        catch (ClassNotFoundException ex) 
        {

            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {

            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);

        }

     }
    
}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

