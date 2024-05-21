/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import clinicapptts.LoginForm;
import static clinicapptts.Registration.passwordhashing;
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
public class admin_Addacc extends javax.swing.JFrame {

    /**
     * Creates new form admin_Addacc
     */
    public admin_Addacc() {
        initComponents();
    }
    
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public static String Email,username;
    public String action;
    
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
    
    
    
    boolean DuplicateCheck(){
    dbConnector dbc = new dbConnector();
        try{
     String query ="SELECT * FROM tbl_userdetails WHERE u_username = '"+uname.getText()+"' OR u_email = '"+email.getText()+"'";
      ResultSet rs = dbc.getData(query);
    
      if(rs.next()){
          Email = rs.getString("u_email");
         if(Email.equals(email.getText())){
            JOptionPane.showMessageDialog(null, "Email already exist!");
            email.setText("");
            
         }
          username = rs.getString("u_username");
         if(username.equals(uname.getText())){
            JOptionPane.showMessageDialog(null, "Username already exist!");  
            uname.setText("");
         }
          return true; 
          
        }else{
          return false;
      }
      
                   
    }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
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
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        acctype = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        selectbut = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        removebut = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        u_save = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.blue));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.black));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("First name:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 54, 80, 20);

        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(fname);
        fname.setBounds(130, 50, 190, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Last name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(43, 100, 80, 16);

        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lname);
        lname.setBounds(130, 90, 190, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Email:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 140, 41, 16);

        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(email);
        email.setBounds(130, 130, 190, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Username:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(42, 176, 80, 20);

        uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(uname);
        uname.setBounds(130, 170, 190, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Password:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 220, 70, 16);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Account Type:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 250, 110, 30);

        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(pass);
        pass.setBounds(130, 210, 190, 30);

        acctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select", "DOCTOR", "DESK", "Admin", " " }));
        acctype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(acctype);
        acctype.setBounds(130, 250, 190, 30);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("User ID:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 10, 70, 30);

        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.setEnabled(false);
        jPanel2.add(id);
        id.setBounds(130, 10, 190, 30);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "please select status", "Active", "Inactive" }));
        status.setToolTipText("");
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        status.setName(""); // NOI18N
        jPanel2.add(status);
        status.setBounds(130, 290, 190, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Status:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(50, 290, 70, 30);

        jPanel3.setLayout(null);
        jPanel3.add(image);
        image.setBounds(-2, 2, 190, 200);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(390, 70, 190, 200);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        selectbut.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        selectbut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectbut.setText("SELECT");
        selectbut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        selectbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectbutMouseClicked(evt);
            }
        });
        jPanel4.add(selectbut);
        selectbut.setBounds(0, 0, 100, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(380, 290, 100, 30);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        removebut.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        removebut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removebut.setText("REMOVE");
        removebut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removebutMouseClicked(evt);
            }
        });
        jPanel5.add(removebut);
        removebut.setBounds(0, 0, 90, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(500, 290, 90, 30);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(null);

        u_save.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        u_save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_save.setText("LABEL");
        u_save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        u_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                u_saveMouseClicked(evt);
            }
        });
        jPanel6.add(u_save);
        u_save.setBounds(0, 0, 100, 30);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(120, 350, 100, 30);

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CANCEL");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel9);
        jLabel9.setBounds(0, 0, 100, 30);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(240, 350, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 70, 620, 410);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Account");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 30, 230, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void u_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_saveMouseClicked

                  
       
        if(action.equals("NEW")){
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() 
               || uname.getText().isEmpty() 
               || pass.getText().isEmpty()){
                  JOptionPane.showMessageDialog(null, "All fields are required!"); 
                  
                }else if(pass.getText().length()<8){
              JOptionPane.showMessageDialog(null, "Password must atleast 8 characters!"); 
                    
             }else if(DuplicateCheck()){
             System.out.println("Duplicate Exist");
                    
            }else{
        
        dbConnector dbc = new dbConnector();
       String hashpass = passwordhashing(pass.getText());
       if(dbc.insertData("INSERT INTO tbl_userdetails(u_firstname,u_lastname,u_email,u_username,u_password,u_account,u_status,u_images) VALUES ('"+fname.getText()+"','"+lname.getText()+"','"+email.getText()+"','"+uname.getText()+"','"+hashpass+"','"+acctype.getSelectedItem()+"','"+status.getSelectedItem()+"','"+destination+"')")){
        
           try{
           Files.copy(selectedFile.toPath(),new File(destination).toPath(),StandardCopyOption.REPLACE_EXISTING);
       JOptionPane.showMessageDialog(null, "Created Successfully!");
       
       userlist ulist = new userlist();
       ulist.setVisible(true);
       this.dispose();
       
           }catch(IOException ex){
               System.out.println("Insert image Error!:"+ex);
           }
    }else{
       JOptionPane.showMessageDialog(null, "Connection Error!");
                
            }
           }
        }else if(action.equals("Update")){
            
           
             if (checkemail(email.getText(),Integer.valueOf(id.getText()))){
            JOptionPane.showMessageDialog(null,"Email Already exist");
            return;
       
        } 
            if(checkuser(uname.getText(),Integer.valueOf(id.getText()))){
            
            JOptionPane.showMessageDialog(null,"Username Already exist");
            return;
            
        }
        
        
             
           dbConnector dbc = new dbConnector();
           
//            String hash = passwordhashing(pass.getText());
            boolean result = dbc.insertData("UPDATE tbl_userdetails SET u_firstname = '"+fname.getText()+"',u_lastname = '"+lname.getText()+"',u_email = '"+email.getText()+"',u_username = '"+uname.getText()+"',u_account = '"+acctype.getSelectedItem()+"',u_status = '"+status.getSelectedItem()+"',u_images = '"+destination+"' Where u_id = '"+id.getText()+"'");
            
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
             JOptionPane.showMessageDialog(null,"Successfully Updated!");
             
            userlist ulist = new userlist();
           ulist.setVisible(true);
           this.dispose();
        
        }
    }//GEN-LAST:event_u_saveMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       if(action.equals("Update")){
       pass.setEditable(false);
       }
       
    }//GEN-LAST:event_formWindowActivated

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        userlist ulist = new userlist();
        ulist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

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
                            image.setIcon(ResizeImage(path, null, image));
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
        image.setIcon(null);
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
            java.util.logging.Logger.getLogger(admin_Addacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_Addacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_Addacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_Addacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_Addacc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> acctype;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    public javax.swing.JTextField id;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JTextField lname;
    public javax.swing.JPasswordField pass;
    public javax.swing.JLabel removebut;
    public javax.swing.JLabel selectbut;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JLabel u_save;
    public javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
