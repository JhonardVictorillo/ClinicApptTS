package user;


import ADDFORMSINTERNALPAGE.userinfo;
import clinicapptts.LoginForm;
import config.Session;
import config.dbConnector;
import internalpages.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class desk_dashboard extends javax.swing.JFrame {

    /**
     * Creates new form desk_dashboard
     */
    public desk_dashboard() {
         initComponents();
         
          dashboard dash = new dashboard();
        maindesktop.add(dash).setVisible(true);
        date();
        time();
        
        
    }
    
     private void date(){
        
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
         
        String dt = sdf.format(d);
        date.setText(dt);
             
    }
    
        Timer t;
        SimpleDateFormat st;
    
    private void time(){

        t = new Timer(0, (ActionEvent ae) -> {
            Date dt = new Date();
            st = new SimpleDateFormat("hh:mm:ss a");
            
            String tm = st.format(dt);
            time.setText(tm);
        });
        
        t.start();
        
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NAV = new javax.swing.JPanel();
        DASHBOARD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PATIENT = new javax.swing.JPanel();
        patientButton = new javax.swing.JLabel();
        APPOINTMENT = new javax.swing.JPanel();
        apptButton = new javax.swing.JLabel();
        DOCTOR = new javax.swing.JPanel();
        doctorButton = new javax.swing.JLabel();
        REPORTS = new javax.swing.JPanel();
        reportsButton = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JPanel();
        LAGOUTBUTTON = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        details = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NAV.setBackground(new java.awt.Color(0, 204, 204));
        NAV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        NAV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DASHBOARD.setBackground(new java.awt.Color(0, 204, 204));
        DASHBOARD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DASHBOARDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DASHBOARDMouseExited(evt);
            }
        });
        DASHBOARD.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        DASHBOARD.add(jLabel1);
        jLabel1.setBounds(0, 1, 190, 40);

        NAV.add(DASHBOARD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 40));

        PATIENT.setBackground(new java.awt.Color(0, 204, 204));
        PATIENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PATIENTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PATIENTMouseExited(evt);
            }
        });
        PATIENT.setLayout(null);

        patientButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        patientButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/group_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        patientButton.setText("PATIENTS");
        patientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientButtonMouseEntered(evt);
            }
        });
        PATIENT.add(patientButton);
        patientButton.setBounds(30, 0, 130, 30);

        NAV.add(PATIENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, 40));

        APPOINTMENT.setBackground(new java.awt.Color(0, 204, 204));
        APPOINTMENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                APPOINTMENTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                APPOINTMENTMouseExited(evt);
            }
        });
        APPOINTMENT.setLayout(null);

        apptButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        apptButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apptButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/icons8-appointment-48.png"))); // NOI18N
        apptButton.setText("APPOINTMENTS");
        apptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apptButtonMouseClicked(evt);
            }
        });
        APPOINTMENT.add(apptButton);
        apptButton.setBounds(12, 0, 160, 40);

        NAV.add(APPOINTMENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 40));

        DOCTOR.setBackground(new java.awt.Color(0, 204, 204));
        DOCTOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DOCTORMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DOCTORMouseExited(evt);
            }
        });
        DOCTOR.setLayout(null);

        doctorButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        doctorButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/icons8-doctor-48.png"))); // NOI18N
        doctorButton.setText("DOCTORS");
        doctorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorButtonMouseClicked(evt);
            }
        });
        DOCTOR.add(doctorButton);
        doctorButton.setBounds(10, 0, 160, 40);

        NAV.add(DOCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 40));

        REPORTS.setBackground(new java.awt.Color(0, 204, 204));
        REPORTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REPORTSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REPORTSMouseExited(evt);
            }
        });
        REPORTS.setLayout(null);

        reportsButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        reportsButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/icons8-business-report-48.png"))); // NOI18N
        reportsButton.setText("REPORTS");
        reportsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsButtonMouseClicked(evt);
            }
        });
        REPORTS.add(reportsButton);
        reportsButton.setBounds(20, 0, 160, 40);

        NAV.add(REPORTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, 40));

        LOGOUT.setBackground(new java.awt.Color(0, 204, 204));
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LOGOUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LOGOUTMouseExited(evt);
            }
        });
        LOGOUT.setLayout(null);

        LAGOUTBUTTON.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LAGOUTBUTTON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LAGOUTBUTTON.setText("SIGN OUT");
        LAGOUTBUTTON.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LAGOUTBUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LAGOUTBUTTONMouseClicked(evt);
            }
        });
        LOGOUT.add(LAGOUTBUTTON);
        LAGOUTBUTTON.setBounds(10, 0, 110, 30);

        NAV.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 120, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(null);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/clinic logo 290px.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(0, 0, 230, 120);

        NAV.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));

        jPanel1.add(NAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 530));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(null);

        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/account_circle_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsMouseClicked(evt);
            }
        });
        jPanel3.add(details);
        details.setBounds(730, 0, 50, 40);

        Name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Name.setText("jLabel3");
        Name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel3.add(Name);
        Name.setBounds(630, 0, 100, 40);

        time.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        time.setText("jLabel5");
        time.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(time);
        time.setBounds(240, 10, 120, 30);

        date.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        date.setText("jLabel5");
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(date);
        date.setBounds(60, 10, 110, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("TIME:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 10, 60, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("DATE:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(180, 10, 60, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 780, 40));

        maindesktop.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(maindesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 780, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DASHBOARDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseEntered
        DASHBOARD.setBackground(bodycolor);
    }//GEN-LAST:event_DASHBOARDMouseEntered

    private void DASHBOARDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseExited
        DASHBOARD.setBackground(navcolor);
    }//GEN-LAST:event_DASHBOARDMouseExited

    private void PATIENTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PATIENTMouseEntered
        PATIENT.setBackground(bodycolor);
    }//GEN-LAST:event_PATIENTMouseEntered

    private void PATIENTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PATIENTMouseExited
       PATIENT.setBackground(navcolor);
    }//GEN-LAST:event_PATIENTMouseExited

    private void APPOINTMENTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPOINTMENTMouseEntered
       APPOINTMENT.setBackground(bodycolor);
    }//GEN-LAST:event_APPOINTMENTMouseEntered

    private void APPOINTMENTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPOINTMENTMouseExited
        APPOINTMENT.setBackground(navcolor);
    }//GEN-LAST:event_APPOINTMENTMouseExited

    private void DOCTORMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOCTORMouseEntered
       DOCTOR.setBackground(bodycolor);
    }//GEN-LAST:event_DOCTORMouseEntered

    private void DOCTORMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOCTORMouseExited
        DOCTOR.setBackground(navcolor);
    }//GEN-LAST:event_DOCTORMouseExited

    private void REPORTSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseEntered
       REPORTS.setBackground(bodycolor);
    }//GEN-LAST:event_REPORTSMouseEntered

    private void REPORTSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseExited
        REPORTS.setBackground(navcolor);
    }//GEN-LAST:event_REPORTSMouseExited

    private void LOGOUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseEntered
        LOGOUT.setBackground(bodycolor);
    }//GEN-LAST:event_LOGOUTMouseEntered

    private void LOGOUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseExited
        LOGOUT.setBackground(navcolor);
    }//GEN-LAST:event_LOGOUTMouseExited

    private void LAGOUTBUTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LAGOUTBUTTONMouseClicked
         LoginForm LForm = new LoginForm();
       LForm.setVisible(true);
       this.dispose();
       JOptionPane.showMessageDialog(null,"Signout successfully");
    }//GEN-LAST:event_LAGOUTBUTTONMouseClicked

    private void patientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseClicked
      patients Patients = new patients();
      maindesktop.add(Patients).setVisible(true);
    }//GEN-LAST:event_patientButtonMouseClicked

    private void apptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apptButtonMouseClicked
        appointment Appointment = new appointment();
        maindesktop.add(Appointment).setVisible(true);
    }//GEN-LAST:event_apptButtonMouseClicked

    private void doctorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonMouseClicked
        doctors Doctors = new doctors();
        maindesktop.add(Doctors).setVisible(true);
    }//GEN-LAST:event_doctorButtonMouseClicked

    private void reportsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsButtonMouseClicked
        reports_dash RepDash = new reports_dash();
        maindesktop.add(RepDash).setVisible(true);
    }//GEN-LAST:event_reportsButtonMouseClicked

    private void patientButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseEntered
     
       
    }//GEN-LAST:event_patientButtonMouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dashboard dash = new dashboard();
        maindesktop.add(dash).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMouseClicked
        
        userinfo uinfo = new userinfo();
        uinfo.setVisible(true);
        
        
        
    
         
        
