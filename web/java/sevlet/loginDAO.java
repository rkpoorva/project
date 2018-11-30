package sevlet;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author !$#aAn pA$r!Ja
 */
public class loginDAO 
{
    
    public String checkInfo(String userName,String pssW) throws ClassNotFoundException, SQLException
    {
        java.sql.Connection con=null;
        java.sql.PreparedStatement pr=null;
        String myUrl="jdbc:mysql://localhost/juno";
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(myUrl,"root","");
        String q="select * from signup where Full Name=? and password=?";
        pr=con.prepareStatement(q);
        pr.setString(1,userName);
        pr.setString(2,pssW);
        ResultSet rs;
        rs=pr.executeQuery();
        if(rs.next())
        {
            return "you are logged in";
        }
        return "incorrect data";

    }

    public String addData(String uname,String email,String passW,String cp) throws ClassNotFoundException, SQLException
    {
        java.sql.Connection con=null;
        java.sql.PreparedStatement pr=null;
        String myUrl="jdbc:mysql://localhost/juno";
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(myUrl,"root","");
        String query="insert into signup values(?,?,?,?)";
        pr=con.prepareStatement(query);
        pr.setString(1,uname);
        pr.setString(2,email);
        pr.setString(3,passW);
        pr.setString(4,cp);
        int rs = pr.executeUpdate();
        if(rs>0)
        {
            return "data inserted successfully";
        }
        return "data not inserted";
        

    }
    
    public String add(String pickup,String dropin,String w) throws ClassNotFoundException, SQLException 
    {
        java.sql.Connection con=null;
        java.sql.PreparedStatement pr=null;
        String myUrl="jdbc:mysql://localhost/juno";
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(myUrl,"root","");
        String query="insert into book(pickup,dropin,w) values(?,?,?)";
        pr=con.prepareStatement(query);
        pr.setString(1,pickup);
        pr.setString(2,dropin);
        pr.setString(3,w);
        int rs = pr.executeUpdate();
        if(rs>0)
        {
            return "booked";
        }
        return "not found";
    }
    
     public String add1(String email,String pass,String cp ) throws ClassNotFoundException, SQLException 
    {
        java.sql.Connection con=null;
        java.sql.PreparedStatement pr=null;
        String myUrl="jdbc:mysql://localhost/juno";
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(myUrl,"root","");
        String query="insert into book(pickup,dropin,w) values(?,?,?)";
        pr=con.prepareStatement(query);
        pr.setString(1,email);
        pr.setString(2,pass);
        pr.setString(3,cp);
        int rs = pr.executeUpdate();
        if(rs>0)
        {
            return "booked";
        }
        return "not found";
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException

    {
        loginDAO l = new loginDAO();
        String result = l.addData("msASDFA", "manish@32", "asdfasdf", "abc");
        System.out.println(result);
       
        
    }


}
