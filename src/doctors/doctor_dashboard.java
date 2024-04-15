/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors;

import admin.*;
import clinicapptts.LoginForm;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author NoName
 */
public class doctor_dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Admin_dashboard
     */
    public doctor_dashboard() {
        initComponents();
    }
     Color navcolor = new Color(0,204,204);
    Color bodycolor = new Color(153,204,255);
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        APPOINTMENT = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SCHEDULE = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SETTINGS = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LOGOUT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(null);

        APPOINTMENT.setBackground(new java.awt.Color(0, 204, 204));
        APPOINTMENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                APPOINTMENTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                APPOINTMENTMouseExited(evt);
            }
        });
        APPOINTMENT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APPOINTMENT LIST");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        APPOINTMENT.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel4.add(APPOINTMENT);
        APPOINTMENT.setBounds(140, 450, 150, 40);

        SCHEDULE.setBackground(new java.awt.Color(0, 204, 204));
        SCHEDULE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SCHEDULEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SCHEDULEMouseExited(evt);
            }
        });
        SCHEDULE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SCHEDULE ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        SCHEDULE.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel4.add(SCHEDULE);
        SCHEDULE.setBounds(340, 450, 150, 40);

        SETTINGS.setBackground(new java.awt.Color(0, 204, 204));
        SETTINGS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SETTINGSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SETTINGSMouseExited(evt);
            }
        });
        SETTINGS.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SETTINGS");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        SETTINGS.add(jLabel5);
        jLabel5.setBounds(0, 0, 150, 40);

        jPanel4.add(SETTINGS);
        SETTINGS.setBounds(520, 450, 150, 40);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/icons8-appointment-100.png"))); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(0, 0, 130, 110);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(150, 330, 130, 110);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/icons8-schedule-100 (1).png"))); // NOI18N
        jPanel7.add(jLabel9);
        jLabel9.setBounds(0, 0, 130, 110);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(350, 330, 130, 110);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(null);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/icons8-settings-100.png"))); // NOI18N
        jPanel9.add(jLabel10);
        jLabel10.setBounds(0, 0, 130, 110);

        jPanel4.add(jPanel9);
        jPanel9.setBounds(530, 330, 130, 110);

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel10.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DOCTORS");
        jPanel10.add(jLabel11);
        jLabel11.setBounds(650, 10, 100, 23);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/doctor.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 210, 230);

        jPanel10.add(jPanel2);
        jPanel2.setBounds(580, 40, 210, 190);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Clinic Care ");
        jPanel10.add(jLabel1);
        jLabel1.setBounds(40, 10, 480, 60);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Appointment Tracker ");
        jPanel10.add(jLabel12);
        jLabel12.setBounds(50, 70, 450, 60);

        jLabel13.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html>A tool designed to manage appointments for healthcare providers. It helps clinics schedule patients, send reminders, and track appointment history. This can improve efficiency, reduce wait times, and provide a better patient experience.<html>");
        jPanel10.add(jLabel13);
        jLabel13.setBounds(20, 130, 540, 100);
        jLabel13.getAccessibleContext().setAccessibleDescription("");

        Name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("jLabel4");
        Name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel10.add(Name);
        Name.setBounds(600, 240, 180, 30);

        jPanel4.add(jPanel10);
        jPanel10.setBounds(0, 0, 800, 290);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 40, 800, 500);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        LOGOUT.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LOGOUT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/logout_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        LOGOUT.setText("LOG OUT");
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LOGOUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LOGOUTMouseExited(evt);
            }
        });
        jPanel3.add(LOGOUT);
        LOGOUT.setBounds(650, 0, 150, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 800, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void APPOINTMENTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPOINTMENTMouseEntered
        APPOINTMENT.setBackground(bodycolor);
    }//GEN-LAST:event_APPOINTMENTMouseEntered

    private void APPOINTMENTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPOINTMENTMouseExited
        APPOINTMENT.setBackground(navcolor);
    }//GEN-LAST:event_APPOINTMENTMouseExited

    private void SCHEDULEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SCHEDULEMouseEntered
        SCHEDULE.setBackground(bodycolor);
    }//GEN-LAST:event_SCHEDULEMouseEntered

    private void SCHEDULEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SCHEDULEMouseExited
        SCHEDULE.setBackground(navcolor);
    }//GEN-LAST:event_SCHEDULEMouseExited

    private void SETTINGSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SETTINGSMouseEntered
        SETTINGS.setBackground(bodycolor);
    }//GEN-LAST:event_SETTINGSMouseEntered

    private void SETTINGSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SETTINGSMouseExited
        SETTINGS.setBackground(navcolor);
    }//GEN-LAST:event_SETTINGSMouseExited

    private void LOGOUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseEntered
      LOGOUT.setBackground(bodycolor);
      
    }//GEN-LAST:event_LOGOUTMouseEntered

    private void LOGOUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseExited
         LOGOUT.setBackground(navcolor);
    }//GEN-LAST:event_LOGOUTMouseExited

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
         LoginForm LForm = new LoginForm();
       LForm.setVisible(true);
       this.dispose();
       JOptionPane.showMessageDialog(null,"Signout successfully");
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       ApptList Alist = new ApptList();
       Alist.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        schedule sched = new schedule();
        sched.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       doctorsetting set = new  doctorsetting();
        set.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(doctor_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel APPOINTMENT;
    private javax.swing.JLabel LOGOUT;
    public javax.swing.JLabel Name;
    private javax.swing.JPanel SCHEDULE;
    private javax.swing.JPanel SETTINGS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
