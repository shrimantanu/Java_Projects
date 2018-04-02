package newpackage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * salary.java
 *
 * Created on Aug 31, 2013, 10:19:55 AM
 */
/**
 *
 * @author USER1
 */
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.ImageIcon;

public class salary extends javax.swing.JFrame {

    double pf;
    static int a7, ag;
    static String a12, a11;

    /** Creates new form salary */
    public salary() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel14 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        t14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();

        jButton8.setText("jButton8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22));
        jLabel14.setForeground(new java.awt.Color(51, 102, 0));
        jLabel14.setText("SALARY FORM");
        jLabel14.setBounds(110, 10, 220, 40);
        jLayeredPane1.add(jLabel14, javax.swing.JLayeredPane.PALETTE_LAYER);

        b1.setText("Add");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.setBounds(490, 90, 90, 30);
        jLayeredPane1.add(b1, javax.swing.JLayeredPane.PALETTE_LAYER);

        b2.setText("update");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        b2.setBounds(490, 130, 90, 30);
        jLayeredPane1.add(b2, javax.swing.JLayeredPane.PALETTE_LAYER);

        b3.setText("SHOW");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        b3.setBounds(490, 170, 90, 30);
        jLayeredPane1.add(b3, javax.swing.JLayeredPane.PALETTE_LAYER);

        b4.setText("DELETE");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.setBounds(490, 210, 90, 30);
        jLayeredPane1.add(b4, javax.swing.JLayeredPane.PALETTE_LAYER);

        b5.setText("TOTAL");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        b5.setBounds(490, 250, 90, 30);
        jLayeredPane1.add(b5, javax.swing.JLayeredPane.PALETTE_LAYER);

        b6.setText("Clear All");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        b6.setBounds(490, 300, 90, 30);
        jLayeredPane1.add(b6, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("TEACHER ID");
        jLabel4.setBounds(10, 100, 70, 15);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.PALETTE_LAYER);

        t1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t1CaretUpdate(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.setBounds(250, 100, 160, 20);
        jLayeredPane1.add(t1, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Basic Sallary");
        jLabel1.setBounds(10, 130, 69, 15);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.PALETTE_LAYER);

        t2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t2CaretUpdate(evt);
            }
        });
        t2.setBounds(250, 130, 160, 20);
        jLayeredPane1.add(t2, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("DEARLY ALLOWANCE");
        jLabel6.setBounds(10, 170, 125, 15);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.PALETTE_LAYER);

        t.setEditable(false);
        t.setBounds(250, 160, 160, 20);
        jLayeredPane1.add(t, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel7.setForeground(new java.awt.Color(51, 102, 0));
        jLabel7.setText("HOUSE RENT ALLOWENCE");
        jLabel7.setBounds(10, 210, 154, 15);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.PALETTE_LAYER);

        t6.setEditable(false);
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        t6.setBounds(250, 200, 160, 20);
        jLayeredPane1.add(t6, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel9.setForeground(new java.awt.Color(51, 102, 0));
        jLabel9.setText("LIC");
        jLabel9.setBounds(10, 240, 18, 15);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.PALETTE_LAYER);

        t8.setEditable(false);
        t8.setBounds(250, 240, 160, 20);
        jLayeredPane1.add(t8, javax.swing.JLayeredPane.PALETTE_LAYER);

        t9.setEditable(false);
        t9.setBounds(250, 270, 160, 20);
        jLayeredPane1.add(t9, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("PROVIDENT FUND");
        jLabel5.setBounds(10, 270, 106, 15);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel10.setForeground(new java.awt.Color(51, 102, 0));
        jLabel10.setText("LEAVE TRAVEL ALLOWANCE");
        jLabel10.setBounds(10, 310, 165, 15);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.PALETTE_LAYER);

        t3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t3CaretUpdate(evt);
            }
        });
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.setBounds(250, 310, 160, 20);
        jLayeredPane1.add(t3, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18));
        jLabel11.setForeground(new java.awt.Color(102, 153, 0));
        jLabel11.setText("%");
        jLabel11.setBounds(420, 380, 30, 20);
        jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.PALETTE_LAYER);

        t4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t4CaretUpdate(evt);
            }
        });
        t4.setBounds(250, 350, 160, 20);
        jLayeredPane1.add(t4, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel12.setForeground(new java.awt.Color(51, 102, 0));
        jLabel12.setText("CONVEYANCE ALLOWANCE");
        jLabel12.setBounds(10, 380, 164, 15);
        jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.PALETTE_LAYER);

        t5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t5CaretUpdate(evt);
            }
        });
        t5.setBounds(250, 380, 160, 20);
        jLayeredPane1.add(t5, javax.swing.JLayeredPane.PALETTE_LAYER);

        t13.setEditable(false);
        t13.setBounds(250, 420, 160, 20);
        jLayeredPane1.add(t13, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13));
        jLabel13.setForeground(new java.awt.Color(51, 102, 0));
        jLabel13.setText("Account number");
        jLabel13.setBounds(10, 450, 108, 18);
        jLayeredPane1.add(jLabel13, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Software\\School\\project\\IMAGG\\six figure salary negotiations.jpg")); // NOI18N
        jLabel2.setBounds(0, 0, 590, 540);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel8.setBounds(480, 10, 80, 0);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Software\\School\\project\\IMAGG\\BACK.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.setBounds(470, 400, 110, 100);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.PALETTE_LAYER);

        b7.setText("Paid by Cash");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        b7.setBounds(30, 490, 110, 30);
        jLayeredPane1.add(b7, javax.swing.JLayeredPane.MODAL_LAYER);

        b8.setText("Delayed");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        b8.setBounds(190, 490, 110, 30);
        jLayeredPane1.add(b8, javax.swing.JLayeredPane.MODAL_LAYER);

        b9.setText("Pay Online");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        b9.setBounds(330, 490, 110, 30);
        jLayeredPane1.add(b9, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13));
        jLabel15.setForeground(new java.awt.Color(51, 102, 0));
        jLabel15.setText("NET PAYABLE SALARY");
        jLabel15.setBounds(10, 420, 149, 18);
        jLayeredPane1.add(jLabel15, javax.swing.JLayeredPane.PALETTE_LAYER);
        t14.setBounds(250, 450, 160, 20);
        jLayeredPane1.add(t14, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11));
        jLabel16.setForeground(new java.awt.Color(51, 102, 0));
        jLabel16.setText("MEDICAL ALLOWANCE");
        jLabel16.setBounds(10, 350, 133, 15);
        jLayeredPane1.add(jLabel16, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18));
        jLabel17.setForeground(new java.awt.Color(102, 153, 0));
        jLabel17.setText("%");
        jLabel17.setBounds(420, 350, 30, 20);
        jLayeredPane1.add(jLabel17, javax.swing.JLayeredPane.MODAL_LAYER);

        c2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));
        c2.setForeground(new java.awt.Color(102, 153, 0));
        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        c2.setBounds(490, 350, 60, 23);
        jLayeredPane1.add(c2, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpr/tyu.PNG"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jLabel18.setBounds(490, 10, 80, 72);
        jLayeredPane1.add(jLabel18, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ag = new options().jk;
        if (ag == 32) {
            ag = new FourWay().jk;
        }
        if (ag == 1) {
            b1.setVisible(false);
            b2.setVisible(false);
            b5.setVisible(false);
            c2.setVisible(false);
        }

        if (ag == 2) {
            b1.setVisible(false);
            b4.setVisible(false);

        }
        if (ag == 0) {
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            c2.setVisible(false);
            int as = new FourWay().jk;
            int ad = 0, af = 0;
            String ab = "1020555";
            if (as == 0) {
                b1.setVisible(true);
                b6.setVisible(true);
                while (ad <= 5) {
                    af = (int) Math.round(Math.random() * 10);
                    ab = ab + af;
                    ad++;
                }

                t14.setText(ab);
            }

        }


        ResultSet rs = cons.startq("select * from deduct;");

        try {
            rs.next();
            t6.setText(rs.getString("hra"));
            t8.setText(rs.getString("insurance"));
            t.setText(rs.getString("da"));
            t9.setText(rs.getString("pf"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        double n1 = Double.parseDouble(t1.getText());
        double n2 = Double.parseDouble(t2.getText());
        double n3 = Double.parseDouble(t3.getText());
        double n4 = Double.parseDouble(t4.getText());
        double n5 = Double.parseDouble(t5.getText());
        double n14 = Double.parseDouble(t14.getText());
        cons.start("insert into salary values(" + n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5 + ");");
        cons.start("insert into bankac values(" + n1 + "," + n14 + ");");
}//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        double n1 = Double.parseDouble(t1.getText());
        double n2 = Double.parseDouble(t2.getText());
        double n3 = Double.parseDouble(t3.getText());
        double n4 = Double.parseDouble(t4.getText());
        double n5 = Double.parseDouble(t5.getText());
        ResultSet rs = cons.startq("Select * from td;");
        try {
            while (rs.next()) {
                if (n1 == rs.getInt("tid")) {
                    cons.start("delete from salary where tid=" + n1 + ";");
                    cons.start("insert into salary values(" + n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5 + ");");
                }


            }
        } catch (Exception e) {
            System.out.print(e);
        }
}//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        double n1 = Double.parseDouble(t1.getText());
        ResultSet ss = cons.startq("select * from salary where tid=" + n1 + ";");
        ResultSet ss1 = cons.startq("select * from bankac where tid=" + n1 + ";");
        try {
            ss1.next();
            t14.setText(ss1.getString("ac"));
            while (ss.next()) {


                String a2 = ss.getString("bsal");

                String a3 = ss.getString("lta");
                String a4 = ss.getString("ma");
                String a5 = ss.getString("ca");


                t2.setText(a2);
                t3.setText(a3);
                t4.setText(a4);
                t5.setText(a5);

            }
            // TODO add your handling code here:
            // TODO add your handling code here:
        } catch (Exception e) {
            System.out.print(e);
        }
}//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        int a = Integer.parseInt(t1.getText());

        cons.start("delete from salary where tid=" + a + ");");

    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed


        double n2 = Double.parseDouble(t2.getText());
        double n3 = Double.parseDouble(t3.getText());
        double n4 = Double.parseDouble(t4.getText());
        double n5 = Double.parseDouble(t5.getText());
        double n6 = Double.parseDouble(t6.getText());
        double n8 = Double.parseDouble(t8.getText());
        double n9 = Double.parseDouble(t9.getText());
        double n = Double.parseDouble(t.getText());
        int as = c2.getSelectedIndex() + 1;
        double a = 0;
        double b = 0;
        double lic = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        double g = 0;
        double h = 0;
        double i = 0;

        a = n2 + (n2 * n) / 100;
        pf = (a * n9) / 100;
        a = a + n6;
        a = a - (n2 * n8) / 100;
        a = a - pf;
        a = a + a * (n3 / 100) + a * (n4 / 100) + a * (n5 / 100);
        ResultSet rs = cons.startq("select Sum(dto_mm_dd_yy-dfrom_mm_dd_yy+1) from leve where tid=" + t1.getText() + " And Month(dto_mm_dd_yy)=" + as + ";");
        ResultSet rs0 = cons.startq("select count(*) from leve where tid=" + t1.getText() + " AND  Month(dto_mm_dd_yy)=" + as + " AND hfday='half day';");
        ResultSet rs1 = cons.startq("select * from cl;");

        double d1 = 0, d2 = 0;
        double a1 = 0;



        try {
            rs1.next();
            rs0.next();
            double sd = rs0.getInt("count(*)") / 2;
            while (rs.next()) {


                d2 = rs.getInt("dto_mm_dd_yy-dfrom_mm_dd_yy");


                System.out.print(d2);
            }
            d1 = rs1.getInt("cl");
            d2 = d2 + sd;
        } catch (Exception en) {
            System.out.println(en);
        }

        if (d1 < d2) {
            a1 = d2 - d1;
        }
        a = a - ((n2 / 30) * a1);
        t13.setText(a + "");
}//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        t1.setText("");

        t3.setText("");

        t.setText("");
        t6.setText("");

        t8.setText("");
        t9.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        // TODO add your handling code here:
}//GEN-LAST:event_b6ActionPerformed

    private void t1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t1CaretUpdate
    }//GEN-LAST:event_t1CaretUpdate

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t1ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t6ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (ag == 0) {
            new mainframe().setVisible(true);
            this.dispose();
        } else {
            new options().setVisible(true);
            this.dispose();
        }
}//GEN-LAST:event_jLabel3MouseClicked

