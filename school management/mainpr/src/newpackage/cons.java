/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;
import java.io.File;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author USER2
 */
public class cons {
   static ResultSet rs1;
    static void start(String q){
        try{
         Class.forName("java.sql.DriverManager");
    Connection cr=(Connection)
    DriverManager.getConnection("jdbc:mySQL://localhost:3306/redfins","root","meteor");
    Statement s=cr.createStatement();
    String k=q;
    s.executeUpdate(k);
  
    }
        catch (Exception e)
        {
            if (e.getMessage().contains("Cannot add or update a child row: a foreign key constraint fails"))
            {
                JOptionPane.showMessageDialog(null,"Teacher does not Exist \n"+"Please renter Appropriate Teacher's ID");
            }
System.out.println(e.getMessage());
        }
    }

     static ResultSet startq(String q){

        try{
         Class.forName("java.sql.DriverManager");
    Connection ct=(Connection)
    DriverManager.getConnection("jdbc:mySQL://localhost:3306/redfins","root","meteor");
    Statement s=ct.createStatement();
    String k=q;
    ResultSet rs;
    rs1= s.executeQuery(k);


    }
        catch (Exception e)
        {
JOptionPane.showMessageDialog(null, e.getMessage());
        }
         return rs1;
    }

    static void can() {
        System.exit(0);
    }
    static void checkint(String fg)
    {
       if (fg.equals("")^true)
       {
        try
        {
        double as=Double.parseDouble(fg);
        }
        catch (Exception e)
        {
           
         JOptionPane.showMessageDialog(null,"Please write only Numerical values.","Invalid Entry", 2);
       
        }
       }}
       static void checklength(String fg,int g)
    {
       if (fg.equals("")^true)
       if (fg.length()>g)
       {
        JOptionPane.showMessageDialog(null,"Value Entered is exceeding the Limit.","Invalid Entry", 2);
       }}
        static void checkvalue(String fg,double g)
    {
       if (fg.equals("")^true)
       if (Double.parseDouble(fg)<=g^true)
       {
        JOptionPane.showMessageDialog(null,"Value Entered is exceeding the Limit.","Invalid Entry", 2);
       }
   
    }
}
