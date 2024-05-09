package config;


import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class dbConnector {
    
   private Connection connect;
    
    public dbConnector(){
            try{
                connect =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicdb", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
    //Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = (Statement)connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
        
        //Function to save data
        public boolean insertData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
               return true;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
               return false;
            }
        }
        
        
     public void UpdateData(String sql){
       try{
       PreparedStatement pst = connect.prepareStatement(sql);
           int rowUpdated = pst.executeUpdate();
           if(rowUpdated>0){
          
               JOptionPane.showMessageDialog(null, "Data Updated successfully!");
           
           }else{
               System.out.println("Data Update Failed!");
           }
          pst.close(); 
       }catch(SQLException ex){
          System.out.println("Connection Error: "+ex);
       }
     
       
     }   
        
     
     public void deletedData(int id,String Table){
        try{
          PreparedStatement pst = connect.prepareStatement("DELETE FROM tbl_patients WHERE p_id=?");
          
            pst.setInt(1, id);
            int rowDeleted = pst.executeUpdate();
             if(rowDeleted>0){
              JOptionPane.showMessageDialog(null, "Data Deleted successfully!");   

             }else{
                 System.out.println("Deletion Failed!");
             }
             pst.close();

                }catch(SQLException ex){
                    System.out.println("Connection Error:"+ex);

                 }
                  }
     
     public void DeleteduserData(int id,String Table){
        try{
          PreparedStatement pst = connect.prepareStatement("DELETE FROM tbl_userdetails WHERE u_id=?");
          
            pst.setInt(1, id);
            int rowDeleted = pst.executeUpdate();
             if(rowDeleted>0){
              JOptionPane.showMessageDialog(null, "Data Deleted successfully!");   

             }else{
                 System.out.println("Deletion Failed!");
             }
             pst.close();

                }catch(SQLException ex){
                    System.out.println("Connection Error:"+ex);

                 }
                  }
     
     
      public void DeletedappTData(int id,String Table){
        try{
          PreparedStatement pst = connect.prepareStatement("DELETE FROM tbl_appointment WHERE appt_id=?");
          
            pst.setInt(1, id);
            int rowDeleted = pst.executeUpdate();
             if(rowDeleted>0){
              JOptionPane.showMessageDialog(null, "Data Deleted successfully!");   

             }else{
                 System.out.println("Deletion Failed!");
             }
             pst.close();

                }catch(SQLException ex){
                    System.out.println("Connection Error:"+ex);

                 }
                  }
     
     
    public int countAppointments() {
        int count = 0;
        try {
            PreparedStatement stmt = connect.prepareStatement("SELECT COUNT(*) FROM tbl_appointment");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }  
     
     
  public int countPatients() {
        int count = 0;
        try {
            PreparedStatement stmt = connect.prepareStatement("SELECT COUNT(*) FROM tbl_patients");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }


 public int countDoctors() {
        int count = 0;
        try {
            PreparedStatement stmt = connect.prepareStatement("SELECT COUNT(*) FROM tbl_userdetails WHERE u_account = 'DOCTOR'AND u_status ='Active'");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
  
    
    
    
}
