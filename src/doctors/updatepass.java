/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors;

import ADDFORMSINTERNALPAGE.userinfo;
import static clinicapptts.Registration.passwordhashing;
import config.Session;
import config.dbConnector;
import javax.swing.JOptionPane;

/**
 *
 * @author once
 */
public class updatepass extends javax.swing.JFrame {

    /**
     * Creates new form changepass
     */
    public updatepass() {
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

        jPanel1 = new javax.swing.JPanel();
        ID = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        oldpass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        confirmpass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        ID.setBackground(new java.awt.Color(204, 204, 204));
        ID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.black, java.awt.Color.black));
        ID.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ID:");
        ID.add(jLabel6);
        jLabel6.setBounds(40, 30, 100, 30);

        id.setEditable(false);
        id.setBackground(new java.awt.Color(204, 204, 204));
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ID.add(id);
        id.setBounds(140, 30, 190, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SAVE");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        ID.add(jLabel9);
        jLabel9.setBounds(180, 200, 80, 30);

        oldpass.setBackground(new java.awt.Color(204, 204, 204));
        oldpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ID.add(oldpass);
        oldpass.setBounds(140, 70, 190, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Current password:");
        ID.add(jLabel2);
        jLabel2.setBounds(10, 70, 130, 30);

        newpass.setBackground(new java.awt.Color(204, 204, 204));
        newpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ID.add(newpass);
        newpass.setBounds(140, 110, 190, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("new password:");
        ID.add(jLabel3);
        jLabel3.setBounds(30, 110, 110, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("confirm password:");
        ID.add(jLabel4);
        jLabel4.setBounds(10, 150, 130, 30);

        confirmpass.setBackground(new java.awt.Color(204, 204, 204));
        confirmpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ID.add(confirmpass);
        confirmpass.setBounds(140, 150, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/arrow_circle_left_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        ID.add(jLabel1);
        jLabel1.setBounds(-320, 10, 60, 40);

        jPanel1.add(ID);
        ID.setBounds(40, 100, 360, 240);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("UPDATE PASSWORD");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 50, 290, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/chevron_left_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 10, 50, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
                  Session sess = Session.getInstance();
                  int Id = Integer.parseInt(id.getText());
                  String currentpass = sess.getPass();
                  String hashpass = passwordhashing(oldpass.getText());
                  String newPass = newpass.getText();
                  String retypepass = confirmpass.getText();
                  String hashnewPassword = passwordhashing(newPass);
                  
                  
                  if(oldpass.getText().isEmpty() || newpass.getText().isEmpty() || confirmpass.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "All fields are required!"); 
                    return;
                  }
                  if(!currentpass.equals(hashpass)){
                       JOptionPane.showMessageDialog(null, "Invalid current password!");
                       return;
                  }
                  if((newPass.length()<8) || (retypepass.length()<8)){
                      JOptionPane.showMessageDialog(null, "Password must atleast 8 Character!");
                      return;
                  }
                  if(!newPass.equals(retypepass)){
                      
                  JOptionPane.showMessageDialog(null, "Password doesn't Match!");
                  return;
                  }
                  
                 
                  dbConnector dbc = new dbConnector();
                  
                  
                    if(dbc.insertData("UPDATE tbl_userdetails SET u_password ='"+hashnewPassword+"' WHERE u_id ='"+Id+"'")){
                    JOptionPane.showMessageDialog(null,"Password Updated!");
                     this.dispose();
                  doctorsetting set = new doctorsetting();
                    set.setVisible(true);
                  
                      
                    }
                 
                  
                  
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        doctorsetting docset = new  doctorsetting();
        docset.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      Session sess = Session.getInstance();
        id.setText(""+sess.getId());
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(updatepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ID;
    public javax.swing.JTextField confirmpass;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField newpass;
    public javax.swing.JTextField oldpass;
    // End of variables declaration//GEN-END:variables
}