private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
    try {
        ResultSet rs = cons.startq("select month(curdate());");
        rs.next();
        ResultSet rs1 = cons.startq("select year(curdate());");
        rs1.next();
        a12 = rs.getString("month(curdate())");
        a11 = rs.getString("year(curdate())");
        cons.start("insert into saldet values(" + t1.getText() + ",'" + t13.getText() + "','" + rs.getString("month(curdate())") + "','" + rs1.getString("year(curdate())") + "','PAID');");
        cons.start("insert into pf1 values(" + t1.getText() + "," + pf + ");");

    } catch (Exception e) {
        System.out.println(e);
    }
}//GEN-LAST:event_b7ActionPerformed

private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
    try {
        ResultSet rs = cons.startq("select month(curdate());");
        rs.next();
        ResultSet rs1 = cons.startq("select year(curdate());");
        rs1.next();
        cons.start("insert into saldet values(" + t1.getText() + ",'" + t13.getText() + "','" + rs.getString("month(curdate())") + "','" + rs1.getString("year(curdate())") + "','DELAYED');");


    } catch (Exception e) {
        System.out.println(e);
    }
}//GEN-LAST:event_b8ActionPerformed

private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
    try {
        ResultSet rs = cons.startq("select month(curdate());");
        rs.next();
        ResultSet rs1 = cons.startq("select year(curdate());");
        rs1.next();
        a12 = rs.getString("month(curdate())");
        a11 = rs1.getString("year(curdate())");
        cons.start("insert into saldet values(" + t1.getText() + ",'" + t13.getText() + "','" + rs.getString("month(curdate())") + "','" + rs1.getString("year(curdate())") + "','DELAYED');");
        cons.start("insert into pf1 values(" + t1.getText() + "," + pf + ");");

    } catch (Exception e) {
        System.out.println(e);
    }

    a7 = Integer.parseInt(t1.getText());
    new Pay().setVisible(true);
}//GEN-LAST:event_b9ActionPerformed

private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
    new ssi().setVisible(true);
    this.dispose();
}//GEN-LAST:event_jLabel18MouseClicked

private void t2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t2CaretUpdate
    cons.checkint(t2.getText());
}//GEN-LAST:event_t2CaretUpdate

private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_t3ActionPerformed

private void t3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t3CaretUpdate
    cons.checkint(t3.getText());
    cons.checklength(t3.getText(), 3);
}//GEN-LAST:event_t3CaretUpdate

private void t4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t4CaretUpdate
    cons.checkint(t4.getText());
    cons.checklength(t4.getText(), 3);
}//GEN-LAST:event_t4CaretUpdate

private void t5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t5CaretUpdate
    cons.checkint(t5.getText());
    cons.checklength(t5.getText(), 3);
}//GEN-LAST:event_t5CaretUpdate

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new salary().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JComboBox c2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField t;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("icon.gif"));
    }
    // private void setIconImage() {
    //throw new UnsupportedOperationException("Not yet implemented");
}
