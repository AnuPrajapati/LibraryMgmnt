

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
public class db_operation3 {
    
      public ResultSet viewAllIssue(){
        Connection conn=null;
                Statement stmt=null;
                ResultSet rs=null;
        db_connect dbc=new db_connect();      
        conn=dbc.connectDatabase();
        String SQL="select * from issue";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println("Select error:"+ex);
        }
       return rs;
    }
        public ResultSet viewAllReturn(){
        Connection conn=null;
                Statement stmt=null;
                ResultSet rs=null;
        db_connect dbc=new db_connect();      
        conn=dbc.connectDatabase();
        String SQL="select * from returnbook";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println("Select error:"+ex);
        }
       return rs;
    }
     public ResultSet searchStudentIssue(String id)
     {
         db_connect dbcon=new db_connect();
     PreparedStatement ps=null;
     Connection conn=null;
     ResultSet rs=null;
     conn=dbcon.connectDatabase();
     return rs;
     }
      public void addIssueInfo(String issueda, String returnda,String id3, String id1) throws ParseException {
        Connection conn=null;
        db_connect dbc=new db_connect();
        PreparedStatement ps=null;
                
        conn=dbc.connectDatabase();
        String SQL="Insert Into issue(issuedate,returndate,stdid,bid)"
                +"values(?,?,?,?)";
        
        try {
         
            ps= conn.prepareStatement(SQL); // no preparedStatement...
             //ps.setInteger();
            
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date issueDate=sdf.parse(issueda);
            java.util.Date returnDate=sdf.parse(returnda);
            ps.setDate(1, new java.sql.Date(issueDate.getTime()));
             ps.setDate(2, new java.sql.Date(issueDate.getTime()));
              
             ps.setInt(3, Integer.parseInt(id3)); //ps.setInteger();
            ps.setInt(4, Integer.parseInt(id1));
          
           

    
     //ps.setInteger();
        
        ps.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            System.out.println("Add Student SQL Error"+ex);
            
        }
    }
      public void addReturnInfo( String returnda,String id3 ) throws ParseException {
        Connection conn=null;
        db_connect dbc=new db_connect();
        PreparedStatement ps=null;
                
        conn=dbc.connectDatabase();
        String SQL="Insert Into returnbook(issueid,returnningdate)"
                +"values(?,?)";
        
        try {
         
            ps= conn.prepareStatement(SQL); // no preparedStatement...
             //ps.setInteger();
              ps.setInt(1, Integer.parseInt(id3));
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date returnningdate=sdf.parse(returnda);
           
            ps.setDate(2, new java.sql.Date(returnningdate.getTime()));
 
              
           ; //ps.setInteger();
           
          
           

    
     //ps.setInteger();
        
        ps.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            System.out.println("Add Student SQL Error"+ex);
            
        }
    }
       public boolean DeleteissueInformation(int id){
          boolean output=false;
        db_connect dbcon=new db_connect();
        PreparedStatement ps=null;
        Connection conn=dbcon.connectDatabase();
        String SQL="delete from issue where issue_id=?";
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
       public void updateToIssueTable(ArrayList data, int id) throws ParseException{ //for primary key
            db_connect dbcon = new db_connect();
            Connection conn = dbcon.connectDatabase();
            
           String SQL = "update into issue issuedate = ?, returndate =?,"
                   + "stdid = ?, bid = ? where issue_id=? ";
                  
//              ? as per the column of the table
            try {
            PreparedStatement ps = conn.prepareStatement(SQL);
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = sdf.parse(data.get(0).toString());
            ps.setDate(1, new java.sql.Date(d.getTime()));
              SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d1 = sd.parse(data.get(1).toString());
            ps.setDate(2, new java.sql.Date(d1.getTime()));
            
            
       
            ps.setString(3, data.get(2).toString());
             ps.setString(4, data.get(3).toString());
            
            ps.setInt(5, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(new javax.swing.JDialog(), " Issue Record Update"); // to bring message in normal classes
        } catch (SQLException ex) {
            System.out.println("Error:" +ex.toString());
        }
             
             dbcon.closeDBConnection();
    }
            public ResultSet viewSingleIssueInformation(int id){
        db_connect dbcon = new db_connect();
        PreparedStatement ps = null;  //to execute the query
        ResultSet rs = null;
        Connection conn = dbcon.connectDatabase();
        String SQL = "select * from issue where issue_id = ?";
        try {
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, id); //start from ?(1) so 1
            rs = ps.executeQuery(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(db_operation3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
        
    }

}
