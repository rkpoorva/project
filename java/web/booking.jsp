<%-- 
    Document   : booking
    Created on : 2 Dec, 2018, 6:01:22 PM
    Author     : !$#aAn pA$r!Ja
--%>

<%@page import="servlet.booking"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="servlet.loginDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking</title>
         <style>
* {
    box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
    float: left;
    width: 33%;
    padding: 10px;
    height: 520px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
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
           //  response.sendRedirect("driver.html");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
         }
           
           
           %>
        
       <h1><b><center>We have the best drivers for you.....@Rs.9/km</center></b></h1>
<div class="row">
  <div class="column" style="background-color:#aaa;">
    <img src="driver.jpg" style="width:100%;height:60%">
    <h2>Sammy Jo</h2>
    <p><b>Route: Chandigarh to Jallandar<br>
        Car: Maruti Brezza(HR 03 V 2817)<br>
        Ratings: <img src="4 stars.jpg" style="width:30%;height:20%"></b></p>
        <a href="bc.html"><button type="submit" class="btn">Book</button></a>         
  </div>
    
    <div class="column" style="background-color:#aaa;">
    <img src="car signup.jpg" style="width:100%;height:60%">
    <h2>Blake Connor</h2>
    <p><b>Route: Mohali to Jaipur<br>
        Car: Honda City(HR 01 P 5588)<br>
        Ratings: <img src="4.5 stars.jpg" style="width:30%;height:20%"></b></p>
        <a href="bc.html"><button type="submit" class="btn">Book</button></a>         
  </div>
    
    <div class="column" style="background-color:#aaa;">
    <img src="driver1.jpg" style="width:100%;height:60%">
    <h2>Michel Culhane</h2>
    <p><b>Route: Dehli to Shimla <br>
        Car: Maruti Brezza(DL 06 N 2277)<br>
        Ratings: <img src="4 stars.jpg" style="width:30%;height:20%"></b></p>
        <a href="bc.html"><button type="submit" class="btn">Book</button></a>         
  </div>
    
    <div class="column" style="background-color:#aaa;">
    <img src="dirver2.jpg" style="width:100%;height:60%">
    <h2>Francis Stuart</h2>
    <p><b>Route: Shimla to Chandigarh<br>
        Car: Maruti Baleno(HP 15 A 5211)<br>
        Ratings: <img src="3.5 stars.jpg" style="width:30%;height:20%"></b></p>
        <a href="bc.html"><button type="submit" class="btn">Book</button></a>         
  </div>
    
    <div class="column" style="background-color:#aaa;">
    <img src="driver3.jpg" style="width:100%;height:60%">
    <h2>Simon</h2>
    <p><b>Route: Chandigarh to Noida<br>
        Car: Hundai Verna(HR 03 S 2817)<br>
        Ratings: <img src="4 stars.jpg" style="width:30%;height:20%"></b></p>
        <a href="bc.html"><button type="submit" class="btn">Book</button></a>         
  </div>
    
    <div class="column" style="background-color:#aaa;">
    <img src="driver 4.jpg" style="width:100%;height:60%">
    <h2>William Anders</h2>
    <p><b>Route: Chandigarh to Rajasthan<br>
        Car: Maruti Swift(RJ 01 P 0001)<br>
        Ratings: <img src="4 stars.jpg" style="width:30%;height:20%"></b></p>
        <a href="bc.html"><button type="submit" class="btn">Book</button></a>         
  </div>
    
    <div class="column" style="background-color:#aaa;">
    <img src="driver 5.jpg" style="width:100%;height:60%">
    <h2>Sam Masters</h2>
    <p><b>Route: Dehli to Jallandar<br>
        Car: Honda i20(HP 05 Y 1786)<br>
        Ratings: <img src="3 stars.jpg" style="width:30%;height:20%"></b></p>
        <a href="bc.html"><button type="submit" class="btn">Book</button></a>         
  </div>
    
    <div class="column" style="background-color:#aaa;">
    <img src="driver.png" style="width:100%;height:60%">
    <h2>Stefan </h2>
    <p><b>Route: Panchkula to Gurugram<br>
        Car: Honda Amaze(HR 03 A 8877)<br>
        Ratings: <img src="4 stars.jpg" style="width:30%;height:20%"></b></p>
        <a href="bc.html"><button type="submit" class="btn">Book</button></a>         
  </div>
   
</div> 
    </body>
</html>
