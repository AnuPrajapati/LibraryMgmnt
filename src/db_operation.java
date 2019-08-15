/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hasil
 */
public class db_operation {
    public ResultSet viewAllBookInformation(){
        Connection conn=null;
                Statement stmt=null;
                ResultSet rs=null;
        db_connect dbc=new db_connect();      
        conn=dbc.connectDatabase();
        String SQL="select * from book";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println("Select error:"+ex);
        }
       return rs;
    }
    public ResultSet viewFromBookTable(String name) {

        String query;
        ResultSet rs = null;
        try {
            db_connect dc = new db_connect();
           Connection conn= dc.connectDatabase();
            query = "select id,name,edition,publisher,quantity from \"book\" where first_name ilike ?";
                   

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name + "%");
            
            rs = ps.executeQuery();
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }
   
    public void addBookInformtaion(ArrayList data) {
        Connection conn=null;
        db_connect dbc=new db_connect();
        PreparedStatement ps=null;
                
        conn=dbc.connectDatabase();
        String SQL="Insert Into book(name,edition,publisher,quantity)"
                +"values(?,?,?,?)";
        
        try {
         
            ps= conn.prepareStatement(SQL); // no preparedStatement...
            ps.setString(1, data.get(0).toString()); //ps.setInteger();
            ps.setString(2, data.get(1).toString());
             ps.setString(3, data.get(2).toString()); //ps.setInteger();
            ps.setInt(4, Integer.parseInt(data.get(3).toString()));
           
        
           
           
            ps.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            System.out.println("Add Student SQL Error"+ex);
        }
    }
    
    public ResultSet searchBookInformation(String fname)
 {
     db_connect dbcon=new db_connect();
     PreparedStatement ps=null;
     Connection conn=null;
     ResultSet rs=null;
     conn=dbcon.connectDatabase();
     String  SQL="select * from book where name like ?";
        try {
            ps=conn.prepareStatement(SQL);
          ps.setString(1,fname+"%");
            rs=ps.executeQuery();
              
        } catch (SQLException ex) {
           //Logger.getLogger(NewView.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    return rs; 

     
  
 } 
   
     public void updatebookq(int quantity,int id) {
         quantity=quantity-1;
         
           db_connect dbcon = new db_connect();
            Connection conn = dbcon.connectDatabase(); 
        String SQL = "update book set quantity=? WHERE id=?";
        try {          
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setInt(1, quantity);
            ps.setInt(2, id);
           
            System.out.println("Hello");
            ps.executeUpdate();
            
          
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        } 
         dbcon.closeDBConnection();
    }
    
    
    
    
    
    
     public void updatebookTable(ArrayList dataToSave,int id) {
           db_connect dbcon = new db_connect();
            Connection conn = dbcon.connectDatabase(); 
        String SQL = "update book set name=?, edition=?, publisher=?, quantity=? WHERE id=?";
        try {          
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, dataToSave.get(0).toString());
            ps.setString(2, dataToSave.get(1).toString());
            ps.setString(3, dataToSave.get(2).toString());
             ps.setInt(4, Integer.parseInt(dataToSave.get(3).toString()));
         ps.setInt(5, id);
            System.out.println("Hello");
            ps.executeUpdate();
             JOptionPane.showMessageDialog(new javax.swing.JDialog(), "Record Updated");
          
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        } 
         dbcon.closeDBConnection();
    }
     public ArrayList viewById(String id){
        String SQL;        
        ArrayList data = new ArrayList();
        try {

            db_connect dc = new db_connect();
             Connection conn=dc.connectDatabase();
            SQL = "select id,name,edition,publisher,quantity from \"book\" where id=?;";
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                data.add(rs.getString("name"));
                data.add(rs.getString("edition"));
                data.add(rs.getString("publisher"));
                data.add(rs.getString("quantity"));
               
                data.add(rs.getString("em public ArrayList viewById(String id){\n" +
"        String SQL;        \n" +
"        ArrayList data = new ArrayList();\n" +
"        try {\n" +
"\n" +
"            db+connect dc = new d_cbonnect();\n" +
"            Connection conn=dc.connectDatabase();\n" +
"            SQL = \"select id,name,edition,publisher,quantity from \"book\" where id=?;\";\n" +
"            PreparedStatement ps = conn.prepareStatement(SQL);\n" +
"            ps.setInt(1, Integer.parseInt(id));\n" +
"            ResultSet rs = ps.executeQuery();\n" +
"            while (rs.next()) {\n" +
"                data.add(rs.getString(\"name\"));\n" +
"                data.add(rs.getString(\"edition\"));\n" +

"                data.add(rs.getString(\"publisher"));
                data.add(rs.getString("quantity"));
                data.add(id);
            }
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return data;
    }
 public ResultSet viewSingleBookInformation(String id){
        db_connect dbcon = new db_connect();
        PreparedStatement ps = null;  //to execute the query
        ResultSet rs = null;
        Connection conn = dbcon.connectDatabase();
        String SQL = "select * from book where id = ?";
        try {
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id)); //start from ?(1) so 1
            rs = ps.executeQuery(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
  }
}