//       String userdata = Name.getText();
//         dbConnector connect = new dbConnector();
//        
//       try{
//        String sql =("SELECT * FROM tbl_userdetails WHERE u_firstname = '"+userdata+"'");
//        ResultSet rs = connect.getData(sql);
//          if(rs.next()){
//              
//            userinfo uinfo = new userinfo();
//            
//             uinfo.id.setText(rs.getString("u_id"));
//             uinfo.Fname.setText(rs.getString("u_firstname"));
//             uinfo.Lname.setText(rs.getString("u_lastname"));
//             uinfo.Email.setText(rs.getString("u_email"));
//             uinfo.pass.setText(rs.getString("u_password"));
//             uinfo.acctype.setText(rs.getString("u_account"));
//             uinfo.uname.setText(rs.getString("u_username"));
//             uinfo.setVisible(true);
//          
//          }
//        
//         }catch(SQLException e){
//         
//         }
//       
//       
      
      
    }//GEN-LAST:event_detailsMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
      
        if(sess.getId() ==0){
        JOptionPane.showMessageDialog(null,"No Account login first");
        LoginForm lForm = new LoginForm();
        lForm.setVisible(true);
        this.dispose();
        }else{
          Name.setText(""+sess.getFname());
        }
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
            java.util.logging.Logger.getLogger(desk_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desk_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desk_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desk_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desk_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel APPOINTMENT;
    private javax.swing.JPanel DASHBOARD;
    private javax.swing.JPanel DOCTOR;
    private javax.swing.JLabel LAGOUTBUTTON;
    private javax.swing.JPanel LOGOUT;
    private javax.swing.JPanel NAV;
    public javax.swing.JLabel Name;
    private javax.swing.JPanel PATIENT;
    private javax.swing.JPanel REPORTS;
    private javax.swing.JLabel apptButton;
    private javax.swing.JLabel date;
    private javax.swing.JLabel details;
    private javax.swing.JLabel doctorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel patientButton;
    private javax.swing.JLabel reportsButton;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
