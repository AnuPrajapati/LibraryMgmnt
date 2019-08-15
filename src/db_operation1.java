
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hasil
 */
public class db_operation1 {
      public ResultSet viewAllStudentInformation(){
        Connection conn=null;
                Statement stmt=null;
                ResultSet rs=null;
        db_connect dbc=new db_connect();      
        conn=dbc.connectDatabase();
        String SQL="select * from student";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println("Select error:"+ex);
        }
       return rs;
    }
   
    public void addStudentInformation(ArrayList data) {
        Connection conn=null;
        db_connect dbc=new db_connect();
        PreparedStatement ps=null;
                
        conn=dbc.connectDatabase();
        String SQL="Insert Into student(firstname,lastname,phone,address,faculty,course,semester)"
                +"values(?,?,?,?,?,?,?)";
        
        try {
         
            ps= conn.prepareStatement(SQL); // no preparedStatement...
            ps.setString(1, data.get(0).toString()); //ps.setInteger();
            ps.setString(2, data.get(1).toString());
           ps.setLong(3, Long.parseLong(data.get(2).toString()));
                 
             ps.setString(4, data.get(3).toString()); //ps.setInteger();
            ps.setString(5, data.get(4).toString());
          
            ps.setString(6, data.get(5).toString());
                        ps.setString(7, data.get(6).toString());

    
     //ps.setInteger();
        
        ps.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            System.out.println("Add Student SQL Error"+ex);
            
        }
    }
    
//    public ResultSet searchStudentInformation(String fname, String lname)
// {
//     db_connect dbcon=new db_connect();
//     PreparedStatement ps=null;
//     Connection conn=null;
//     ResultSet rs=null;
//     conn=dbcon.connectDatabase();
//     String  SQL="select * from student where firstname, lastname like ?,?";
//        try {
//            ps=conn.prepareStatement(SQL);
//          ps.setString(1,fname+"%");
//          ps.setString(2,lname+"%");
//          
//            rs=ps.executeQuery();
//              
//        } catch (SQLException ex) {
//           //Logger.getLogger(NewView.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      
//    return rs; 
//
//     
//  
// } 
     public ResultSet searchStudentInformation(String fname)
 {
     db_connect dbcon=new db_connect();
     PreparedStatement ps=null;
     Connection conn=null;
     ResultSet rs=null;
     conn=dbcon.connectDatabase();
     String  SQL="select * from student where firstname ?";
        try {
            ps=conn.prepareStatement(SQL);
           
          ps.setString(1,fname+"%");
     
            System.out.println("asdwew");
            rs=ps.executeQuery();
              
        } catch (SQLException ex) {
           //Logger.getLogger(NewView.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    return rs; 

     
  
 } 
 public boolean DeleteStudentInformation(int id){
          boolean output=false;
        db_connect dbcon=new db_connect();
        PreparedStatement ps=null;
        Connection conn=dbcon.connectDatabase();
        String SQL="delete from student where id=?";
        try {
            ps=conn.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate(SQL); 
            output=true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
           }
public void updateToStudentTable(ArrayList data, int id){ //for primary key
            db_connect dbcon = new db_connect();
            Connection conn = dbcon.connectDatabase();
            
           String SQL = "update student set firstname = ?, lastname =?,"
                   + "phone = ?, address = ?,"
                   + "faculty = ?, course = ?, semester = ? where id =? ";
//              ? as per the column of the table
            try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, data.get(0).toString()); //index access garna (0) garne
            ps.setString(2, data.get(1).toString());
             ps.setLong(3, Long.parseLong(data.get(2).toString()));  
         
            ps.setString(4, data.get(3).toString());
            ps.setString(5, data.get(4).toString());
            ps.setString(6, data.get(5).toString());
             ps.setString(7, data.get(6).toString());
            
            ps.setInt(8, id);
               
            ps.executeUpdate();
            JOptionPane.showMessageDialog(new javax.swing.JDialog(), " Student Record Update"); // to bring message in normal classes
        } catch (SQLException ex) {
            System.out.println("Error:" +ex.toString());
        }
             
             dbcon.closeDBConnection();
    }
     public ResultSet viewSingleStudentInformation(String id){
        db_connect dbcon = new db_connect();
        PreparedStatement ps = null;  //to execute the query
        ResultSet rs = null;
        Connection conn = dbcon.connectDatabase();
        String SQL = "select * from student where id = ?";
        try {
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id)); //start from ?(1) so 1
            rs = ps.executeQuery(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(db_operation1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
        
    }
     
//          public ResultSet searchStudentInformation(String lname)
// {
//     db_connect dbcon=new db_connect();
//     PreparedStatement ps=null;
//     Connection conn=null;
//     ResultSet rs=null;
//     conn=dbcon.connectDatabase();
//     String  SQL="select * from student where lastname ?";
//        try {
//            ps=conn.prepareStatement(SQL);
//          ps.setString(1,lname+"%");
//     
//          
//            rs=ps.executeQuery();
//              
//        } catch (SQLException ex) {
//           //Logger.getLogger(NewView.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      
//    return rs; 
//
//     
//  
// } 
    
}
