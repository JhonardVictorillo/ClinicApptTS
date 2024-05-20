/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author once
 */
public class doctors extends javax.swing.JInternalFrame {

    /**
     * Creates new form doctors
     */
    public doctors() {
        initComponents();
        
        displaydata();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        Doctortbl.setDefaultEditor(Object.class, null);
    }
    
     public void displaydata(){
    try{
      dbConnector DBconnector = new dbConnector();
      ResultSet rs = DBconnector.getData("SELECT u_id,u_firstname , u_lastname,u_email, u_account ,u_status FROM tbl_userdetails WHERE u_account = 'DOCTOR' AND u_status ='Active'");
      Doctortbl.setModel(DbUtils.resultSetToTableModel(rs));
     TableColumnModel columnModel = Doctortbl.getColumnModel();
            columnModel.getColumn(0).setHeaderValue("Doctor ID");
            columnModel.getColumn(1).setHeaderValue("First Name");
            columnModel.getColumn(2).setHeaderValue("Last Name");
            columnModel.getColumn(3).setHeaderValue("Email");
            columnModel.getColumn(4).setHeaderValue("Account");
            columnModel.getColumn(5).setHeaderValue("Status");
           

            // Refresh the table UI
           Doctortbl.getTableHeader().repaint();  
    
    }catch(SQLException ex){
        System.out.println("Errors:"+ex.getMessage());
    
    }
    
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
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Doctortbl = new javax.swing.JTable();
        REFRESHBUT = new javax.swing.JPanel();
        refresh = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("DOCTORS LIST");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 260, 40);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(null);

        Doctortbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Doctortbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "LASTNAME", "FIRSTNAME", "CONTACTS", "ADDRESS", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(Doctortbl);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 720, 270);

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
        refresh.setBounds(10, 0, 70, 30);

        jPanel5.add(REFRESHBUT);
        REFRESHBUT.setBounds(10, 50, 90, 30);

        searchbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        searchbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchbarKeyTyped(evt);
            }
        });
        jPanel5.add(searchbar);
        searchbar.setBounds(520, 50, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SEARCH:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(520, 30, 80, 17);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 60, 750, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
//        displaydata();
    }//GEN-LAST:event_refreshMouseClicked

    private void REFRESHBUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REFRESHBUTMouseEntered
        REFRESHBUT.setBackground(bodycolor);
    }//GEN-LAST:event_REFRESHBUTMouseEntered

    private void REFRESHBUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REFRESHBUTMouseExited
        REFRESHBUT.setBackground(navcolor);
    }//GEN-LAST:event_REFRESHBUTMouseExited

    private void searchbarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyTyped
       String query = searchbar.getText();
       
            String searchquery = "SELECT u_id, u_firstname, u_lastname, u_email, u_account, u_status " +
                     "FROM tbl_userdetails " +
                     "WHERE u_account = 'DOCTOR' AND u_status = 'Active' AND " +
                     "(u_id LIKE '%" + query + "%' OR  u_firstname LIKE '%" + query + "%' OR u_lastname LIKE '%" + query + "%')";
       
           try {
            dbConnector connect = new dbConnector();
            ResultSet rs = connect.getData(searchquery);
          DefaultTableModel model = (DefaultTableModel) Doctortbl.getModel();
        model.setRowCount(0); 
        
        while (rs.next()) {
            Object[] rowData = {
                rs.getInt("u_id"),
                rs.getString("u_lastname"),
                rs.getString("u_firstname"),
                rs.getString("u_email"),
                rs.getString("u_account"),
                rs.getString("u_status")
            };
            model.addRow(rowData);
        }
        } catch(SQLException ex) {
            System.out.println("Error searching users: " + ex.getMessage());
        }
    }//GEN-LAST:event_searchbarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Doctortbl;
    private javax.swing.JPanel REFRESHBUT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField searchbar;
    // End of variables declaration//GEN-END:variables
}
