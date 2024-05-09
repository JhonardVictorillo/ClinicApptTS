/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author once
 */
public class updateform extends javax.swing.JFrame {

    /**
     * Creates new form updateform
     */
    public updateform() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        apptstatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newdiagnosis = new javax.swing.JTextArea();
        apptID = new javax.swing.JTextField();
        UPDATE = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CANCEL = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        docID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.black, java.awt.Color.black));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STATUS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 90, 80, 30);

        apptstatus.setBackground(new java.awt.Color(204, 204, 204));
        apptstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "please select status ", "Scheduled", "Completed", "Ongoing", "Cancel", " " }));
        jPanel2.add(apptstatus);
        apptstatus.setBounds(20, 120, 150, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("NEW DIAGNOSIS:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(220, 10, 150, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APPOINTMENT ID:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 20, 150, 18);

        newdiagnosis.setColumns(20);
        newdiagnosis.setRows(5);
        newdiagnosis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(newdiagnosis);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(220, 40, 360, 310);

        apptID.setEditable(false);
        apptID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        apptID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(apptID);
        apptID.setBounds(20, 50, 150, 30);

        UPDATE.setBackground(new java.awt.Color(0, 204, 204));
        UPDATE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UPDATEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UPDATEMouseExited(evt);
            }
        });
        UPDATE.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SAVE");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        UPDATE.add(jLabel5);
        jLabel5.setBounds(20, 0, 80, 30);

        jPanel2.add(UPDATE);
        UPDATE.setBounds(30, 180, 120, 30);

        CANCEL.setBackground(new java.awt.Color(0, 204, 204));
        CANCEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CANCEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CANCELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CANCELMouseExited(evt);
            }
        });
        CANCEL.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CANCEL");
        CANCEL.add(jLabel6);
        jLabel6.setBounds(20, 0, 80, 30);

        jPanel2.add(CANCEL);
        CANCEL.setBounds(30, 230, 120, 30);

        docID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        docID.setText("jLabel8");
        jPanel2.add(docID);
        docID.setBounds(10, 354, 170, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 60, 600, 390);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EVALUATION OF PATIENT  ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 10, 460, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseClicked
      
    }//GEN-LAST:event_UPDATEMouseClicked

    private void UPDATEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseEntered
       UPDATE.setBackground(bodycolor);
    }//GEN-LAST:event_UPDATEMouseEntered

    private void UPDATEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseExited
       UPDATE.setBackground(navcolor);
    }//GEN-LAST:event_UPDATEMouseExited

    private void CANCELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANCELMouseEntered
         CANCEL.setBackground(bodycolor);
    }//GEN-LAST:event_CANCELMouseEntered

    private void CANCELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANCELMouseExited
       CANCEL.setBackground(navcolor);
    }//GEN-LAST:event_CANCELMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//          dbConnector dbc = new dbConnector();
//         
//          dbc.UpdateData("UPDATE tbl_appointment SET apptStatus = '"+apptstatus.getSelectedItem()+"' WHERE appt_id ='"+apptID+"'");
//                
//           dbc.insertData("INSERT TO diagnosis(pastdiagnosis,newdiagnosis) VALUES('"+pastdiagnosis.getText()+"','"+newdiagnosis.getText()+"')");
//          JOptionPane.showMessageDialog(null,"Updated succesfully! & Save successfully");
//                    this.dispose();
          
         try {
             
             Session sess = Session.getInstance();
             int docid = sess.getId();
        dbConnector dbc = new dbConnector();
        String status = (String) apptstatus.getSelectedItem();

        // Get the appointment ID from the text field (assuming it's read-only)
        int appointmentID = Integer.parseInt(apptID.getText());

        // Update appointment status
        String updateQuery = "UPDATE tbl_appointment SET apptStatus = '" + status + "' WHERE appt_id = " + appointmentID;
        dbc.UpdateData(updateQuery);
        
        
        String patientIDQuery = "SELECT p_id FROM tbl_appointment WHERE appt_id = " + appointmentID;
         ResultSet resultSet = dbc.getData(patientIDQuery);

        int patientID = -1; // Default value
        if (resultSet.next()) {
        patientID = resultSet.getInt("p_id");
    }
      
          
        String newDiagnosisText = newdiagnosis.getText();
       
        String insertQuery = "INSERT INTO diagnosis( newdiagnosis,p_id,u_id) VALUES( '" + newDiagnosisText + "','"+patientID+"','"+docid+"')";
        dbc.insertData(insertQuery);

        JOptionPane.showMessageDialog(null, "Appointment updated successfully!");
        this.dispose();
        ApptList Alist = new ApptList();
        Alist.setVisible(true);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid appointment ID");
    }catch (Exception ex) {
        JOptionPane.showMessageDialog(null,"Error updating appointment: " + ex.getMessage());
        ex.printStackTrace();
         
    }
          
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      Session sess = Session.getInstance();
        docID.setText("DOCTOR ID:"+sess.getId());
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
            java.util.logging.Logger.getLogger(updateform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CANCEL;
    private javax.swing.JPanel UPDATE;
    public javax.swing.JTextField apptID;
    public javax.swing.JComboBox<String> apptstatus;
    private javax.swing.JLabel docID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea newdiagnosis;
    // End of variables declaration//GEN-END:variables
}
