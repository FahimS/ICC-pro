import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fahim S
 */
public class odibatsman extends javax.swing.JFrame {
     Connection conn =  null; 
     ResultSet rs=null;
     PreparedStatement ps=null;
    
    /**
     * Creates new form odibatsman
     */
    public odibatsman() {
        initComponents();
        conn = Connect.ConnectDB();
         Table();
              
    }
    private void Table()
    {
         try{
          
          String s= "select * from odibatsman ";
          ps=conn.prepareStatement(s);
         rs = ps.executeQuery();
          odibatsmantab.setModel(DbUtils.resultSetToTableModel(rs));
          
      }catch(Exception e){
          
          System.out.println(e);
    } 
         finally{
         try{
         rs.close();
         ps.close();
         }
         catch(Exception e){}
         }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rt1 = new javax.swing.JTextField();
        rk1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        deletebox = new javax.swing.JTextField();
        updatebox = new javax.swing.JTextField();
        searchbox = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        name1 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        odibatsmantab = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 580));
        setPreferredSize(new java.awt.Dimension(960, 580));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 130, 80, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Country");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 130, 80, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Rating");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 130, 70, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Rank");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 130, 60, 22);

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A SAVE.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 180, 110, 40);

        rt1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(rt1);
        rt1.setBounds(350, 180, 120, 30);

        rk1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(rk1);
        rk1.setBounds(500, 180, 120, 30);

        jButton2.setBackground(new java.awt.Color(0, 255, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A DELETE.png")); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 250, 110, 40);

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A UPDATE.png")); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(680, 370, 110, 40);

        jButton4.setBackground(new java.awt.Color(0, 255, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A SEARCH.png")); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(680, 310, 110, 40);

        deletebox.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(deletebox);
        deletebox.setBounds(830, 250, 80, 40);

        updatebox.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(updatebox);
        updatebox.setBounds(830, 370, 80, 40);

        searchbox.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(searchbox);
        searchbox.setBounds(830, 310, 80, 40);

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A BACK.png")); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(830, 490, 100, 40);

        name1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(name1);
        name1.setBounds(50, 180, 120, 30);

        c1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(c1);
        c1.setBounds(200, 180, 120, 30);

        odibatsmantab.setBackground(new java.awt.Color(204, 255, 204));
        odibatsmantab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Country", "Rating", "Rank"
            }
        ));
        jScrollPane1.setViewportView(odibatsmantab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 610, 245);

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A CLEAN.png")); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(830, 30, 90, 40);

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setText("ODI BATSMAN RANKING");
        getContentPane().add(jButton7);
        jButton7.setBounds(140, 20, 390, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\Glenn-Maxwell-Australia-Cricket-Team-Wallpaper.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 960, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String a= name1.getText();
      String b= c1.getText();
      String c= rt1.getText();
      String d = rk1.getText();
      
      //add
      try{
          
          s="Insert into odibatsman values('"+a+"','"+b+"','"+c+"','"+d+"')";
          ps=conn.prepareStatement(s);
          ps.execute();
          JOptionPane.showMessageDialog(this, "Saved");
          
      }catch(Exception e){
       //  JOptionPane.showMessageDialog(this, "not Saved");
          System.out.println(e);
      }
      finally{
         try{
         rs.close();
         ps.close();
         }
         catch(Exception e){}
         }
      
     Table();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = Connect.ConnectDB();
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
          
           ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String a= name1.getText();
      String b= c1.getText();
      String c= rt1.getText();
      String d= rk1.getText();
      
      String u = updatebox.getText();
          s="update odibatsman set Name='"+a+"',Country='"+b+"',Rating='"+c+"',Rank='"+d+"'  where Rank='"+u+"'";
          ps=conn.prepareStatement(s);
          ps.executeUpdate();
          //conn.commit();
          
      }catch(Exception e){
          System.out.println("Not");
      }
        finally{
         try{
         rs.close();
         ps.close();
         }
         catch(Exception e){}
         }
      
    
        Table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String a= name1.getText();
      String b= c1.getText();
      String c= rt1.getText();
      String d = rk1.getText();
      String r= deletebox.getText();
               try{
          
          s="Delete from odibatsman where rank='"+r+"'";
          ps=conn.prepareStatement(s);
          ps.execute();
          
      }catch(Exception e){
          System.out.println("Not");
            // TODO add your handling code here:
      }
               finally{
         try{
         rs.close();
         ps.close();
         }
         catch(Exception e){}
         }
      
     Table();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       odi f= new odi();
       f.setVisible(true);
       this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String n= searchbox.getText();
     String i= searchbox.getText();
      
      s="select Rank from odibatsman";
      int flag=0;
      try{
          
          ps=conn.prepareStatement(s);
          rs=ps.executeQuery();
          while(rs.next()){
              //System.out.println(rs.getString("Name")+ " "+rs.getString("Id") );
              //System.out.println(rs.getString("Id"));
          if(i.equals(rs.getString("Rank"))){
              //JOptionPane.showMessageDialog(this, "Found");
              flag=1;
              break;
          }
          }
          if(flag==1)JOptionPane.showMessageDialog(this, "Found");
          else {
              JOptionPane.showMessageDialog(this, "Not Found");
          }
          }
          
          
      catch(Exception e){
          
      }
    finally{
         try{
         rs.close();
         ps.close();
         }
         catch(Exception e){}
         }
      
    
        Table();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        odibatsman f= new odibatsman();
       f.setVisible(true);
       this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(odibatsman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(odibatsman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(odibatsman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(odibatsman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new odibatsman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c1;
    private javax.swing.JTextField deletebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name1;
    private javax.swing.JTable odibatsmantab;
    private javax.swing.JTextField rk1;
    private javax.swing.JTextField rt1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTextField updatebox;
    // End of variables declaration//GEN-END:variables
}
