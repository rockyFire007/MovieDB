/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author nishu
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchbar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        search = new rojerusan.RSMaterialButtonRectangle();
        reset = new rojerusan.RSMaterialButtonRectangle();
        poster = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        dropdown = new javax.swing.JComboBox<>();
        genre = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        director = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cast = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        runtime = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        season = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        back1 = new rojerusan.RSMaterialButtonRectangle();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 580));
        getContentPane().setLayout(null);

        searchbar.setEditable(false);
        searchbar.setText("Search for Movies...");
        searchbar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        searchbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbarMouseClicked(evt);
            }
        });
        searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarActionPerformed(evt);
            }
        });
        getContentPane().add(searchbar);
        searchbar.setBounds(230, 120, 510, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/LOGO2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 150, 150);

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(740, 120, 100, 40);

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(690, 480, 130, 40);

        poster.setBackground(new java.awt.Color(0, 0, 0));
        poster.setOpaque(true);
        getContentPane().add(poster);
        poster.setBounds(40, 220, 200, 250);

        title.setEditable(false);
        title.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        getContentPane().add(title);
        title.setBounds(260, 220, 480, 50);

        dropdown.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movies", "TV Series" }));
        dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownActionPerformed(evt);
            }
        });
        getContentPane().add(dropdown);
        dropdown.setBounds(396, 40, 110, 21);

        genre.setEditable(false);
        genre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(genre);
        genre.setBounds(360, 280, 190, 30);

        rate.setEditable(false);
        rate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(rate);
        rate.setBounds(610, 280, 130, 30);

        director.setEditable(false);
        director.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(director);
        director.setBounds(360, 330, 380, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Director :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 340, 90, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Genre :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 290, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cast:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 380, 60, 20);

        cast.setEditable(false);
        cast.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(cast);
        cast.setBounds(280, 410, 460, 30);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        runtime.setEditable(false);
        runtime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(runtime);
        runtime.setBounds(0, 180, 160, 30);

        year.setEditable(false);
        year.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(year);
        year.setBounds(0, 50, 160, 30);

        season.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        season.setForeground(new java.awt.Color(255, 255, 255));
        season.setText("Runtime :");
        season.setToolTipText("");
        jPanel1.add(season);
        season.setBounds(0, 160, 70, 14);

        status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Year :");
        jPanel1.add(status);
        status.setBounds(0, 30, 60, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(780, 230, 160, 210);

        back1.setText("BACK");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        getContentPane().add(back1);
        back1.setBounds(820, 480, 130, 40);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 190, 10, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/IMG1.1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 960, 540);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 200, 960, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        title.setText("");
        genre.setText("");
        rate.setText("");
        year.setText("");
        cast.setText("");
        runtime.setText("");
        director.setText("");
        poster.setIcon(null);        
    }//GEN-LAST:event_resetActionPerformed

    private void searchbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbarMouseClicked
        // TODO add your handling code here:
        searchbar.setText("");
        searchbar.setEditable(true);
    }//GEN-LAST:event_searchbarMouseClicked

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownActionPerformed
        // TODO add your handling code here:
        String s= dropdown.getSelectedItem().toString();
        if("Movies".equals(s)){
            searchbar.setText("Search for Movies...");
            status.setText("Year :");
            season.setText("Runtime :");    
        }
        if("TV Series".equals(s)){
            searchbar.setText("Search for TV Series...");
            season.setText("Seasons :");
            status.setText("Status :");
        }         
    }//GEN-LAST:event_dropdownActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","aaaaa");          
            java.sql.Statement stmt=con.createStatement();
            String r= searchbar.getText();
            String s= dropdown.getSelectedItem().toString();
            if("Movies".equals(s))
            {                    
            ResultSet rs= stmt.executeQuery("SELECT * FROM movies where TITLE='"+r+"'");
            while(rs.next())
            {
               title.setText(""+rs.getString(2));               
               byte[] img = rs.getBytes("IMAGES");
               year.setText(""+rs.getString(4));
               runtime.setText(""+rs.getString(5));
               director.setText(""+rs.getString(6));
               cast.setText(""+rs.getString(7));
               genre.setText(""+rs.getString(8));
               rate.setText(""+rs.getString(9));                                 
               ImageIcon image = new ImageIcon(img);
               Image im = image.getImage();
               Image myImg = im.getScaledInstance(poster.getWidth(), poster.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newImage = new ImageIcon(myImg);
               poster.setIcon(newImage);
            }
            } 
            else if("TV Series".equals(s))
            {
            ResultSet rm= stmt.executeQuery("SELECT * FROM tv_series where TITLE='"+r+"'");
            while(rm.next())
            {
               title.setText(""+rm.getString(2));
               byte[] img = rm.getBytes("IMAGES");      
               runtime.setText(""+rm.getString(4));
               cast.setText(""+rm.getString(5));
               director.setText(""+rm.getString(6));
               genre.setText(""+rm.getString(7));
               rate.setText(""+rm.getString(8));
               year.setText(""+rm.getString(9));
                                 
               ImageIcon image = new ImageIcon(img);
               Image im = image.getImage();
               Image myImg = im.getScaledInstance(poster.getWidth(), poster.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newImage = new ImageIcon(myImg);
               poster.setIcon(newImage);
            }
            }                
            }            
            catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_searchActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        dashboard d= new dashboard();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbarActionPerformed

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new search().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle back1;
    private javax.swing.JTextField cast;
    private javax.swing.JTextField director;
    private javax.swing.JComboBox<String> dropdown;
    private javax.swing.JTextField genre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel poster;
    private javax.swing.JTextField rate;
    private rojerusan.RSMaterialButtonRectangle reset;
    private javax.swing.JTextField runtime;
    private rojerusan.RSMaterialButtonRectangle search;
    private javax.swing.JTextField searchbar;
    private javax.swing.JLabel season;
    private javax.swing.JLabel status;
    private javax.swing.JTextField title;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}