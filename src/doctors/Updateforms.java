/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors;

import static ADDFORMSINTERNALPAGE.Udetails.checkemail;
import static ADDFORMSINTERNALPAGE.Udetails.checkuser;
import config.Session;
import config.dbConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author once
 */
public class Updateforms extends javax.swing.JFrame {

    /**
     * Creates new form Updateforms
     */
    public Updateforms() {
        initComponents();
    }
    
     public String destination = "";
     File selectedFile;
    public String oldpath;
    public String path;
    
    
    
    
    public void userdetails(){
        Session sess = Session.getInstance();
        
        id.setText(""+sess.getId());
        acctype.setText(""+sess.getType());
        Fname.setText(""+sess.getFname());
        Lname.setText(""+sess.getLname());
        email.setText(""+sess.getEmail());
        uname.setText(""+sess.getUname());
    
    
    }
    
    
     public void getdata(int id){
      dbConnector dbc = new dbConnector();
     
      try{
          String sql = "SELECT * FROM tbl_userdetails WHERE u_id = '"+id+"'";
            ResultSet rs = dbc.getData(sql);
         if(rs.next()){
             Session sess = Session.getInstance();
             sess.setType(rs.getString("u_account"));
             sess.setFname(rs.getString("u_firstname"));
             sess.setLname(rs.getString("u_lastname"));
             sess.setId(rs.getInt("u_id"));
             sess.setUname(rs.getString("u_username"));
             sess.setEmail(rs.getString("u_email"));
             sess.setImage(rs.getString("u_images"));
         }
      
      }catch(SQLException ex){
          System.out.println("Inavalid Connection"+ex.getMessage());
      
      }
      
     }
     
     
      public static boolean checkemail(String email , int id){
     dbConnector dbc = new dbConnector();
     
     try{
         String sql = "SELECT * FROM tbl_userdetails Where u_email != '"+email+"' AND u_id = '"+id+"'";
          ResultSet rst = dbc.getData(sql);
          return rst.next();
     
     
     }catch(SQLException ex){
         System.out.println(ex.getMessage());
            return false;
     }
     }
     
     public static boolean checkuser(String username , int id){
     dbConnector dbc = new dbConnector();
     
     try{
         String sql = "SELECT * FROM tbl_userdetails Where u_username != '"+username+"' AND u_id = '"+id+"'";
          ResultSet rst = dbc.getData(sql);
          return rst.next();
     
     
     }catch(SQLException ex){
         System.out.println(ex.getMessage());
            return false;
     }
     }
     
     
     
       public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
      
       public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
       
        public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
        
         public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        acctype = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        selectbut = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        removebut = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.black, java.awt.Color.black));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("ID:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 30, 70, 20);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Accountype:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 70, 100, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Username:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 100, 90, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Firstname:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 140, 90, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Lastname:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 180, 90, 30);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Email:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 220, 50, 30);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(null);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SAVE");
        jLabel15.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 0, 110, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(180, 290, 110, 40);

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(null);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CANCEL");
        jLabel16.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel16);
        jLabel16.setBounds(0, 0, 100, 40);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(320, 290, 100, 40);

        id.setBackground(new java.awt.Color(204, 204, 204));
        id.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel2.add(id);
        id.setBounds(130, 20, 150, 30);

        acctype.setBackground(new java.awt.Color(204, 204, 204));
        acctype.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        acctype.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acctype.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        acctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctypeActionPerformed(evt);
            }
        });
        jPanel2.add(acctype);
        acctype.setBounds(130, 60, 150, 30);

        uname.setBackground(new java.awt.Color(204, 204, 204));
        uname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(uname);
        uname.setBounds(130, 100, 150, 30);

        Fname.setBackground(new java.awt.Color(204, 204, 204));
        Fname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        jPanel2.add(Fname);
        Fname.setBounds(130, 140, 150, 30);

        Lname.setBackground(new java.awt.Color(204, 204, 204));
        Lname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });
        jPanel2.add(Lname);
        Lname.setBounds(130, 180, 150, 30);

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(130, 220, 150, 30);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);
        jPanel5.add(picture);
        picture.setBounds(0, 0, 210, 140);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(340, 30, 210, 140);

        jPanel6.setBackground(new java.awt.Color(0, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(null);

        selectbut.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        selectbut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectbut.setText("SELECT");
        selectbut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        selectbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectbutMouseClicked(evt);
            }
        });
        jPanel6.add(selectbut);
        selectbut.setBounds(0, 0, 100, 30);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(340, 190, 100, 30);

        jPanel7.setBackground(new java.awt.Color(0, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        removebut.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        removebut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removebut.setText("REMOVE");
        removebut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removebutMouseClicked(evt);
            }
        });
        jPanel7.add(removebut);
        removebut.setBounds(0, 0, 90, 30);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(460, 190, 90, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 80, 590, 340);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("UPDATE INFO");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 30, 290, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void acctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acctypeActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       userdetails();
    }//GEN-LAST:event_formWindowActivated

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        dbConnector dbc = new dbConnector(); 
          try{
                if (checkemail(email.getText(),Integer.valueOf(id.getText()))){
            JOptionPane.showMessageDialog(null,"Email Already exist");
            return;
       
        } 
            if(checkuser(uname.getText(),Integer.valueOf(id.getText()))){
            
            JOptionPane.showMessageDialog(null,"Username Already exist");
            return;
            
        }
                if(dbc.insertData("UPDATE tbl_userdetails SET u_firstname = '"+Fname.getText()+"',"
                         + "u_lastname = '"+Lname.getText()+"',"
                         + "u_email = '"+email.getText()+"',"
                         + "u_username =  '"+uname.getText()+"'"
                        + ",u_account = '"+acctype.getText()+"',u_images = '"+destination+"'Where u_id = '"+Integer.valueOf(id.getText())+"'")){
                    
                    
                     if(destination.isEmpty()){
                    File existingfile =  new File(oldpath);
                   if(existingfile.exists()){
                   existingfile.delete();
                      }
                     }else{
                    if(!(oldpath.equals(path))){
                        imageUpdater(oldpath,path);
                    }
                     }
                    JOptionPane.showMessageDialog(null,"Data Updated!");
                    this.dispose();
                    getdata(Integer.valueOf(id.getText()));
                    
                    doctorsetting setting = new doctorsetting();
                    setting.setVisible(true);
                    
                   
         }
     
          }catch(Exception ex){
              System.out.println(""+ex);
          }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       doctorsetting docsetting = new doctorsetting();
       docsetting.setVisible(true);
        this.dispose();
      
       
    }//GEN-LAST:event_jLabel16MouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void selectbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectbutMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/images/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){
                    JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    destination = "";
                    path="";
                }else{
                    picture.setIcon(ResizeImage(path, null, picture));
                    selectbut.setEnabled(false);
                    removebut.setEnabled(true);

                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_selectbutMouseClicked

    private void removebutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removebutMouseClicked
        removebut.setEnabled(false);
        selectbut.setEnabled(true);
        picture.setIcon(null);
        destination ="";
        path = "";
    }//GEN-LAST:event_removebutMouseClicked

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
            java.util.logging.Logger.getLogger(Updateforms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updateforms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updateforms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updateforms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updateforms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField acctype;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JLabel picture;
    public javax.swing.JLabel removebut;
    public javax.swing.JLabel selectbut;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
