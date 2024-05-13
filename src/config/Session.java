/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author once
 */
public class Session {
    private static Session instance;
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String uname;
    private String type;
    private String pass;
    private String status;
    private String image;
    
    private Session(){
    //private cons pevents intance
    }

    public static synchronized Session getInstance(){
      if(instance == null){
         instance = new Session();
      }
      return instance;
    }
    
   

    public static boolean isinstanceEmpty(){
      return instance == null;
    }
    
    
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getStatus() {
        return status;
    } 

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
