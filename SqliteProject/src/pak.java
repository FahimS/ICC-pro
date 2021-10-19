import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fahim S
 */
public class pak extends javax.swing.JFrame {
    Connection conn =  null;
    ResultSet rs=null;
     PreparedStatement ps=null;
    /**
     * Creates new form pak
     */
    public pak() {
        initComponents();
        conn = Connect.ConnectDB();
         Table();
    }
    private void Table()
    {
         try{
          
          String s= "select * from pakistan ";
          ps=conn.prepareStatement(s);
         rs = ps.executeQuery();
          paktable.setModel(DbUtils.resultSetToTableModel(rs));
          
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paktable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        deletebox = new javax.swing.JTextField();
        updatebox = new javax.swing.JTextField();
        searchbox = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        rt1 = new javax.swing.JTextField();
        rk1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 580));
        setPreferredSize(new java.awt.Dimension(960, 580));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("PAKISTHAN PLAYER LIST");
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 20, 350, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A BACK.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(820, 470, 90, 40);

        paktable.setBackground(new java.awt.Color(204, 255, 204));
        paktable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(paktable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 280, 540, 230);

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A DELETE.png")); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(623, 230, 120, 40);

        jButton4.setBackground(new java.awt.Color(0, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A UPDATE.png")); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(623, 300, 120, 40);

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A SEARCH.png")); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(623, 360, 120, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A CLEAN.png")); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(820, 30, 90, 40);

        jButton7.setBackground(new java.awt.Color(0, 255, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\A SAVE.png")); // NOI18N
        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(623, 170, 120, 40);

        deletebox.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(deletebox);
        deletebox.setBounds(770, 230, 120, 40);

        updatebox.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(updatebox);
        updatebox.setBounds(770, 300, 120, 40);

        searchbox.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(searchbox);
        searchbox.setBounds(770, 360, 120, 40);

        c1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(c1);
        c1.setBounds(180, 190, 110, 30);

        rt1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(rt1);
        rt1.setBounds(310, 190, 110, 30);

        rk1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(rk1);
        rk1.setBounds(440, 190, 120, 30);

        name1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(name1);
        name1.setBounds(40, 190, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 140, 80, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Country");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 140, 80, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rating");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 140, 80, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rank");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 140, 90, 22);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim S\\Desktop\\JAVA\\ICC Pro\\205031.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-160, 0, 1110, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       conn = Connect.ConnectDB(); // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       board_list f= new board_list();
       f.setVisible(true);
       this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String a= name1.getText();
      String b= c1.getText();
      String c= rt1.getText();
      String d = rk1.getText();
      
      //add
      try{
          
          s="Insert into pakistan values('"+a+"','"+b+"','"+c+"','"+d+"')";
          ps=conn.prepareStatement(s);
          ps.execute();
          JOptionPane.showMessageDialog(this, "Saved");
          
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
      
     Table();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String a= name1.getText();
      String b= c1.getText();
      String c= rt1.getText();
      String d = rk1.getText();
      String r= deletebox.getText();
               try{
          
          s="Delete from pakistan where rank='"+r+"'";
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
      
    
        Table(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
          
           ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String a= name1.getText();
      String b= c1.getText();
      String c= rt1.getText();
      String d= rk1.getText();
      
      String u = updatebox.getText();
          s="update pakistan set Name='"+a+"',Country='"+b+"',Rating='"+c+"',Rank='"+d+"'  where Rank='"+u+"'";
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
      
    
        Table(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String n= searchbox.getText();
     String i= searchbox.getText();
      
      s="select Rank from pakistan";
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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       pak f= new pak();
       f.setVisible(true);
       this.setVisible(false); // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(pak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pak().setVisible(true);
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
    private javax.swing.JTable paktable;
    private javax.swing.JTextField rk1;
    private javax.swing.JTextField rt1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTextField updatebox;
    // End of variables declaration//GEN-END:variables
}
