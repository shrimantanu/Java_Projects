/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mainpr;
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
JOptionPane.showMessageDialog(null, e.getMessage());
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
}
