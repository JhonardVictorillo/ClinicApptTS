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
       
       }catch(SQLException ex){
          System.out.println("Connection Error: "+ex);
       }
     
     
     
     }   
        
    
}
