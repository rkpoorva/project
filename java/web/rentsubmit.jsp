<%-- 
    Document   : rentsubmit
    Created on : 2 Dec, 2018, 2:21:00 PM
    Author     : !$#aAn pA$r!Ja
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="servlet.booking"%>
<%@page import="servlet.loginDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Confirm Booking</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body
            {
              background-image: url('bc.png');
              background-size: 600px 350px;
              background-repeat: no-repeat;
              background-attachment: fixed;
              background-position: center;
            }
            .bottom-container 
            {
              text-align: center;
              background-color: #666;
              border-radius: 0px 0px 4px 4px;
              align: right;
            }
            .btn 
            {
              width: 100%;
              padding: 12px;
              border: none;
              border-radius: 4px;
              margin: 5px 0;
              opacity: 0.85;
              display: inline-block;
              font-size: 17px;
              line-height: 20px;
              text-decoration: none;
            }
        </style>
    </head>
    <body>
       <%
        String pickup=request.getParameter("pickup");
        String dropin=request.getParameter("dropin");
        String w=request.getParameter("w");
        
        out.println(pickup);
        out.println(dropin);
        out.println(w);
       
         loginDAO l = new loginDAO();
        String result1 = null;
         try {
             result1 = l.bc(pickup, dropin, w);
           //  response.sendRedirect("bc.html");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
         }
           
           
           %>
           
           
        <h1><b><center>THANK YOU</center></b></h1>
        <br><br><br><br><br><br><br><br>
        <br><br><br><br><br><br><br><br>
        <br><br><br><br><br>
        
        <div class="bottom-container">
          <div class="row">
            <div class="col">
               <a href="index.html" style="color:white" class="btn">Continue</a>
            </div>
          </div>
        </div>
        <hr>
       <font size="1" color="gray"> 
       <p><center>By continuing past this page,you agree to our Terms of Service,Cookie Policy,Privacy Policy and Content Policies.</center></p>
       </font>
    </body>
</html>
