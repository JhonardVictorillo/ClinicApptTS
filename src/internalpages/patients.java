/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import ADDFORMSINTERNALPAGE.*;
import config.dbConnector;
import java.awt.Color;
import user.desk_dashboard;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author once
 */
public class patients extends javax.swing.JInternalFrame {

    /**
     * Creates new form patients
     */
    public patients() {
        initComponents();
        
        
        displaydata();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
     Color navcolor = new Color(0,204,204);
    Color bodycolor = new Color(153,204,255);
    
    
   
    
    public void displaydata(){
    try{
      dbConnector DBconnector = new dbConnector();
      ResultSet rs = DBconnector.getData("SELECT * FROM tbl_patients");
      patienttable.setModel(DbUtils.resultSetToTableModel(rs));
    
    
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ADDBUT = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patienttable = new javax.swing.JTable();
        EDITBUT = new javax.swing.JPanel();
        editbutton = new javax.swing.JLabel();
        DELETEBUT = new javax.swing.JPanel();
        deletebutton = new javax.swing.JLabel();
        REFRESHBUT = new javax.swing.JPanel();
        refresh = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("PATIENT RECORDS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 260, 40);

        ADDBUT.setBackground(new java.awt.Color(0, 204, 204));
        ADDBUT.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));
        ADDBUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADDBUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADDBUTMouseExited(evt);
            }
        });
        ADDBUT.setLayout(null);

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        ADDBUT.add(add);
        add.setBounds(0, 0, 70, 30);

        jPanel1.add(ADDBUT);
        ADDBUT.setBounds(39, 100, 70, 30);

        searchbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(searchbar);
        searchbar.setBounds(440, 100, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SEARCH:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 80, 80, 17);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(null);

        patienttable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        patienttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "LASTNAME", "FIRSTNAME", "AGE", "GENDER", "BIRTHDATE", "CONTACTS", "ADDRESS"
            }
        ));
        jScrollPane1.setViewportView(patienttable);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 620, 100);

        EDITBUT.setBackground(new java.awt.Color(0, 204, 204));
        EDITBUT.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));
        EDITBUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EDITBUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EDITBUTMouseExited(evt);
            }
        });
        EDITBUT.setLayout(null);

        editbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editbutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editbutton.setText("EDIT");
        editbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbuttonMouseClicked(evt);
            }
        });
        EDITBUT.add(editbutton);
        editbutton.setBounds(0, 0, 70, 30);

        jPanel5.add(EDITBUT);
        EDITBUT.setBounds(120, 40, 70, 30);

        DELETEBUT.setBackground(new java.awt.Color(0, 204, 204));
        DELETEBUT.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));
        DELETEBUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DELETEBUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DELETEBUTMouseExited(evt);
            }
        });
        DELETEBUT.setLayout(null);

        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletebutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deletebutton.setText("DELETE");
        deletebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebuttonMouseClicked(evt);
            }
        });
        DELETEBUT.add(deletebutton);
        deletebutton.setBounds(0, 0, 70, 30);

        jPanel5.add(DELETEBUT);
        DELETEBUT.setBounds(210, 40, 70, 30);

        REFRESHBUT.setBackground(new java.awt.Color(0, 204, 204));
        REFRESHBUT.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));
        REFRESHBUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REFRESHBUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REFRESHBUTMouseExited(evt);
            }
        });
        REFRESHBUT.setLayout(null);

        refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setText("REFRESH");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        REFRESHBUT.add(refresh);
        refresh.setBounds(0, 0, 70, 30);

        jPanel5.add(REFRESHBUT);
        REFRESHBUT.setBounds(300, 40, 70, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 60, 640, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
//        desk_dashboard DeskDash = new desk_dashboard();
//           DeskDash.setVisible(true);
//       patientform pform = new patientform();
//        DeskDash.maindesktop.add(pform).setVisible(true);
  addpatientform pform = new addpatientform();
       pform.setVisible(true);
        pform.action = "ADD";
        pform.p_save.setText("SAVE");
    }//GEN-LAST:event_addMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
       displaydata();
    }//GEN-LAST:event_refreshMouseClicked

    private void EDITBUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITBUTMouseEntered
        EDITBUT.setBackground(bodycolor);
    }//GEN-LAST:event_EDITBUTMouseEntered

    private void EDITBUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITBUTMouseExited
        EDITBUT.setBackground(navcolor);
    }//GEN-LAST:event_EDITBUTMouseExited

    private void ADDBUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDBUTMouseEntered
       ADDBUT.setBackground(bodycolor);
    }//GEN-LAST:event_ADDBUTMouseEntered

    private void ADDBUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDBUTMouseExited
         ADDBUT.setBackground(navcolor);
    }//GEN-LAST:event_ADDBUTMouseExited

    private void DELETEBUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEBUTMouseEntered
        DELETEBUT.setBackground(bodycolor);
    }//GEN-LAST:event_DELETEBUTMouseEntered

    private void DELETEBUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEBUTMouseExited
        DELETEBUT.setBackground(navcolor);
    }//GEN-LAST:event_DELETEBUTMouseExited

    private void REFRESHBUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REFRESHBUTMouseEntered
        REFRESHBUT.setBackground(bodycolor);
    }//GEN-LAST:event_REFRESHBUTMouseEntered

    private void REFRESHBUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REFRESHBUTMouseExited
         REFRESHBUT.setBackground(navcolor);
    }//GEN-LAST:event_REFRESHBUTMouseExited

    private void editbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseClicked
        int rowindex = patienttable.getSelectedRow();
        if(rowindex<0){
            JOptionPane.showMessageDialog(null,"Please select an item!");
        
        }else{
        TableModel model = patienttable.getModel();
        addpatientform pForm = new addpatientform();
        pForm.p_id.setText(""+model.getValueAt(rowindex, 0));
        pForm.fname.setText(""+model.getValueAt(rowindex, 1));
        pForm.lname.setText(""+model.getValueAt(rowindex, 2));
         pForm.age.setText(""+model.getValueAt(rowindex, 3));
         
        pForm.gender = model.getValueAt(rowindex, 4).toString(); 
        
            String gend = model.getValueAt(rowindex, 4).toString(); 
            if(gend.equals("MALE")){
            pForm.male.setSelected(true);
            }
            if(gend.equals("FEMALE")){
            pForm.female.setSelected(true);
            }
       
        pForm.birthdate.setText(""+model.getValueAt(rowindex, 5));
         pForm.contact.setText(""+model.getValueAt(rowindex, 6));
        pForm.address.setText(""+model.getValueAt(rowindex, 7));
       
        desk_dashboard DeskDash = new desk_dashboard();
          
         pForm.setVisible(true);
         pForm.action = "Update";
         pForm.p_save.setText("UPDATE");
        }
    }//GEN-LAST:event_editbuttonMouseClicked

    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseClicked
        int rowIndex = patienttable.getSelectedRow();
        if(rowIndex<0){
            JOptionPane.showMessageDialog(null,"Please select an item to Delete!");
        }else{
            TableModel model = patienttable.getModel();
            Object value = model.getValueAt(rowIndex,0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null,"Are you sure to Delete ID:"+id);
            if(a == JOptionPane.YES_OPTION){
                dbConnector dbc = new dbConnector();
                int p_id = Integer.parseInt(id);
                dbc.deletedData(p_id,"tbl_patient");
                displaydata();
            }
        }
    }//GEN-LAST:event_deletebuttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADDBUT;
    private javax.swing.JPanel DELETEBUT;
    private javax.swing.JPanel EDITBUT;
    private javax.swing.JPanel REFRESHBUT;
    private javax.swing.JLabel add;
    private javax.swing.JLabel deletebutton;
    private javax.swing.JLabel editbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patienttable;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField searchbar;
    // End of variables declaration//GEN-END:variables
}
