package mainpr;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * change.java
 *
 * Created on Aug 16, 2013, 9:57:00 AM
 */

/**
 *
 * @author USER1
 */
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class change1 extends javax.swing.JFrame {

    /** Creates new form change */
    public change1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t4 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t5 = new javax.swing.JPasswordField();
        p1 = new javax.swing.JProgressBar();
        f1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHANGE CURRENT USERNAME AND PASSWORD");
        jLabel5.setBounds(20, 20, 370, 25);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("OLD USER");
        jLabel3.setBounds(10, 90, 100, 19);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t1.setBounds(220, 90, 128, 20);
        jLayeredPane1.add(t1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("OLD PASSWORD");
        jLabel4.setBounds(10, 120, 130, 19);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("NEW USER");
        jLabel1.setBounds(10, 160, 100, 19);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t3.setBounds(220, 160, 128, 20);
        jLayeredPane1.add(t3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("CONFIRM PASSWORD");
        jLabel2.setBounds(10, 220, 160, 19);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        t4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t4CaretUpdate(evt);
            }
        });
        t4.setBounds(220, 190, 128, 20);
        jLayeredPane1.add(t4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setBackground(new java.awt.Color(145, 152, 251));
        jButton1.setText("CHANGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(40, 260, 90, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setBackground(new java.awt.Color(145, 152, 251));
        jButton2.setText("BACK to SETTINGS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(170, 260, 140, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        t2.setBounds(220, 120, 130, 20);
        jLayeredPane1.add(t2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpr/change.jpg"))); // NOI18N
        jLabel6.setBounds(0, 0, 480, 300);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("NEW PASSWORD");
        jLabel7.setBounds(30, 190, 140, 19);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("NEW PASSWORD");
        jLabel8.setBounds(10, 190, 140, 19);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.PALETTE_LAYER);
        t5.setBounds(220, 220, 128, 20);
        jLayeredPane1.add(t5, javax.swing.JLayeredPane.PALETTE_LAYER);
        p1.setBounds(360, 220, 110, 14);
        jLayeredPane1.add(p1, javax.swing.JLayeredPane.MODAL_LAYER);

        f1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        f1.setBounds(360, 190, 110, 20);
        jLayeredPane1.add(f1, javax.swing.JLayeredPane.MODAL_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String q=t3.getText();
String w=t4.getText();
String a=t1.getText();
String b=t2.getText();
String R=t5.getText();
if(R.equals(w))
{
try {
            Class.forName("java.sql.DriverManager");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mySQL://localhost:3306/redfins", "root", "rrmps");
            Statement s = (Statement) c.createStatement();
            String k = "select ename,epass from login;";
           // JOptionPane.showMessageDialog(null, k);
            ResultSet rs = s.executeQuery(k);
rs.first();
String ab=rs.getString("ename");
String cd=rs.getString("epass");
if(a.equals(ab)&&b.equals(cd))
{
     try {
            Class.forName("java.sql.DriverManager");
            Connection d = (Connection) DriverManager.getConnection("jdbc:mySQL://localhost:3306/redfins", "root", "rrmps");
            Statement st = (Statement) d.createStatement();
            String ks = "update login set ename='"+q+"',epass='"+w+"' ; ";
  s.executeUpdate(ks);
        JOptionPane.showMessageDialog(null, ks);
        }
        catch(Exception e)
  {
JOptionPane.showMessageDialog(null, e.getMessage());
        }
}
else
{
     JOptionPane.showMessageDialog(null,"please enter valid user and password","Security Warning",2);
}
        }


            catch (Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage());
                //JOptionPane.showMessageDialog(this,e.getMessage());
            }

        }
 else{
 JOptionPane.showMessageDialog(null,"RENTER PASSWORD");
 }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
 new sett().setVisible(true);
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   
    }//GEN-LAST:event_formWindowActivated

private void t4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t4CaretUpdate
String s=t4.getText();
if(s.length()<=4)
{
    f1.setForeground(Color.red);
    f1.setText("Bad");
    p1.setValue((s.length()*10));
}
else if(s.length()<=6)
{
    f1.setForeground(Color.GREEN);
    f1.setText("Average");
    p1.setValue((s.length()*10));
}
else if(s.length()<=8)
{
    f1.setForeground(Color.blue);
    f1.setText("Good");
    p1.setValue((s.length()*10));
}
else if(s.length()<=10)
{
    f1.setForeground(Color.magenta);
    f1.setText("Very Good");
    p1.setValue((s.length()*10));
}
}//GEN-LAST:event_t4CaretUpdate

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel f1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JProgressBar p1;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JPasswordField t4;
    private javax.swing.JPasswordField t5;
    // End of variables declaration//GEN-END:variables

}