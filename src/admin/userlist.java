/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author once
 */
public class userlist extends javax.swing.JFrame {

    /**
     * Creates new form userlist
     */
    public userlist() {
        initComponents();
        
        displaydata();
        
    }
        Color navcolor = new Color(0,204,204);
       Color bodycolor = new Color(153,204,255);
    
    
     public void displaydata(){
            try{
              dbConnector DBconnector = new dbConnector();
              ResultSet rs = DBconnector.getData("SELECT * FROM tbl_userdetails");
              usertable.setModel(DbUtils.resultSetToTableModel(rs));

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
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        EDITBUT = new javax.swing.JPanel();
        editbutton = new javax.swing.JLabel();
        DELETEBUT = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        REFRESHBUT = new javax.swing.JPanel();
        refresh = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Management");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 20, 260, 40);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(null);

        usertable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "LASTNAME", "FIRSTNAME", "USERNAME", "PASSWORD", "ACCOUNT TYPE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usertable);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 560, 100);

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
        EDITBUT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editbutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editbutton.setText("EDIT");
        editbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbuttonMouseClicked(evt);
            }
        });
        EDITBUT.add(editbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel5.add(EDITBUT);
        EDITBUT.setBounds(20, 40, 70, 30);

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

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        DELETEBUT.add(delete);
        delete.setBounds(10, 0, 50, 30);

        jPanel5.add(DELETEBUT);
        DELETEBUT.setBounds(110, 40, 70, 30);

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
        refresh.setBounds(10, 0, 55, 30);

        jPanel5.add(REFRESHBUT);
        REFRESHBUT.setBounds(200, 40, 70, 30);

        searchbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(searchbar);
        searchbar.setBounds(380, 40, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SEARCH:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(380, 20, 80, 17);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 70, 580, 400);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsImage/chevron_left_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 50, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseClicked
        int rowindex = usertable.getSelectedRow();
        if(rowindex<0){
            JOptionPane.showMessageDialog(null,"Please select an item!");

        }else{
            TableModel model = usertable.getModel();
            editform eForm = new editform();
            eForm.status.setSelectedItem(""+model.getValueAt(rowindex, 7));
            
            eForm.setVisible(true);
            this.dispose();

         
        }
    }//GEN-LAST:event_editbuttonMouseClicked

    private void EDITBUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITBUTMouseEntered
        EDITBUT.setBackground(bodycolor);
    }//GEN-LAST:event_EDITBUTMouseEntered

    private void EDITBUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITBUTMouseExited
        EDITBUT.setBackground(navcolor);
    }//GEN-LAST:event_EDITBUTMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = usertable.getSelectedRow();
        if(rowIndex<0){
            JOptionPane.showMessageDialog(null,"Please select an item to Delete!");
        }else{
            TableModel model = usertable.getModel();
            Object value = model.getValueAt(rowIndex,0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null,"Are you sure to Delete ID:"+id);
            if(a == JOptionPane.YES_OPTION){
                dbConnector dbc = new dbConnector();
                int u_id = Integer.parseInt(id);
                dbc.DeleteduserData(u_id,"tbl_userdetails");
                displaydata();
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void DELETEBUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEBUTMouseEntered
        DELETEBUT.setBackground(bodycolor);
    }//GEN-LAST:event_DELETEBUTMouseEntered

    private void DELETEBUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEBUTMouseExited
        DELETEBUT.setBackground(navcolor);
    }//GEN-LAST:event_DELETEBUTMouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        displaydata();
    }//GEN-LAST:event_refreshMouseClicked

    private void REFRESHBUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REFRESHBUTMouseEntered
        REFRESHBUT.setBackground(bodycolor);
    }//GEN-LAST:event_REFRESHBUTMouseEntered

    private void REFRESHBUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REFRESHBUTMouseExited
        REFRESHBUT.setBackground(navcolor);
    }//GEN-LAST:event_REFRESHBUTMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Admin_dashboard Adash = new Admin_dashboard();
        Adash.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(userlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DELETEBUT;
    private javax.swing.JPanel EDITBUT;
    private javax.swing.JPanel REFRESHBUT;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel editbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField searchbar;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}