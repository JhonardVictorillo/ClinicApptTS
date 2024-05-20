/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADDFORMSINTERNALPAGE;

import config.PanelPrinter;
import config.dbConnector;
import internalpages.reports_dash;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import user.desk_dashboard;

/**
 *
 * @author once
 */
public class apptReports1 extends javax.swing.JFrame {

    /**
     * Creates new form patientReports
     */
    public apptReports1() {
        initComponents();
        displaydata();
         apptTableReports.setDefaultEditor(Object.class, null);
    }
    
     public void displaydata(){
    try{
      dbConnector DBconnector = new dbConnector();
      ResultSet rs = DBconnector.getData("SELECT tbl_appointment.appt_id,tbl_patients.p_firstname,tbl_patients.p_lastname,tbl_appointment.apptType,tbl_appointment.date,tbl_appointment.time ,tbl_userdetails.u_id,tbl_userdetails.u_firstname,tbl_userdetails.u_lastname,tbl_appointment.apptStatus FROM `tbl_appointment` "
              + "INNER JOIN tbl_patients ON tbl_appointment.p_id = tbl_patients.p_id "
              + "INNER JOIN tbl_userdetails ON tbl_appointment.u_id = tbl_userdetails.u_id WHERE apptStatus = 'Completed';");
      apptTableReports.setModel(DbUtils.resultSetToTableModel(rs));
    
     TableColumnModel columnModel = apptTableReports.getColumnModel();
            columnModel.getColumn(0).setHeaderValue("Appointment ID");
            columnModel.getColumn(1).setHeaderValue("First Name");
            columnModel.getColumn(2).setHeaderValue("Last Name");
            columnModel.getColumn(3).setHeaderValue("Type");
            columnModel.getColumn(4).setHeaderValue("Date");
            columnModel.getColumn(5).setHeaderValue("Time");
            columnModel.getColumn(6).setHeaderValue("Doctor ID");
            columnModel.getColumn(7).setHeaderValue("Doctor Firstname");
            columnModel.getColumn(8).setHeaderValue("Doctor Lastname");
            columnModel.getColumn(9).setHeaderValue("Status");
            

            // Refresh the table UI
           apptTableReports.getTableHeader().repaint();
           
    }catch(SQLException ex){
        System.out.println("Errors:"+ex.getMessage());
    
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        apptreportstable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        apptTableReports = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIEW INFO");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 0, 100, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 40, 120, 40);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRINT TABLE");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 120, 40);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 420, 120, 40);

        searchbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarActionPerformed(evt);
            }
        });
        searchbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchbarKeyTyped(evt);
            }
        });
        jPanel2.add(searchbar);
        searchbar.setBounds(610, 50, 180, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("search:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(610, 30, 60, 20);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REFRESH");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(14, 0, 90, 40);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(170, 40, 120, 40);

        apptTableReports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apptTableReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "appointment ID", "firstname", "lastname", "Type", "Date", "Time", "Doctor Id", "firstname", "lastname", "status"
            }
        ));
        jScrollPane1.setViewportView(apptTableReports);

        javax.swing.GroupLayout apptreportstableLayout = new javax.swing.GroupLayout(apptreportstable);
        apptreportstable.setLayout(apptreportstableLayout);
        apptreportstableLayout.setHorizontalGroup(
            apptreportstableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, apptreportstableLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        apptreportstableLayout.setVerticalGroup(
            apptreportstableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(apptreportstableLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel2.add(apptreportstable);
        apptreportstable.setBounds(10, 130, 810, 270);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 70, 830, 480);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("APPOINTMENT REPORTS");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 20, 360, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/arrow_circle_left_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(6, 4, 60, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbarActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       desk_dashboard dashB = new desk_dashboard();
       dashB.setVisible(true);
        reports_dash dashreports = new reports_dash();
       dashB.maindesktop.add(dashreports).setVisible(true);
        
       this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       int rowindex = apptTableReports.getSelectedRow();
    if (rowindex < 0) {
        JOptionPane.showMessageDialog(null, "Please select an item!");
    } else {
        try {
            TableModel model = apptTableReports.getModel();
            
            int appointmentID = Integer.parseInt(model.getValueAt(rowindex, 0).toString());

            
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT tbl_patients.*, "
                    + "tbl_userdetails.u_firstname , tbl_userdetails.u_lastname ,tbl_userdetails.u_email,tbl_appointment.date "
                    + "FROM `tbl_appointment` "
                    + "INNER JOIN tbl_patients ON tbl_appointment.p_id = tbl_patients.p_id "
                    + "INNER JOIN tbl_userdetails ON tbl_appointment.u_id = tbl_userdetails.u_id "
                    + "WHERE tbl_appointment.appt_id = " + appointmentID);

            // Check if the ResultSet contains data
            if (rs.next()) {
                // Extract patient details
                String firstName = rs.getString("p_firstname");
                String lastName = rs.getString("p_lastname");
                String age =rs.getString("p_age");  
                String contact = rs.getString("p_contact");
                String birthdate = rs.getString("p_dateofbirth");
                String gender = rs.getString("p_gender");
                String address = rs.getString("p_address");
               
                String docFirstName = rs.getString("u_firstname");
                String docLastName = rs.getString("u_lastname");
                 String docEmail = rs.getString("u_email");
                 String date = rs.getString("date");
                 
                 String patientID = rs.getString("p_id");
                 
                  ResultSet diagnosisRS = dbc.getData("SELECT * FROM diagnosis WHERE p_id = '" + patientID + "'");
                
                  
                  StringBuilder diagnosisText = new StringBuilder();
                 while (diagnosisRS.next()) {
                    String newDiagnosis = diagnosisRS.getString("newdiagnosis");
                    if (newDiagnosis != null && !newDiagnosis.isEmpty()) {
                        diagnosisText.append("New Diagnosis: ").append(newDiagnosis).append("\n");
                    }
                }
                  
              
                // Populate JLabels with patient, doctor details, and diagnosis
                patientViewinfo viewinfo = new patientViewinfo();
                viewinfo.pfname.setText(""+firstName);
                viewinfo.plname.setText(""+lastName);
                viewinfo.pAge.setText(""+age);
                viewinfo.pGender.setText(""+gender);
                viewinfo.pBirthdate.setText(""+birthdate);
                viewinfo.pContact.setText(""+contact);
                viewinfo.pAddress.setText(""+address);
                viewinfo.dfname.setText(""+docFirstName);
                viewinfo.dlname.setText(""+docLastName);
                viewinfo.demail.setText(""+docEmail);
                viewinfo.pfname.setText(""+firstName);
                viewinfo.pfname.setText(""+firstName);
                viewinfo.date.setText(""+date);
                viewinfo.Diagnosis.setText(diagnosisText.toString());
                
                viewinfo.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No data found for selected appointment ID");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void searchbarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyTyped
       String query = searchbar.getText();
       String searchQuery = "SELECT tbl_appointment.appt_id, tbl_patients.p_firstname, tbl_patients.p_lastname, " +
            "tbl_appointment.apptType, tbl_appointment.date, tbl_appointment.time, tbl_userdetails.u_id, " +
            "tbl_userdetails.u_firstname, tbl_userdetails.u_lastname, tbl_appointment.apptStatus " +
            "FROM tbl_appointment " +
            "INNER JOIN tbl_patients ON tbl_appointment.p_id = tbl_patients.p_id " +
            "INNER JOIN tbl_userdetails ON tbl_appointment.u_id = tbl_userdetails.u_id " +
            "WHERE tbl_appointment.appt_id LIKE '%" + query + "%' " +
            "OR tbl_patients.p_firstname LIKE '%" + query + "%' " +
            "OR tbl_patients.p_lastname LIKE '%" + query + "%'";
       
          try {
        dbConnector connect = new dbConnector();
        ResultSet rs = connect.getData(searchQuery);
        DefaultTableModel model = (DefaultTableModel) apptTableReports.getModel();
        model.setRowCount(0); 
        
        while (rs.next()) {
            Object[] rowData = {
                rs.getInt("appt_id"),
                rs.getString("p_firstname"),
                rs.getString("p_lastname"),
                rs.getString("apptType"),
                rs.getString("date"),
                rs.getString("time"),
                rs.getString("u_id"),
                rs.getString("u_firstname"),
                rs.getString("u_lastname"),
                rs.getString("apptStatus")
            };
            model.addRow(rowData);
        }

        // Refresh the table UI
        apptTableReports.getTableHeader().repaint();

    } catch(SQLException ex) {
        System.out.println("Error searching appointments: " + ex.getMessage());
    }
       
       
       
    }//GEN-LAST:event_searchbarKeyTyped

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      JPanel printpanel = new JPanel();
       PanelPrinter Pprint = new PanelPrinter(apptreportstable);
       Pprint.printPanel();

    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(apptReports1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apptReports1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apptReports1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apptReports1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apptReports1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable apptTableReports;
    private javax.swing.JPanel apptreportstable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchbar;
    // End of variables declaration//GEN-END:variables
}
